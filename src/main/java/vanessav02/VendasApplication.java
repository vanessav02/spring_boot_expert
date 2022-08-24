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
//        >> Configurando e obtendo conexões com bases de dados

//1. Adicionar a dependência spring-boot-starter-data-jpa
//   Adicionar a dependência , driver do banco de dados (h2, banco de dados em memória).
//   Conexão com o bd -> configurar no application.properties (spring.datasource.)
//
//   No /h2-console:
/*
create table cliente (
 id int not null primary key,
 nome varchar(100)
)
*/
// .


