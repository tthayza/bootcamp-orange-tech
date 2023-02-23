package edu.thayza.springdatajpa.repository;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;

import edu.thayza.springdatajpa.model.Usuario;

public interface UserRepository extends JpaRepository<User, Integer> {

  void save(Usuario user);

}
