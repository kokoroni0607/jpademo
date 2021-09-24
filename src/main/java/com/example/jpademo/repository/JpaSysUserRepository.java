package com.example.jpademo.repository;

import com.blinkfox.fenix.jpa.QueryFenix;
import com.example.jpademo.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

/**
 * @author weiming.zhu
 * @date 2021/9/23 16:32
 */
public interface JpaSysUserRepository extends JpaRepository<SysUser,Long> {
    @Override
    Optional<SysUser> findById(Long aLong);
    @QueryFenix
    SysUser getUserByCondition(@Param("condition")SysUser condition);
}
