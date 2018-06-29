package indi.yftao.multidb;

import indi.yftao.multidb.book.BookEntity;
import indi.yftao.multidb.book.BookRepository;
import indi.yftao.multidb.user.UserEntity;
import indi.yftao.multidb.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class MultidbApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultidbApplication.class, args);
    }

    @Autowired
    BookRepository bookRepository;

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/getBooks")
    public List<BookEntity> getBooks() {
        return bookRepository.findAll();
    }

    @RequestMapping("/getUsers")
    public List<UserEntity> getUsers() {
        return userRepository.findAll();
    }
}
