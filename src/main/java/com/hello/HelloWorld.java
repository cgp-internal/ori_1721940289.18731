package com.hello;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloWorld extends HttpServlet {

    private HelloWorldController helloWorldController;

    public HelloWorld() {
        helloWorldController = new HelloWorldController();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().write(helloWorldController.getHelloWorld());
    }
}