package vanessav02;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Development
public class MinhaConfiguration {

    @Bean
    public CommandLineRunner executar(){
        return args -> {
            System.out.println("RODANDO A CONFIGURAÇÃO DE DESENVOLVIMENTO");
        };
    }

//    @Bean
//    @Profile("production")
//    public CommandLineRunner executarprod(){
//        return args -> {
//            System.out.println("RODANDO A CONFIGURAÇÃO DE PRODUÇÃO");
//        };
//    }
}
