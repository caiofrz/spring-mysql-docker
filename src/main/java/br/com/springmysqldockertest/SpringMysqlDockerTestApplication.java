package br.com.springmysqldockertest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringMysqlDockerTestApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringMysqlDockerTestApplication.class, args);
  }

  @GetMapping("/")
  public String index() {
    return "Container docker funcionando!";
  }
}