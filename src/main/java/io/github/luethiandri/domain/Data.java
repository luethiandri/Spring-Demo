package io.github.luethiandri.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class Data {
  private List<Bookstore> bookstores = new ArrayList();

  public List<Bookstore> getBookstores() {
    return bookstores;
  }

  public void setBookstores(List<Bookstore> bookstores) {
    this.bookstores = bookstores;
  }
}
