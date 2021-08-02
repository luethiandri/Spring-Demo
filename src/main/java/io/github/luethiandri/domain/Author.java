package io.github.luethiandri.domain;

import org.springframework.stereotype.Component;

public class Author {
  private String firstname;
  private String name;

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
