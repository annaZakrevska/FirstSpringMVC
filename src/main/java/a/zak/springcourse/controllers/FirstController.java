package a.zak.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstController {

    /*@GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model) {

        model.addAttribute("message", "Hello, " + name + " " + surname);
        return "first/hello";
    }*/
    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "a") String a,
                            @RequestParam(value = "b") String b,
                            @RequestParam(value = "action") String action,
                            Model model) {
        int res = 0;
        int intA = Integer.parseInt(a);
        int intB = Integer.parseInt(b);
        switch(action){
            case "multiplication":
                res = intA*intB;
                break;
            case "addition":
                res = intA+intB;
                break;
            case "subtraction":
                res = intA-intB;
                break;
            case "division":
                if(intB==0){
                    res = 0;
                }else{
                    res = intA/intB;
                }
                break;
        }
        model.addAttribute("message", "Your result:  " + res);
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodbyePage() {
        return "first/goodbye";
    }
}

