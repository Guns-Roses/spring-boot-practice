package practice.springboot.service;

/**
 * @author kevin.lv
 * @date 2025/3/3 19:44
 */

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import practice.springboot.config.OssConfig;

import java.io.InputStream;

@Service
public class OssService {

    @Autowired
    private OssConfig ossConfig;

    /**
     * 上传文件到 OSS
     *
     * @param file 文件
     * @return 文件访问 URL
     */
    public String uploadFile(MultipartFile file) {
        // 1. 读取 OSS 配置
        String endpoint = ossConfig.getEndpoint();
        String accessKeyId = ossConfig.getAccessKeyId();
        String accessKeySecret = ossConfig.getAccessKeySecret();
        String bucketName = ossConfig.getBucketName();

        // 2. 生成唯一的文件名
        String Filename = file.getOriginalFilename();
        //assert Filename != null;
        //String fileExtension = originalFilename.substring(Filename.lastIndexOf("."));
        //String newFileName = UUID.randomUUID() + fileExtension;

        // 3. 创建 OSS 客户端
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        try {
            // 4. 获取文件输入流
            InputStream inputStream = file.getInputStream();

            // 5. 上传文件
            ossClient.putObject(bucketName, Filename, inputStream);

            // 6. 拼接文件 URL
            return "https://" + bucketName + "." + endpoint.replace("https://", "")
                    + "/" + Filename;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            // 7. 关闭 OSS 客户端
            ossClient.shutdown();
        }
    }

    /**
     * 删除 OSS 文件
     *
     * @param fileName 文件名
     * @return 是否删除成功
     */
    public boolean deleteFile(String fileName) {
        // 1. 读取 OSS 配置
        String endpoint = ossConfig.getEndpoint();
        String accessKeyId = ossConfig.getAccessKeyId();
        String accessKeySecret = ossConfig.getAccessKeySecret();
        String bucketName = ossConfig.getBucketName();

        // 2. 创建 OSS 客户端
        OSS ossClient = new OSSClientBuilder().build(endpoint,
                accessKeyId, accessKeySecret);

        try {
            // 3. 先检查文件是否存在
            boolean exists = ossClient.doesObjectExist(bucketName, fileName);
            if (!exists) {
                System.out.println("文件不存在: " + fileName);
                return false;
            }
            // 4. 删除文件
            ossClient.deleteObject(bucketName, fileName);

            // 5. 再次检查是否删除成功
            exists = ossClient.doesObjectExist(bucketName, fileName);
            return !exists;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            // 4. 关闭 OSS 客户端
            ossClient.shutdown();
        }
    }
}

