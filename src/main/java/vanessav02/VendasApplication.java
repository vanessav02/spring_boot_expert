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

//   9 Injeção de Dependências

//1. anotação @Repository, @Service e @Controller nas classes correspondentes
//2. o Service (regras de negócio) precisa do Repository (acessa/modifica o banco de dados).
//   o Repository é uma dependência do Service.
//3. não podemos instanciar o repositoy com x = new Repository(), pq abrir uma conexão diretamente com banco de dados é complexa, pesada.
//   solução: delega essa instância para o container de injeção de dependencias do spring (IOC), que faz isso de forma automática.
//   a classe que vai ser escaneada pelo container já tem a anotação @Repository, e o spring boot vai instanciar o
//   repository, adicionar no container a injeção, e vai estar pronto para injetar onde precisar (no caso no service)
//   - cria um construtor, pelo construtor adiciona a dependência.
//   - facultativo adicionar @Autowired em cima desse construtor - diz para o spring boot que ele deve injetar a instância
//   Resumindo: em vez de se instanciar diretamente, se intancia pelo construtor! Delega ao container a criação da instância e injeção.
//   (Se não quiser injetar via construtor, pode-se colocar a anotação @Autowired acima da declaração da propriedade, direto, eliminando o construtor,
//   ou também dá para injetar via método set()).
