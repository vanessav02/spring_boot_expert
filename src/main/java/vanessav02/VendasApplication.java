package vanessav02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasApplication {

    @Value("${application.name}")
    private String applicationName;

    @GetMapping("/hello")
    public String helloWorld() {
        return applicationName;
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}

//   12 Criando Annotations customizadas de configuração

//1. Cria-se @ Annotations customizadas para, por ex., facilitar ao modificar o nome dos ambientes, e para nao precisar mudar em todas as chamadas a string de @Profiles("nomedoambiente")
//   new > java Class > kind: @Annotation (Anotação @interface Development)
//   E em MinhaConfiguration anota com o @Development
// .


