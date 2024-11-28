package demo.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.*;
import java.io.Serializable;

/**
 * @author kevin.lv
 * @date 2024/11/27 9:29
 */
@Entity
public class User implements Serializable {

    /**
     * 用户Id
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * 用户姓名
     */
    @NotEmpty(message = "姓名不能为空")
    @Size(min = 2, max = 32, message = "姓名长度必须大于2且小于32")
    private String name;

    /**
     * 年龄
     */
    @NotNull(message = "年龄不能为空")
    @Min(value = 0, message = "年龄大于 0")
    @Max(value = 200, message = "年龄不能大于 200")
    private int age;

    /**
     * 出生时间
     */
    @NotEmpty(message = "出生时间不能为空")
    private String birthday;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public User(String name, Integer age, String birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public User() {}

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
