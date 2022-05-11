package vanessav02;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class MinhaConfiguration {

    @Bean
    @Profile("development")
    public CommandLineRunner executar(){
        return args -> {
            System.out.println("RODANDO A CONFIGURAÇÃO DE DESENVOLVIMENTO");
        };
    }

    @Bean
    @Profile("production")
    public CommandLineRunner executarprod(){
        return args -> {
            System.out.println("RODANDO A CONFIGURAÇÃO DE PRODUÇÃO");
        };
    }
}
