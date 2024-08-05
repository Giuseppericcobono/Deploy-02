package co.develhope.exercise_deploy02.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class BasicController {

    @GetMapping("/sum")
    public Integer summa() {
        Random random1 = new Random();
        Random random2 = new Random();
        Integer result = random1.nextInt() + random2.nextInt();
        return result;
    }
}
