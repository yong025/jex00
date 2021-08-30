package com.example.jex00.config;

import lombok.extern.log4j.Log4j2;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



@Log4j2
public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer{

    @Override
    protected Class<?>[] getRootConfigClasses() {

        log.info("1————————————");
        log.info("2————————————");
        //설정파일이 로딩이 되면 로그를 통해 확인해볼수 있도록!
        return new Class[]{RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {

        log.info("3————————————");
        log.info("4————————————");

        return new Class[]{ServletConfig.class};
    }

    @Override //프론트 컨트롤러임
    protected String[] getServletMappings() {
        return new String[]{"/"}; //모든 애들을 다 받아들이도록
    }
}