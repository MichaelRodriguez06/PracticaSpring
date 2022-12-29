package Com.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ControllerInit {

    @GetMapping("/")

    public String age() {
        log.info("Este mensajeeeeee");
        return "Xd este es mi primer hola mundo en Spring";
    }

}
