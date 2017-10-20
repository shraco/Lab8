import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 708 on 10/20/2017.
 */
public class MainAccount {
    public static void main(String[] args) {
        ApplicationContext bf = new ClassPathXmlApplicationContext("account.xml");

        BankAccount account = (BankAccount) bf.getBean("account");

        System.out.println("Balance: " + account.getBalance());
        Customer customer = new Customer (1, 1234,account);


    }
}
