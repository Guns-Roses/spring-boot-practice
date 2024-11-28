package demo.springboot.mapper;

import demo.springboot.model.Book;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * @author kevin.lv
 * @date 2024/11/18 14:39
 */
@Mapper
public interface BookMapper {

    /**
     * 获取 Book 列表
     * @return
     */
     List<Book> getBookList();

    /**
     * 获取 book 信息
     * @param name
     * @return
     */
     Book getBookInfo( String name);

    /**
     * 新增 Book
     * @param book
     * @return
     */
     int addBook(Book book);

    /**
     * 修改 Book
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
