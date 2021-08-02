package io.github.luethiandri.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class Bookstore {
  private String id;
  private String name;
  private List<Book> books = new ArrayList();

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Book> getBooks() {
    return books;
  }

  public void setBooks(List<Book> books) {
    this.books = books;
  }
}
