package practice.springboot.web;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import practice.springboot.domain.User;
import practice.springboot.service.UserService;


/**
 * @author kevin.lv
 * @date 2024/12/3 15:58
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    private final Logger log = Logger.getLogger(this.getClass());
    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public Page<User> getUserPage(Pageable pageable) {
        log.info("......");
        log.warn("warn....................");
        log.error("error....................");
        log.debug("debug....................");
        return userService.findByPage(pageable);
    }

}
