package io.github.luethiandri.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.luethiandri.domain.Bookstore;
import io.github.luethiandri.domain.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class BookstoreService {
  private static final Logger LOGGER = LoggerFactory.getLogger(BookstoreService.class);
  private ObjectMapper objectMapper;
  public BookstoreService() {
    objectMapper = new ObjectMapper();
    getBokstores();
  }

  public List<Bookstore> getBokstores() {
    try {
      ClassLoader classLoader = getClass().getClassLoader();
      File file = new File(classLoader.getResource("data.json").getFile());
      Data data = objectMapper.readValue(file, Data.class);
      LOGGER.info(String.valueOf(data.getBookstores().size()));
      return data.getBookstores();
    } catch (IOException e) {
      LOGGER.error("Something went wrong!", e);
      throw new IllegalArgumentException(e);
    }
  }
}
