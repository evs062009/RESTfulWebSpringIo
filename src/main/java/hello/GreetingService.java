package hello;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    private Greeting greeting;

    public void createGreeting(String greetingStart, String person) {
        greetingStart += ", ";
        person += '!';
        greeting = new Greeting(greetingStart, person);
    }

    public Greeting getGreeting() {
        if (greeting == null) {
            greeting = new Greeting("empty", "");
        }
        return greeting;
    }
}
