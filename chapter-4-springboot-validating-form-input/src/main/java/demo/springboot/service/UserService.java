package demo.springboot.service;

import demo.springboot.model.User;

import java.util.List;

/**
 * @author kevin.lv
 * @date 2024/11/28 11:18
 */
public interface UserService {

    /**
     * 获取用户列表
     *
     * @return
     */
    List<User> getUserList();

    /**
     * 新增用户
     *
     * @param user
     * @return
     */
    User insertByUser(User user);

    /**
     * 新增用户
     *
     * @param id
     * @return
     */
    User findById(Long id);

    /**
     * 修改用户
     *
     * @param user
     * @return
     */
    User update(User user);

    /**
     * 删除用户
     *
     * @param id
     * @return
     */
    User delete(Long id);
}
