package com.cn.classCard.controller;
import com.cn.classCard.dao.UserMapper;
import com.cn.classCard.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by darren on 2017/6/19.
 */
//证明是controller层并且返回json
@RestController
public class UserController {
    //依赖注入
    @Autowired
    UserMapper userMapper;
    @RequestMapping(value = "cs")
    public User cs() {
        //调用dao层
        User user = userMapper.selectUserByName("darren");
        return user;
    }
}
