// @DATE 2022/7/27
// @TIME 15:42
// @AUTHOR zhangzhi
// @DESCRIPTION

import com.example.config.SpringConfig;
import com.example.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = ctx.getBean(BookDao.class);
        String name = bookDao.findName(100,"zhang");
        System.out.println(name);
    }
}
