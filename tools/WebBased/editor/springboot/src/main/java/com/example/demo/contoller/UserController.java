package com.example.demo.contoller;

import com.example.demo.Mapper.UserMapper;
import com.example.demo.common.Result;
import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping
@RestController("/user")

public class UserController {
    @Resource
    UserMapper userMapper;
    @PostMapping
    public Result<?> save(@RequestBody User user){
        userMapper.insert(user);
        return Result.success();
    }
}
