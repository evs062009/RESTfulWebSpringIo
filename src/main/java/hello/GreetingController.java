package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController                 //  = @Controller + @ResponseBody
public class GreetingController {

    @Autowired
    private GreetingService service;

    @PostMapping("/greeting")
    public void getGreetingParam(@RequestParam String greetingStart, @RequestParam String person) {
        service.createGreeting(greetingStart, person);
    }

    @GetMapping("/greeting")
    public Greeting greeting() {
        return service.getGreeting();
    }
}
