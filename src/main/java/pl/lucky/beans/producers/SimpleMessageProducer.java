package pl.lucky.beans.producers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Producer(type = Producer.ProducerType.SIMPLE)
@Message(type = Message.MessageType.SIMPLE)
public class SimpleMessageProducer implements MessageProducer {

    @Autowired
    @Qualifier("randomNumber")
    private int random;

    @Override
    public String getMessage() {
        return "Simple Message: " + this + "  :  " + random;
    }
}
