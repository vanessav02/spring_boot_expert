package vanessav02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasApplication {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}

//1. adiciona dependência do spring-boot-starter-web
//2. anotação @RestController na classe - diz que é um controlador Rest, posso mandar mensagens para o browser através dessa classe
//3. anotação @GetMapping no métódo - mapeando para que o browser entenda a URL "/hello" e mostre a mensagem retornada

