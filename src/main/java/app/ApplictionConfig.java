package app;

import beans.MessagePrinter;
import beans.MessageProducer;
import beans.SimpleMessageProducer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@ComponentScan(basePackageClasses = MessagePrinter.class)
public class ApplictionConfig {

    @Bean
    public MessagePrinter getPrinter() {
        MessageProducer producer = new SimpleMessageProducer();
        return new MessagePrinter(producer);
    }

}
