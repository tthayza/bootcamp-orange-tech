package edu.thayza.springdatajpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;

@Entity
public class Usuario {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "usuario_id")
  private Integer id;
  @Column(length = 50, nullable = false)
  private String name;
  @Column(length = 20, nullable = false)
  private String usuarioname;
  @Column(length = 100, nullable = false)
  private String password;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getusuarioname() {
    return usuarioname;
  }

  public void setUsuarioname(String usuarioname) {
    this.usuarioname = usuarioname;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "Usuario [id=" + id + ", name=" + name + ", usuarioname=" + usuarioname + ", password=" + password + "]";
  }
}
