package com.example.jpademo.controller;

import com.example.jpademo.entity.SysUser;
import com.example.jpademo.service.JpaSysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author weiming.zhu
 * @date 2021/9/23 16:58
 */
@Slf4j
@Controller
@RequestMapping("/SysUser")
public class SysUserController {
    @Autowired
    private JpaSysUserService userService;

    /**
     * 新增用户
     */
    @PostMapping("/addUser")
    public SysUser addUser(@RequestBody SysUser user){
        return userService.insertUser(user);
    }

    @PostMapping("/queryUser")
    @ResponseBody
    public SysUser queryUser(@RequestBody SysUser user){
        return userService.getUserByCondition(user);
    }

}