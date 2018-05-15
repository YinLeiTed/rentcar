package com.yinlei.rentcar.tools;

import com.yinlei.rentcar.bean.UserTable;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Order(1)
@WebFilter(urlPatterns = "/*")
public class MyFilter implements Filter {
    private static List<String> mylist=new ArrayList<>(Arrays.asList("ShareTable"));
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Sout.print("init","过滤器开始");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
		UserTable user = (UserTable) request.getSession().getAttribute("myuser");

        boolean myflag=false;
        for (String s:mylist)
        {
            if(request.getRequestURI().contains(s))
            {
                myflag=true;
                break;
            }
        }
        if(user == null&&myflag) {
            Sout.print("init","没有登录");
            response.sendRedirect("./html/login.html");
        }else {
            filterChain.doFilter(request, response);
        }

    }

    @Override
    public void destroy() {
        Sout.print("init","过滤器销毁结束");
    }
}
