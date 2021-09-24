/*
Copyright [2020] [https://www.xiaonuo.vip]

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

Snowy采用APACHE LICENSE 2.0开源协议，您在使用过程中，需要注意以下几点：

1.请不要删除和修改根目录下的LICENSE文件。
2.请不要删除和修改Snowy源码头部的版权声明。
3.请保留源码和相关描述文件的项目出处，作者声明等。
4.分发源码时候，请注明软件出处 https://gitee.com/xiaonuobase/snowy-layui
5.在修改包名，模块名称，项目代码等时，请注明软件出处 https://gitee.com/xiaonuobase/snowy-layui
6.若您的项目无法满足以上几点，可申请商业授权，获取Snowy商业授权许可，请在官网购买授权，地址为 https://www.xiaonuo.vip
 */
package com.example.jpademo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.hibernate.Hibernate;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * 系统用户表
 *
 * @author xuyuxiang
 * @date 2020/3/5 12:25
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Entity
@Table(name = "sys_user")
@EntityListeners(AuditingEntityListener.class)
public class SysUser {

    /**
     * 主键
     */
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * 账号
     */
    @Column(name = "account")
    private String account;

    /**
     * 密码
     */
    @Column(name = "password")
    private String password;

    /**
     * 昵称
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 姓名
     */
    @Column(name = "name")
    private String name;

    /**
     * 头像
     */
    @Column(name = "avatar")
    private Long avatar;

    /**
     * 生日
     */
    @Column(name = "birthday")
    private Date birthday;

    /**
     * 性别(字典 1男 2女 3未知)
     */
    @Column(name = "sex")
    private Integer sex;

    /**
     * 邮箱
     */
    @Column(name = "email")
    private String email;

    /**
     * 手机
     */
    @Column(name = "phone")
    private String phone;

    /**
     * 电话
     */
    @Column(name = "tel")
    private String tel;

    /**
     * 最后登陆IP
     */
    @Column(name = "last_login_ip")
    private String lastLoginIp;

    /**
     * 最后登陆时间
     */
    @Column(name = "last_login_time")
    private Date lastLoginTime;

    /**
     * 管理员类型（1超级管理员 2非管理员）
     */
    @Column(name = "admin_type")
    private Integer adminType;

    /**
     * 状态（字典 0正常 1停用 2删除）
     */
    @Column(name = "status")
    private Integer status;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @CreatedDate
    private Date createTime;

    /**
     * 创建人
     */
    @Column(name = "create_user")
    @CreatedBy
    private Long createUser;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @LastModifiedDate
    private Date updateTime;

    /**
     * 更新人
     */
    @Column(name = "update_user")
    @LastModifiedBy
    private Long updateUser;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        SysUser sysUser = (SysUser) o;
        return Objects.equals(id, sysUser.id);
    }

    @Override
    public int hashCode() {
        return 0;
    }


}
