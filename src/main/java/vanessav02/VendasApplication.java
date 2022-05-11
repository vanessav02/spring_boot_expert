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

//   11 Trabalhando com múltiplos ambientes e profiles

//1. Um application-nomedoambente.properties para cada ambiente (dsv, prod, teste). Ex: application.name=development
//   No application.properties padrão, adicionar spring.profiles.active=nomedoambiente, para selecionar a configuração de qual ambiente vai subir
//2. O perfil também funciona com as @Configuration. Cria um @Bean para a configuração e usa com
//   a anotação @Profile("nomedoambiente"). Só vai executar quando estiver no perfil selecionado.
//   Exemplo feito com CommandLineRunner - para executar em linha de comando assim que a aplicação inicalizar.


