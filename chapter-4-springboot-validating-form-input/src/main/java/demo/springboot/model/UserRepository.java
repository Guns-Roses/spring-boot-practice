package demo.springboot.model;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author kevin.lv
 * @date 2024/11/28 11:30
 */
public interface UserRepository extends JpaRepository<User,Long> {

}
