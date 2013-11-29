// Copyright (c) 2013, Webit Team. All Rights Reserved.
package webit.script.demo.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import webit.script.demo.mvc.util.BookUtil;
import webit.script.support.servlet.WebitScriptFilterUtil;

/**
 * 
 * @author Zqq
 */
public class BooksServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //WebitScriptFilterUtil.setTemplatePath(request, "/books.wtl");
        request.setAttribute("books", BookUtil.findBooks());
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
