package webit.script.demo.sping.mvc;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import webit.script.demo.mvc.util.BookUtil;

@Controller
public class BooksController {

    @RequestMapping("/books")
    public String books(Map<String, Object> context) throws Exception {
        context.put("books", BookUtil.findBooks());
        return "books";
    }
}
