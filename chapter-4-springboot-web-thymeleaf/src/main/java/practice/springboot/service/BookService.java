package practice.springboot.service;

import practice.springboot.domain.Book;

import java.util.List;

/**
 * @author kevin.lv
 * @date 2024/12/3 10:13
 */
public interface BookService {


    /**
     * 获取所有 Book
     *
     * @return
     */
    List<Book> findAll();


    /**
     * 新增 Book
     *
     * @param book
     * @return
     */
    Book insertByBook(Book book);


    /**
     * 更新 Book
     *
     * @param book
     * @return
     */
    Book update(Book book);


    /**
     * 删除 Book
     *
     * @param id
     * @return
     */
    Book delete(Long id);


    /**
     * 获取 Book
     *
     * @param id
     * @return
     */
    Book findById(Long id);

}
