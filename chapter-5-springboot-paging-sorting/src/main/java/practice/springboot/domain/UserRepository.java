package practice.springboot.domain;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author kevin.lv
 * @date 2024/12/3 16:03
 */
public interface UserRepository extends PagingAndSortingRepository<User,Long> {



}
