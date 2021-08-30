package com.example.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller
@RequestMapping("/board/*") // 보드로 들어오는 모든 리퀘스트는 얘가 담당한다.
public class BoardController {

    @GetMapping(name = "/list") //경로가 /board/list이다.
    public void List(){//void를 쓰면 호출하는 경로의 jsp를 찾는다.

        log.info("list !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        log.info("list !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        log.info("list !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        log.info("list !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        log.info("list !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

    }

}
