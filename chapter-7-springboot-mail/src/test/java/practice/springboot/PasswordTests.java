package practice.springboot;

import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author kevin.lv
 * @date 2024/12/17 16:29
 *  注意：测试时将yml中的配置修改为：test-connection: false
 *  注意：测试时将yml中的配置修改为：test-connection: false
 *  注意：测试时将yml中的配置修改为：test-connection: false
 */
public class PasswordTests extends EmailApplicationTests {

    @Autowired
    private StringEncryptor encryptor;

    /**
     * 生成加密密码
     */
    @Test
    public void testGeneratePassword() {
        // 你的邮箱密码
        String password = "your-email-password";
        // 加密后的密码(注意：配置上去的时候需要加 ENC(加密密码))
        String encryptPassword = encryptor.encrypt(password);
        String decryptPassword = encryptor.decrypt("tYdUSyMKBZWL3r5nlVYgW9AB4FaFdyaa15JAyyN7TPaOcPKZNJTNAzb7TExxUk0/w8hmfu8t5zII8n1vL4t9Zg==");

        System.out.println("password = " + password);
        System.out.println("encryptPassword = " + encryptPassword);
        System.out.println("decryptPassword = " + decryptPassword);
    }
}
