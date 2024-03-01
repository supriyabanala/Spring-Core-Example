package src.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import src.main.processor.MessageProcessor;
import src.main.processor.MessageProcessorImpl;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        MessageProcessor userService = applicationContext.getBean(MessageProcessorImpl.class);
        userService.processMsg("twitter message sending ");
        applicationContext.close();
    }
}
