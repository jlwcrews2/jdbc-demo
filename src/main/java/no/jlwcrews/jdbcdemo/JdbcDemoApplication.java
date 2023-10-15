package no.jlwcrews.jdbcdemo;

import no.jlwcrews.jdbcdemo.model.Part;
import no.jlwcrews.jdbcdemo.repository.PartRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JdbcDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JdbcDemoApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(PartRepository parts) {
        return args -> {
            parts.save(new Part("cog", 10));
            parts.save(new Part("flywheel", 25));
        };
    }

}
