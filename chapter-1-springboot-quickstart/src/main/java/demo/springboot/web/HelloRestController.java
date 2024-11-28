package demo.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kevin.lv
 * @date 2024/11/14 20:40
 */
@RestController
public class HelloRestController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String helloWorld(){
        return "Hello World!";
    }
}
