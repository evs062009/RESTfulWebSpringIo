package hello;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Greeting {

    private final String greetingStart;
    private final String person;
}
