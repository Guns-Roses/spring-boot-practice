package practice.springboot.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import practice.springboot.domain.User;

/**
 * @author kevin.lv
 * @date 2024/12/3 15:57
 */
public interface UserService {

    /**
     * 获取用户分页列表
     *
     * @param pageable
     * @return
     */
    Page<User> findByPage(Pageable pageable);

}
