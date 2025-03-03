package practice.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import practice.springboot.service.OssService;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kevin.lv
 * @date 2025/3/3 19:13
 */
@RestController
@RequestMapping("/oss")
public class OssController {

    @Autowired
    private OssService OssService;

    /**
     * 上传文件接口
     *
     * @param file 文件
     * @return 文件访问 URL
     */
    @PostMapping("/upload")
    public Map<String, Object> uploadFile(@RequestParam("file") MultipartFile file) {
        String fileUrl = OssService.uploadFile(file);
        Map<String, Object> result = new HashMap<>();
        if (fileUrl != null) {
            result.put("code", 200);
            result.put("msg", "上传成功");
            result.put("fileUrl", fileUrl);
        } else {
            result.put("code", 500);
            result.put("msg", "上传失败");
        }
        return result;
    }

    /**
     * 删除文件接口
     *
     * @param fileName 文件名
     * @return 删除结果
     */
    @DeleteMapping("/delete")
    public Map<String, Object> deleteFile(@RequestParam("fileName") String fileName) {
        boolean isDeleted = OssService.deleteFile(fileName);
        Map<String, Object> result = new HashMap<>();
        if (isDeleted) {
            result.put("code", 200);
            result.put("msg", "删除成功");
        } else {
            result.put("code", 500);
            result.put("msg", "删除失败");
        }
        return result;
    }
}

