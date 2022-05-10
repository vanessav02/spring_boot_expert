package vanessav02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

//   10 Configuração externalizada: application.properties

//1. criação do arquivo application.properties -> modelo chave-valor.
//   configurações customizadas sem precisar criar os @Bean.
//   Elimina o Bean da classe MinhaConfiguration e usa a chave application.name para referenciar a String,
//   com a anotação @Value("${application.name}") na propridade.
//Tomcat started on port(s): 8081 (http) with context path '/sistema-vendas'
