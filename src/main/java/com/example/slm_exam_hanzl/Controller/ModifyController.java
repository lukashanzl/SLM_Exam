package com.example.slm_exam_hanzl.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModifyController {

    private String lastString;

    @RequestMapping("/api/modify")
    public String modifyString(
            @RequestParam String string
    ){
        String r = "";
        for (int i = 0; i < string.length(); i++) {
            if (i % 2 == 0) {
                r += string.substring(i, i + 1);
            } else {
                r += string.substring(i, i + 1).toUpperCase();
            }
        }
        lastString = r;
        return r;
    }
}
