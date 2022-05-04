package vanessav02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VendasApplication {
    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);

    }
}

//1. anotação para o spring reconhecer que é uma aplicação springboot
//2. comando para inicializar a aplicação spring boot: .run(classe que vai inicializar a aplicação,args)
