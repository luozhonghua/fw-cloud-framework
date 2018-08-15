package com.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by luozhonghua on 2018/8/12.
 */



@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getAccountById(@PathVariable("name") String name) {

        return userService.findUser(name);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String save(@RequestParam(value = "name") String name) {
        int t= userService.add(name,0);
        if(t==1) {
            return "success";
        }else {
            return "fail";
        }

    }


}
