package webit.script.demo.jfinal;

import com.jfinal.core.Controller;
import webit.script.demo.mvc.util.BookUtil;

public class CommonController extends Controller {

    public void books() {
        setAttr("books", BookUtil.findBooks());
        render("/books.wtl");
    }

    public void index() {
        redirect("/books");
    }
}
