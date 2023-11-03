package com.example.springmongo4.demomongo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookRepository bookRepository;

   @GetMapping("/getBooks")
   public List<Book> getBook(){
       return bookRepository.findAll();
   }

   @PostMapping("/insertBook")
    public void inserBook(@RequestBody CreateRequest request){

       Book book=new Book(request.getName(),request.getAuthorName(),request.getCost(),request.getCount());
       bookRepository.save(book);
   }

   @GetMapping("/getBookByAuthor")
    public List<Book> getBookByAuthorName(@RequestParam(value="name") String name){
         return bookRepository.findByAuthorName(name);
    }


}
