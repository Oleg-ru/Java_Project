package com.vk.olegSux;

import com.vk.olegSux.domain.Message;
import com.vk.olegSux.repos.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController {
    @Autowired
    private MessageRepo messageRepo;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(
                            name="name",
                            required=false,
                            defaultValue="World") String name,
                            Map<String, Object> model) {
        model.put("name", name);
        return "greeting";
    }
    @GetMapping
    public String main(Map<String, Object> model){
        Iterable <Message> message = messageRepo.findAll();
        model.put("messages", message);
        return "main";
    }

}
