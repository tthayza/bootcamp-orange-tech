package edu.thayza.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Component;

import edu.thayza.springdatajpa.model.Usuario;
import edu.thayza.springdatajpa.repository.UserRepository;

@Component
public class InicioApp implements CommandLineRunner {
  @Autowired
  private UserRepository repository;

  @Override
  public void run(String... args) throws Exception {
    Usuario user = new Usuario();
    user.setName("tha");
    user.setUsuarioname("tha");
    user.setPassword("kdk");

    repository.save(user);

    for(User u: repository.findAll()) {
      System.out.println(u);
    }
  }

}
