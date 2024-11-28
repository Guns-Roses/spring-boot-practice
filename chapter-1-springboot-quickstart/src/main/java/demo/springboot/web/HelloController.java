package demo.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author kevin.lv
 * @date 2024/11/14 20:40
 */
@Controller
@RequestMapping(value = "/demo" , method = RequestMethod.GET)
public class HelloController {

    @ResponseBody
    @RequestMapping(value = "/hello" , method = RequestMethod.GET)
    public String hello(){
        return "Hello World!";
    }

}
