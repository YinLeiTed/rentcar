package com.yinlei.rentcar.tools;

import com.yinlei.rentcar.bean.UserTable;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class MyUser {
    public static String getCookieUser(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        if(cookies==null)
        {
            Sout.print("cookie","没有任何cookie信息");
            return null;
        }
        for (Cookie c: cookies) {
            if(c.getName().equals("myuser"))
                return c.getValue();
        }
        return null;
    }
}
