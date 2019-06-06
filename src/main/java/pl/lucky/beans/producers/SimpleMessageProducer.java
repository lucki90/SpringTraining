package pl.lucky.beans.producers;

import org.springframework.stereotype.Component;

@Component
@Producer(type = Producer.ProducerType.SIMPLE)
public class SimpleMessageProducer implements MessageProducer {

    public String getMessage() {
        return "Example message " + System.currentTimeMillis();
    }
}
