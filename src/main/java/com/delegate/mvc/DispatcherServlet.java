package com.delegate.mvc;

import com.delegate.mvc.controller.MemberController;
import com.delegate.mvc.controller.OrderController;
import com.delegate.mvc.controller.SystemController;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Spring BeanDefinitionParserDelegate
 */
public class DispatcherServlet extends HttpServlet {


    private List<Handler> handlerMappingList = new ArrayList<>();

    @Override
    public void init(ServletConfig config) throws ServletException {
        try {
            Class<?> memberClass = MemberController.class;
            Handler memberHandler = new Handler();
            memberHandler.setController(memberClass.newInstance());
            memberHandler.setMethod(memberClass.getMethod("getMemberByID", String.class));
            memberHandler.setUrl("/web/getMemberById.json");

            handlerMappingList.add(memberHandler);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doDispatch(req, resp);
    }

    private void doDispatch(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String uri = req.getRequestURI();

        String mid = req.getParameter("mid");

        Handler handlerMapping = null;
        for (Handler handler : handlerMappingList) {
            if (uri.equals(handler.getUrl())) {
                handlerMapping = handler;
                break;

            }
        }

        try {

            Object result = handlerMapping.getMethod().invoke(handlerMapping.getController(), req.getParameter("mid"));
            resp.getWriter().write(result.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void doDispatchV1(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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


    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    class Handler {
        private Object controller;
        private Method method;
        private String url;
    }

}
