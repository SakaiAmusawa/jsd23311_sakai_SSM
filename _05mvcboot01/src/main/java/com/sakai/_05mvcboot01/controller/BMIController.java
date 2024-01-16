package com.sakai._05mvcboot01.controller;

import com.sakai._05mvcboot01.pojo.dto.BMIDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BMIController {
    @RequestMapping("/bmi")
    @ResponseBody
    public String bmi(Double kg, Double high) {
        return getBMI(kg, high);
    }

    @RequestMapping("/bmi2")
    @ResponseBody
    public String bmi2(BMIDTO bmidto) {
        Double kg = bmidto.getKg();
        Double high = bmidto.getHigh();
        return getBMI(kg, high);
    }

    private String getBMI(Double kg, Double high) {
        double bmi = kg / (high * high);
        String result;
        if (bmi < 18.5) {
            result = "偏瘦";
        } else if (bmi < 24) {
            result = "正常";
        } else if (bmi < 27) {
            result = "正常";
        } else {
            result = "肥胖";
        }
        return result;
    }
}
