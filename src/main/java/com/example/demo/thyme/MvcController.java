package com.example.demo.thyme;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MvcController {
    // /text로 요청이 오면 text.html을 반환하는 메서드
    @RequestMapping("/text")
    // Model은 View에 사용할 데이터를 모아두는 객체
    public String text(Model model) {
        model.addAttribute(
                "message",
                "Hello Thymeleaf!"
        );
        return "text";
    }

    // /text-object로 요청이 오면 text-object.html을 반환하는 메서드
    @RequestMapping("/text-object")
    public String textObject(Model model) {
        Student alex = new Student("Alex", "alex@gmail.com");
        model.addAttribute("object", alex);
        return "text-object";
    }

    // /is-logged-in 으로 요청이 오면 if-unless.html을 반환하는 메서드
    @RequestMapping("/is-logged-in")
    public String isLoggedIn(Model model) {
        model.addAttribute("isLoggedIn", false);
        return "if-unless";
    }

    // /each로 요청이 오면 each.html을 반환하는 메서드
    @RequestMapping("/each")
    public String each(Model model) {
        // 여러개의 데이트를 가진 객체를 Model 에 전달 -> List
        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("Alex");
        listOfStrings.add("Brad");
        listOfStrings.add("Ched");
        // ItemList 라는 이름으로 listOfStrings를 model 에 넣어줌
        model.addAttribute("itemList", listOfStrings);

        /*
        for (String item : listOfStrings) {
            // listOfStrings의 아이템을 하나씩 출력한다.
            System.out.println(item);
        }
        */

        // 여러 학생(Student) 데이터를 담은 리스트를 model 에 전달
        List<Student> studentList = new ArrayList<>();
        // studentList.add(new Student("Alex", "alex@gmail.com"));
        // studentList.add(new Student("Brad", "brad@gmail.com"));
        model.addAttribute("studentList", studentList);

        return "each";
    }
}
