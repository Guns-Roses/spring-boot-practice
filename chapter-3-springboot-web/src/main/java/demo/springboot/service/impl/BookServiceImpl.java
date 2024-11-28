package demo.springboot.service.impl;

import demo.springboot.mapper.BookMapper;
import demo.springboot.model.Book;
import demo.springboot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kevin.lv
 * @date 2024/11/18 14:29
 */
@Service
public class BookServiceImpl implements BookService {


    @Autowired
    BookMapper bookMapper;

    @Override
    public List<Book> getBookList() {
        return bookMapper.getBookList();
    }

    @Override
    public Book getBookInfo( String name) {
        return bookMapper.getBookInfo(name);
    }

    @Override
    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }

    @Override
    public int updateBook(Book book) {
        return bookMapper.updateBook(book);
    }

    @Override
    public int delBook(Long id) {
        return bookMapper.delBook(id);
    }
}
