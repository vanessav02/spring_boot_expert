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

// Sessão 3: Persistência e acesso a dados com Spring Data JPA
//        >> Scripts de criação do banco de dados

//1. O h2 (banco em memória) só funciona enquanto a instância dele está rodando. Quando a aplicação reinicia, ele também. Scripts são perdidos.
//   Para evitar rodar os scripts toda vez, spring boot tem uma solução p executar scripts assim q a aplicação sobe.
//   New file: data.sql (executado assim que a aplicação subir)
// .


