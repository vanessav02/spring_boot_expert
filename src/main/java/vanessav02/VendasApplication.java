package vanessav02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vanessav02.domain.entity.Cliente;
import vanessav02.domain.repositorio.ClientesRepository;

import java.util.List;

@SpringBootApplication
@RestController
public class VendasApplication {

    @Bean
    public CommandLineRunner init(@Autowired ClientesRepository clientesRepository){
        return args -> {
            Cliente cliente = new Cliente("Ana");
            clientesRepository.salvar(cliente);

            Cliente cliente2 = new Cliente("João");
            clientesRepository.salvar(cliente2);

            List<Cliente> todosClientes = clientesRepository.obterTodos();
            todosClientes.forEach(System.out::println);
        };
    }

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
//        >> Salvando e recuperando clientes

//1. Criar o repositório (ou DAOs - Data Access Object) para clientes
//2. Injetar instância de JdbcTemplate - tem métodos que permitem que se faça operações na base de dados
//3. Criar um CommandLineRunner para executar a operação de inserir clientes
// .
