package org.febit.wit.demo.spingmvc;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.febit.wit.demo.mvc.util.BookUtil;

@Controller
public class BooksController {

    @RequestMapping("/books")
    public String books(Map<String, Object> context) throws Exception {
        context.put("books", BookUtil.findBooks());
        return "books";
    }
}
