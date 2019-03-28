package com.delegate.mvc;

import com.delegate.mvc.controller.MemberController;
import com.delegate.mvc.controller.OrderController;
import com.delegate.mvc.controller.SystemController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Spring BeanDefinitionParserDelegate
 */
public class DispatcherServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doDispatch(req, resp);
    }

    private void doDispatch(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String uri = req.getRequestURI();

        String mid = req.getParameter("mid");

        if ("getMemberByID".equals(uri)) {
            new MemberController().getMemberByID(mid);
        } else if ("getOrderByID".equals(uri)) {
            new OrderController().getOrderByID(mid);
        } else if ("logout".equals(uri)) {
            new SystemController().logout();
        } else {
            resp.getWriter().write(" 404 Not Found ");
        }

    }
}
