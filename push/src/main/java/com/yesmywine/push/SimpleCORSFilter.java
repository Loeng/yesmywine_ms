//package com.yesmywine.push;
//
//import org.springframework.stereotype.Component;
//
//import javax.servlet.*;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * Created by WANG, RUIQING on 10/19/16
// * Twitter : @taylorwang789
// * E-mail : i@wrqzn.com
// */
//@Component
//public class SimpleCORSFilter implements Filter{
//
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//    }
//
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse res, FilterChain chain) throws IOException, ServletException {
//        HttpServletResponse response = (HttpServletResponse) res;
//        response.setContentType("textml;charset=UTF-8");
////        httpResponse.setHeader("Access-Control-Allow-Origin", "*");
//        response.setHeader("Access-Control-Allow-Origin", response.getHeader("Origin"));
//        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE,PUT");
//        response.setHeader("Access-Control-Max-Age", "3600");
//        response.setHeader("Access-Control-Allow-Headers", " Origin, X-Requested-With, Content-Type, Accept, Connection, User-Agent, Cookie, Authorization, RequestPerm");
//        response.setHeader("Access-Control-Allow-Credentials", "true");
//        response.setHeader("XDomainRequestAllowed","1");
//        chain.doFilter(request, res);
//    }
//
//    @Override
//    public void destroy() {
//
//    }
//}
