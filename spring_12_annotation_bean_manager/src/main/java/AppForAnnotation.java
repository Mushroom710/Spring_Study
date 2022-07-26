// @DATE 2022/7/26
// @TIME 10:22
// @AUTHOR zhangzhi
// @DESCRIPTION

import com.example.config.SpringConfig;
import com.example.dao.BookDao;
import com.example.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppForAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao1 = ctx.getBean(BookDao.class);
        System.out.println(bookDao1);
        BookDao bookDao2 = ctx.getBean(BookDao.class);
        System.out.println(bookDao2);
        BookService bookService = ctx.getBean(BookService.class);
        System.out.println(bookService);
        ctx.close();
    }
}
