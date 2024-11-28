
package demo.springboot.web;

import demo.springboot.config.BookProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kevin.lv
 * @date 2024/11/14 21:20
 */
@RestController
public class WebController {

    @Autowired
    BookProperties bookProperties;

    @RequestMapping(value = "/web/hello",method = RequestMethod.GET)
    public String sayWeb(){
        return "hello "+ bookProperties.getWriter() + " is writing "
                + bookProperties.getName() + " !";
    }

}
