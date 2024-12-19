package practice.springboot;

import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author kevin.lv
 * @date 2024/12/17 16:29
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
        String decryptPassword = encryptor.decrypt("RNwjcgJaHNSy5HPRSm4bJMW6bPHVnC5iZVdrXYhhBJ+pTDNCz9gDKwYUjXtSk0OP");

        System.out.println("password = " + password);
        System.out.println("encryptPassword = " + encryptPassword);
        System.out.println("decryptPassword = " + decryptPassword);
    }
}
