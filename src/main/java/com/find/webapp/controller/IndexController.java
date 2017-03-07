package com.find.webapp.controller;

import com.find.webapp.dao.userMapper;
import com.find.webapp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created by User on 2017/3/3.
 */
@Controller
public class IndexController {
    @Autowired
    private userMapper userMapper;

    Logger logger = Logger.getLogger(IndexController.class.getName());
    public IndexController() {
        System.out.println("=====================初始化============");
    }

    @RequestMapping(value = "/")

    public String indexJSP() {
        logger.info("===============================> start");
        return "/View/success";
    }

    @RequestMapping(value = "/user")
    public void indexPage() {
        List<User> id= userMapper.getName();
        for (User u :id){
            System.out.println(u.getId());
            System.out.println(u.getName());
        }
        logger.info("========================>  end");
    }
}
