package org.febit.wit.demo.jodd.madvoc;

import java.util.List;
import jodd.madvoc.meta.Action;
import jodd.madvoc.meta.MadvocAction;
import jodd.madvoc.meta.Out;
import org.febit.wit.support.jodd3.WitResult;
import org.febit.wit.demo.mvc.model.Book;
import org.febit.wit.demo.mvc.util.BookUtil;

/**
 *
 * @author Zqq
 */
@MadvocAction
public class BooksAction {

    @Out
    List<Book> books;

    @Action(extension = "html")
    public Object view() {
        this.books = BookUtil.findBooks();
        return WitResult.render("OK");
    }

    @Action(extension = "html")
    public Object ok() {
        this.books = BookUtil.findBooks();
        return WitResult.render("##");
    }

    @Action
    public void ok2() {
        this.books = BookUtil.findBooks();
    }

    @Action
    public Object ok3() {
        this.books = BookUtil.findBooks();
        return null;
    }

    @Action
    public Object ok4() {
        this.books = BookUtil.findBooks();
        return "#";
    }
}
