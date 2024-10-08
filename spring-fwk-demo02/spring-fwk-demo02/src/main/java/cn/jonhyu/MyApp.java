package cn.jonhyu;

import cn.jonhyu.dao.BookDao;
import cn.jonhyu.entity.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class MyApp {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
//        DataSource dataSource = context.getBean("dataSource", DataSource.class);
//        System.out.println(dataSource.getConnection());

//        BookDao bookDao = context.getBean("bookDaoimpl",BookDao.class);
//        List<Book> books = bookDao.findAll();
//        for (Book book : books) {
//            System.out.println(book);
//        }
        BookDao bookDao = context.getBean(BookDao.class);
        System.out.println(bookDao.getClass().getName());
        List<Book> books = bookDao.findAll();
        for (Book book : books) {
            System.out.println(book);
        }
    }
}