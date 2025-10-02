package com.poly.lab2.controller;

import com.poly.lab2.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {

    @GetMapping("/product/form")
    public String form(Model model) {
        model.addAttribute("product", new Product()); // gán object trống để tránh null
        return "product/form";
    }

    @PostMapping("/product/save")
    public String save(@ModelAttribute Product product, Model model) {
        model.addAttribute("product", product); // gửi lại dữ liệu để hiển thị
        return "product/form";
    }
}
