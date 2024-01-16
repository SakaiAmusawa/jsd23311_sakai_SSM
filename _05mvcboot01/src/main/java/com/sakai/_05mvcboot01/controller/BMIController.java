package com.sakai._05mvcboot01.controller;

import com.sakai._05mvcboot01.pojo.dto.BMIDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BMIController {

    /**
     * <a href="http://localhost:8080/bmi?weight=50&height=1.75">测试链接</a>
     */
    @RequestMapping("/bmi")
    @ResponseBody
    public String bmi(Double weight, Double height) {
        return getBMI(weight, height);
    }

    /**
     * <a href= http://localhost:8080/bmi2?weight=90&height=1.75>测试链接</a>
     */
    @RequestMapping("/bmi2")
    @ResponseBody
    public String bmi2(BMIDTO bmidto) {
        Double height = bmidto.getHeight();
        Double weight = bmidto.getWeight();
        return getBMI(weight, height);
    }

    private String getBMI(Double weight, Double height) {
        double bmi = weight / (height * height);
        String result;
        if (bmi < 18.5) {
            result = "偏瘦";
        } else if (bmi < 24) {
            result = "正常";
        } else if (bmi < 27) {
            result = "微胖";
        } else {
            result = "肥胖";
        }
        return result;
    }
}
