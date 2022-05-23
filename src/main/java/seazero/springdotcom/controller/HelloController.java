package seazero.springdotcom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "spring!!");
        return "hello"; //resources > templates > hello.html (hello로 가서 랜더링 하라는거)
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody // html 태그가 없이 문자가 그대로 html 바디로 들어감
    public String helloString(@RequestParam("name") String name) {
        return "hello " + name; // "hello spring"
    }

    //진짜는 지금부터
    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name) {
        Hello hello = new Hello(); // 객체를 선언
        hello.setName(name);
        return hello;
    }

    static class Hello { // 이렇게 static 클래스로 만들면 제일 밖의 클래스 안에서 또 쓸 수 있습니다 (HelloController.Hello 이런식으로 가능)
        private String name;

        // getter, setter : 자바 빈 규약 형식 또는 property 접근 규약 방식 으로 불림
        public String getName() { // 꺼낼때

            return name;
        }

        public void setName(String name) { // 넣을때

            this.name = name;
        }
    }
}
