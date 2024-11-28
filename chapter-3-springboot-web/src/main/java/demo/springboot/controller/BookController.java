package demo.springboot.controller;

import demo.springboot.model.Book;
import demo.springboot.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author kevin.lv
 * @date 2024/11/18 14:28
 */
@RestController
@RequestMapping(value = "/book")
public class BookController {

    private final Logger LOG = LoggerFactory.getLogger(BookController.class);

    @Autowired
    BookService bookService;

    @RequestMapping(value = "/getBookList",method = RequestMethod.GET)
    public List<Book> getBookList(){
        return bookService.getBookList();
    }

    @RequestMapping(value = "/getBookInfo",method = RequestMethod.POST)
    public Book getBookInfo(@RequestParam String name){
        System.out.println("Received name: " + name);
        return bookService.getBookInfo(name);
    }

    @RequestMapping(value = "/addBook",method = RequestMethod.POST)
    public int addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @RequestMapping(value = "/updateBook",method = RequestMethod.POST)
    public int updateBook(@RequestBody Book book){
        return bookService.updateBook(book);
    }

    @RequestMapping(value = "/delBook",method = RequestMethod.POST)
    public int delBook(@RequestParam  Long id){
        return bookService.delBook(id);
    }

}
