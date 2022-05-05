package vanessav02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasApplication {

    @Autowired
    @Qualifier("applicationName")
    private String applicationName;

    @GetMapping("/hello")
    public String helloWorld() {
        return applicationName;
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}

//1. cria uma nova classe de configuração (nomenclatura padrão xxxConfiguration)
//2. anotação @Configuration nessa classe - diz para o spring que é uma classe de configuração
//3. anotação @Bean("nome do bean") no método para para fazer a configuração - diz que são objetos configuráveis
//   Na classe principal:
//4. anotação @Autowired na variável que vai utilizar a configuração
//5. anotação @Qualifier("nome do bean") na variável que vai utilizar a configuração - identifica que eu quero que injete o que foi feito no Configuration, do bean específico

// Container IOC (inversion of control) do Spring Framework:
// {
//   @Configuration [@Bean]
//   @Component [@Controler, @Repository, @Service]
// }