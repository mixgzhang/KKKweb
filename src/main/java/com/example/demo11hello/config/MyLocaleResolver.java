package com.example.demo11hello.config;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class MyLocaleResolver implements LocaleResolver {
    //解析请求


    @Override
    public Locale resolveLocale(HttpServletRequest request) {

        String language = request.getParameter("l");
       // System.out.println("====="+language);
        Locale locale = Locale.getDefault();

        if(!StringUtils.isEmpty(language)){
            String[] split =   language.split("_");
          locale =   new Locale(split[0],split[1]);
        }
        return locale;
    }


    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale){

    }

}
