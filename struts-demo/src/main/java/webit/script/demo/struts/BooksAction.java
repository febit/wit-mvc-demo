package webit.script.demo.struts;

import java.util.List;
import webit.script.demo.mvc.model.Book;
import webit.script.demo.mvc.util.BookUtil;

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
