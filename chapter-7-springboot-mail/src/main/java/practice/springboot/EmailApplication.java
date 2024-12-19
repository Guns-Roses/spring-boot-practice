package practice.springboot;


import org.jasypt.util.text.AES256TextEncryptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author kevin.lv
 * @date 2024/12/16 17:37
 */
@SpringBootApplication
public class EmailApplication {

    public static void main(String[] args) {
        AES256TextEncryptor textEncryptors = new AES256TextEncryptor();
        // 设置密钥
        textEncryptors.setPassword("practice.springboot");
        String encryptedPassword = textEncryptors.encrypt("your-email-password");
        System.out.println("Encrypted Password: " + encryptedPassword);

        SpringApplication.run(EmailApplication.class);
    }
}
