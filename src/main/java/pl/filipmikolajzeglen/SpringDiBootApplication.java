package pl.filipmikolajzeglen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.filipmikolajzeglen.beans.NamesRepository;

import java.util.List;

@SpringBootApplication
public class SpringDiBootApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringDiBootApplication.class, args);

        NamesRepository namesRepo = ctx.getBean(NamesRepository.class);
        List<String> allNames = namesRepo.getAll();
        allNames.forEach(System.out::println);

        ctx.close();
    }

}
