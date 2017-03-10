package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 类描述信息
 *
 * @author YangHu
 * @since 17/3/9
 */
public class LoginServlet extends HttpServlet {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String name = (String) request.getParameter("name");
        System.out.println("name==>" + name);
        request.setAttribute("name", name);
        if ("cmp".equals(name)) {
            request.getRequestDispatcher("success.jsp").forward(request,
                    response);// 转发，是同一个请求，转发到的jsp可以得到request里面的属性值
        } else {
            request.setAttribute("msg", "用户名和密码错误！！！");
            request.getRequestDispatcher("index.jsp").forward(request, response);// 转发，是同一个请求，转发到的jsp可以得到request里面的属性值
            // response.sendRedirect("index.jsp");//重定向，属于不同的请求，下个jsp无法得到request里面的值
        }
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }
}
