package pl.lucky.beans.decorators;

import org.springframework.stereotype.Component;

@Component
@Decorator(type = Decorator.DecoratorType.UPPER)
public class UpperCaseMessageDecorator implements MessageDecorator {
    @Override
    public String decorate(String msg) {
        return msg.toUpperCase();
    }
}
