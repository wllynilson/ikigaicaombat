package br.com.ikigaicombat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.ikigaicombat.inscricao")
public class IkigaicombatApplication {

    public static void main(String[] args) {
        SpringApplication.run(IkigaicombatApplication.class, args);
    }

}
