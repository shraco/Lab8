import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Created by 708 on 10/20/2017.
 */
public class MainCustomer {
    public static void main(String[] args) {
        ApplicationContext bf = new ClassPathXmlApplicationContext("customer.xml");
        Customer customer = (Customer) bf.getBean("customer");
        BankAccount account = customer.getAccount();

        System.out.println("ID : "+customer.getID()+"\n"+
                "Phone : "+customer.getPhone()+"\n"+
                "Balance : "+account.getBalance()+
                "\nAddress : "+customer.getAddress());


    }
}
