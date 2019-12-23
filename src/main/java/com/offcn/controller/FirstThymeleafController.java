package com.offcn.controller;

import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class FirstThymeleafController {

    @RequestMapping("/first")
    public String first(Model model) {
        String message = "hello thymeleaf!!!";
        model.addAttribute("message", message);
        return "index";
    }

    @RequestMapping("/second")
    public String second(Model model) {
        String message = "hello thymeleaf!!!";
        model.addAttribute("message", message);
        User user = new User(1, "zs", 34);
        Map map = new HashMap<>();
        map.put("src1", "1.jpg");
        map.put("src2", "2.jpg");
        model.addAttribute("user", user);
        model.addAttribute("photo", map);
        return "index";
    }

    @RequestMapping("/third")
    public String third(Model model) {
        String message = "hello thymeleaf!!!";
        model.addAttribute("message", message);
        User user1 = new User(1, "zd", 31);
        User user2 = new User(2, "zf", 32);
        User user3 = new User(3, "zg", 33);
        User user4 = new User(4, "zh", 34);
        List<User> list = new ArrayList();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        model.addAttribute("list",list);

        return "index";
    }
}
