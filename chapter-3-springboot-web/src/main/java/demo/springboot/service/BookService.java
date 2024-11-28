package demo.springboot.service;

import demo.springboot.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kevin.lv
 * @date 2024/11/18 14:28
 */

public interface BookService  {

    /**
     * 获取 Book 列表
     * @return
     */
     List<Book> getBookList();

    /**
     * 根据书名获取具体信息
     * @param name
     * @return
     */
    Book getBookInfo(String name);

    /**
     * 新增 Book
     * @param book
     * @return
     */
    int addBook(Book book);

    /**
     * 更新 Book
     * @param book
     * @return
     */
    int updateBook(Book book);

    /**
     * 删除 Book
     * @param id
     * @return
     */
    int delBook(Long id);
}
