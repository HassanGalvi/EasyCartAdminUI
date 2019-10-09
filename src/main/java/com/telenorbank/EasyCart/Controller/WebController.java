package com.telenorbank.EasyCart.Controller;

import com.telenorbank.EasyCart.Domain.Product;
import com.telenorbank.EasyCart.Domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
    @RequestMapping("/index")
    public String blank(User user){
        return "index";}
    @GetMapping("/Products")
    public String bags(User user){
        return "Products";}
        @GetMapping("/Add")
      public String forms(Product product){
            return "Add";
    }
    @PostMapping ("/Add")
    public String Add(Product product){
        System.out.println(product.getProduct_name());
        return "Products";
    }





}
