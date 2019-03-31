package controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class Main {

    @GetMapping("/")
    private String ham1(){
        return "index";
    }

    @PostMapping("/")
    private String ham2(@RequestParam String english, Model model){
        Map<String,String> danhSach = new HashMap<>();
        danhSach.put("hello","xin chào");
        danhSach.put("how","như thế nào");
        danhSach.put("sorry","Xin lỗi");
        danhSach.put("computer","máy vi tính");
        danhSach.put("code","Mã");

        if("".equals(english)){
            model.addAttribute("WordError","you must input the word");
            return "index";
        }
        else{
            int i = 0;
            for (Map.Entry<String,String> x:danhSach.entrySet()){
                if(x.getKey().equals(english.toLowerCase())){
                    i++;
                    model.addAttribute("vietNameseWord",x.getValue());
                    model.addAttribute("englishWord",english);
                }
            }
            if (i == 0){
                model.addAttribute("result","Can't found");
            }
        }
        return "index";
    }
}
