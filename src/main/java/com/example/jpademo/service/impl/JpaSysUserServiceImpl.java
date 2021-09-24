package com.example.jpademo.service.impl;

import com.example.jpademo.entity.SysUser;
import com.example.jpademo.repository.JpaSysUserRepository;
import com.example.jpademo.service.JpaSysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author weiming.zhu
 * @date 2021/9/23 16:55
 */
@Service
public class JpaSysUserServiceImpl implements JpaSysUserService {
    @Resource
    private JpaSysUserRepository jpaUserRepository;
    @Override
    public SysUser insertUser(SysUser user) {
        return jpaUserRepository.save(user);
    }

    @Override
    public SysUser getUserByCondition(SysUser condition) {
        return jpaUserRepository.getUserByCondition(condition);
    }
}
