package springboot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping("/name")
    public String hello() {
        return "<html>
    <head>
        <body>
            <p>hello world</p>
        </body>
    </head>
</html>";
    }
    @GetMapping("/job")
    public String proffession() {
        return "<html>
    <head>
        <body>
            <p>hello basic</p>
        </body>
    </head>
</html>";
    }
    @GetMapping("/hobby")
    public String hobby() {
        return "cooking";
    }
}


