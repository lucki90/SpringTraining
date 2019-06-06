package historyPackage;

import org.springframework.context.annotation.Bean;
import pl.lucky.beans.printers.MessagePrinter;
import pl.lucky.beans.producers.MessageProducer;
import pl.lucky.beans.producers.SimpleMessageProducer;

//@Configuration
//@ComponentScan(basePackageClasses = MessagePrinter.class)
public class ApplictionConfig {

    @Bean
    public MessagePrinter getPrinter() {
        MessageProducer producer = new SimpleMessageProducer();
        return new MessagePrinter(producer);
    }

}
