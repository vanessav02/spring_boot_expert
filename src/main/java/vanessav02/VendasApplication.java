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
            System.out.println("**Salvando clientes**");
            Cliente cliente = new Cliente("Ana");
            clientesRepository.salvar(cliente);

            Cliente cliente2 = new Cliente("João");
            clientesRepository.salvar(cliente2);

            List<Cliente> todosClientes = clientesRepository.obterTodos();
            todosClientes.forEach(System.out::println);

            System.out.println("**Atualizando clientes**");
            todosClientes.forEach(c -> {
                c.setNome(c.getNome() + " atualizado");
                clientesRepository.atualizar(c);
            });

            todosClientes = clientesRepository.obterTodos();
            todosClientes.forEach(System.out::println);

            System.out.println("**Buscando clientes**");
            clientesRepository.buscarPorNome("Ana").forEach(System.out::println);

            System.out.println("**Deletando clientes**");
            clientesRepository.obterTodos().forEach(c -> clientesRepository.deletar(c));

            todosClientes = clientesRepository.obterTodos();
            if (todosClientes.isEmpty()){
                System.out.println("# Nenhum cliente encontrado.");
            }
            else {
                todosClientes.forEach(System.out::println);
            }

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
//        >> Concluindo o cadastro de clientes

//1. Operações de atualizar e deletar cliente
//
//
// .
