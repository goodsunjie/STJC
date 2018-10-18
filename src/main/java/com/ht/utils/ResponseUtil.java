package com.ht.utils;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

public class ResponseUtil {
	public static void write(HttpServletResponse response,Object o)throws Exception{  
        response.setContentType("text/html;charset=utf-8");  
        response.setHeader("Access-Control-Allow-Origin", "*");
        PrintWriter out=response.getWriter();  
        out.print(o.toString());  
        out.flush();  
        out.close();  
    } 
}
