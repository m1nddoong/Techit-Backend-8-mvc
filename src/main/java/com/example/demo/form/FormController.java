package com.example.demo.form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
    // 1. 사용자에게 표기하고 싶은 메세지를 전달할 수 있는
    // HTML 을 반환하는 메서드
    @GetMapping("/send")
    public String getForm() {
        return "send";
    }

    // 2. 사용자가 전달할 데이터를 처리할 수 있는 메서드
    /*
    @RequestMapping(
            value = "/receive",
            // method 인자로 들어오는 요청의 http method를 한정시킬 수 있다.
            method = RequestMethod.POST
    )
     */
    @PostMapping("/receive")
    public String receiveData(
            // @RequestParam : 사용자가 보낸 요청의
            // 데이터를 받는 목적의 매개변수임을 표기
            @RequestParam("message")
            String message,
            Model model // 추가
    ) {
        System.out.println(message);
        return "receive"; // 추가
    }

}


