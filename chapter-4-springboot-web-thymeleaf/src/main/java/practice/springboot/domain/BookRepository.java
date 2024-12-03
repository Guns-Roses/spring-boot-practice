package practice.springboot.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author kevin.lv
 * @date 2024/12/3 10:27
 */
public interface BookRepository extends JpaRepository<Book, Long> {

}
