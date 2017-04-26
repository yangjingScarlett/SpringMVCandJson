package com.mkyong.common.controller;

import com.mkyong.common.model.Shop;
import com.mkyong.common.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/kfc/brands")
public class JSONController {
    public
    @RequestMapping("/shop")
    @ResponseBody
    Shop getShopInJSON() {

        Shop shop = new Shop();
        shop.setName("yang");
        shop.setStaffName(new String[]{"mkyong1", "mkyong2"});

        return shop;
    }

    public
    @RequestMapping("/user")
    @ResponseBody
    User getUserInJSON() {
        User user = new User("huahua", "male");
        return user;
    }

}