import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Svirinstel on 02.04.17.
 */
public class App {
    private Client client;
    private EventLogger eventLogger;

    public App(Client client, EventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public static void main(String[] args){

        System.out.println("App is started");

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

        App app = (App) ctx.getBean("app");

//        app.logEvent("Some event for user 1");
//        app.logEvent("Some event for user 2");

    }

    public void logEvent(String msg){
        String message = msg.replaceAll(client.getId(),client.getFullName());
//        eventLogger.logEvent(message);
    }
}
