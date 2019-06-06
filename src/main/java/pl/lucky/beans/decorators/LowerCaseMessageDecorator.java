package pl.lucky.beans.decorators;

import org.springframework.stereotype.Component;

@Component
@Decorator(type = Decorator.DecoratorType.LOWER)
public class LowerCaseMessageDecorator implements MessageDecorator {
    @Override
    public String decorate(String msg) {
        return msg.toLowerCase();
    }
}
