package org.febit.wit.demo.struts;

import java.util.List;
import org.febit.wit.demo.mvc.model.Book;
import org.febit.wit.demo.mvc.util.BookUtil;

public class BooksAction {

    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public String execute() throws Exception {
        books = BookUtil.findBooks();
        return "success";
    }
}
