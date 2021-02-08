package Question6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Shape shape = (Shape) context.getBean("circle");
        shape.draw();
        System.out.println("Database URL :" + context.getMessage("greeting", null, null, null));
        System.out.println("Username : " + context.getMessage("username", null, "sample username", null));
        System.out.println("Password : " + context.getMessage("password", null, "sample password", null));
    }
}
