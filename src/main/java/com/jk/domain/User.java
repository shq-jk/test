package com.jk.domain;

import java.io.Serializable;

/**
 * <pre>项目名称：springboot-one
 * 类名称：User
 * 类描述：
 * 创建人：史航启
 * 创建时间：2018/10/10 16:52
 * 修改人：史航启
 * 修改时间：2018/10/10 16:52
 * 修改备注：
 * @version </pre>
 */
public class User implements Serializable {

    private String id;

    private String name;

    private String loginNumber;

    private String password;

    private String roleId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginNumber() {
        return loginNumber;
    }

    public void setLoginNumber(String loginNumber) {
        this.loginNumber = loginNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", loginNumber='" + loginNumber + '\'' +
                ", password='" + password + '\'' +
                ", roleId='" + roleId + '\'' +
                '}';
    }
}
