package com.api.book.bootrestapibook.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.book.bootrestapibook.dao.BookRepository;
import com.api.book.bootrestapibook.entities.Book;


@Component
public class BookService {
    
    @Autowired
    private BookRepository bookRepository; 

    // private static List<Book> list=new ArrayList<>();

    // static{
    //     list.add(new Book(12,"Java Complete Reference","XYZ"));
    //     list.add(new Book(21,"Head Fisrt to Java","ABC"));
    //     list.add(new Book(36,"Think in Java","LMN"));
    // }

    public List<Book> getAllBooks(){
        List<Book> list=(List<Book>) this.bookRepository.findAll();
        return list;
    }

    public Book getBookById(int id){
        Book book=null;
        try{
            //book=list.stream().filter(e->e.getId()==id).findFirst().get();
            book=this.bookRepository.findById(id);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return book;
    }

    public Book addBook(Book b){
        //list.add(b);
        Book res=bookRepository.save(b);
        return res;
    }
    
    public void deleteBook(int bookId){
        // list=list.stream().filter(book ->{
        //     if(book.getId()!=bookId) return true;
        //     else return false;
        // }).collect(Collectors.toList());

        bookRepository.deleteById(bookId);
    }


    public Book updateBook(Book book,int bookId){
        // list=list.stream().map(b->{
        //     if(b.getId()==bookId){
        //         b.setTitle(book.getTitle());
        //         b.setAuthor(book.getAuthor());
        //     }
        //     return b;
        // }).collect(Collectors.toList());
        // return book;
        
        book.setId(bookId);
        Book res=bookRepository.save(book);
        return res;
    }
}
