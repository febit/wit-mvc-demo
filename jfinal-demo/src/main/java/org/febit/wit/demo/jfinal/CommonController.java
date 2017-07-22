package org.febit.wit.demo.jfinal;

import com.jfinal.core.Controller;
import org.febit.wit.demo.mvc.util.BookUtil;

public class CommonController extends Controller {

    public void books() {
        setAttr("books", BookUtil.findBooks());
        render("/books");
    }

    public void index() {
        redirect("/books");
    }
}
