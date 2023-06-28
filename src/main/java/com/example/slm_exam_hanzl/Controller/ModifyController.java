package com.example.slm_exam_hanzl.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModifyController {

    private String lastString = "";

    @RequestMapping("/api/modify")
    public String modifyString(
            @RequestParam String string
    ){
        // codeblock taken from URL: https://stackoverflow.com/questions/28933885/how-to-capitalize-every-other-letter-in-a-string-efficiently-in-java
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

    @RequestMapping("/api/modify/length")
    public int checkStringLength(String lastString){
        return lastString.length();
    }
}
