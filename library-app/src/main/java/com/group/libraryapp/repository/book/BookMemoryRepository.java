package com.group.libraryapp.repository.book;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Primary
@Repository
public class BookMemoryRepository implements BookRepository {

//    private final List<Book> books = new ArrayList<Book>();

    public void saveBook() {
        // books.add
        System.out.println("Memory");
    }
}
