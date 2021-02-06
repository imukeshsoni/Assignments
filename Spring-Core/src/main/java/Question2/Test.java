package Question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Question question = (Question) context.getBean("question");
        System.out.println(question.getQuestionId() + " - " + question.getQuestion() + "\n Ans : "
                + question.getAnswer());

    }
}
