// Copyright (c) 2013, Webit Team. All Rights Reserved.
package webit.script.demo.jodd.madvoc;

import java.util.List;
import jodd.madvoc.meta.Action;
import jodd.madvoc.meta.MadvocAction;
import jodd.madvoc.meta.Out;
import webit.script.demo.mvc.model.Book;
import webit.script.demo.mvc.util.BookUtil;
import webit.script.support.jodd.madvoc.WebitScriptResult;

/**
 *
 * @author Zqq
 */
@MadvocAction
public class BooksAction {

    private final static String RESULT = WebitScriptResult.NAME.concat(":");

    @Out
    List<Book> books;

    @Action(extension = "html")
    public Object view() {
        this.books = BookUtil.findBooks();
        return RESULT;
    }
}
