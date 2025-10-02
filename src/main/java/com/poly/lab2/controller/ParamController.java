package com.poly.lab2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/param")
public class ParamController {

    // Hiển thị form ban đầu
    @RequestMapping("/form")
    public String form() {
        return "form";
    }

    // Nhận dữ liệu từ form
    @PostMapping("/save/{x}")
    public String save(@PathVariable("x") String x,      // Lấy từ URL: /param/save/2021
                       @RequestParam("y") String y,      // Lấy từ form field name="y"
                       Model model) {
        // Đưa dữ liệu ra view
        model.addAttribute("x", x);
        model.addAttribute("y", y);
        return "form";
    }
}
