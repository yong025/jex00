package com.example.jex00.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.ArrayList;


@Configuration //java파일로 xml처럼 설정하는 방법
@ComponentScan(basePackages = {"com.example.service"}) //service 를 부를 때 이 패키지에서 스캔 해줘!
@MapperScan( basePackages = "com.example.mapper")
public class RootConfig {

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception{ //mybatis 세팅 끝. 어노테이션 세팅만 추가하면 됨
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());

        return sqlSessionFactoryBean.getObject();
    }

    @Bean /*(destroyMethod = "close")*/ //안전하게 쓸 때는 클로즈 해주는 게 좋다.
    public DataSource dataSource() {
        HikariConfig config = new HikariConfig();
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        config.setJdbcUrl("jdbc:mysql://localhost:3306/springdb");
        config.setUsername("springuser");
        config.setPassword("springuser");

        HikariDataSource dataSource = new HikariDataSource(config);

        return dataSource;
    }

    @Bean(name = "names") //bean을 설정시키도록 하는 어노테이션,대부분은 이름을 메서드의 이름과 일치시킴
    public ArrayList<String> names() { //예외적으로 메서드 이름을 명사로 설정
        ArrayList<String> list = new ArrayList<>();
        list.add("AAA");
        list.add("BBB");;
        list.add("CCC");;

        return list;
    }


}
