package com.example.jpademo.service;

import com.example.jpademo.entity.SysUser;

/**
 * @author weiming.zhu
 * @date 2021/9/23 16:45
 */
public interface JpaSysUserService {

    /**
     * 新增用户
     * @param user 用户对象
     */
    SysUser insertUser(SysUser user);

    SysUser getUserByCondition(SysUser condition);

}
