package io.github.luethiandri.web;

import io.github.luethiandri.domain.Bookstore;
import io.github.luethiandri.service.BookstoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookstoreController {

    @Autowired
    private BookstoreService bookstoreService;

    @ResponseBody
    @GetMapping("/bookstores")
    public List<Bookstore> getBookstores() {
        return bookstoreService.getBokstores();
    }
}
