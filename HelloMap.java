import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 708 on 10/20/2017.
 */
public class HelloMap {
    public static void main(String[] args) {
        ApplicationContext bf = new ClassPathXmlApplicationContext("hello.xml");
        Hello hello = (Hello) bf.getBean("hello");

        System.out.println(hello.toString());
    }
}
