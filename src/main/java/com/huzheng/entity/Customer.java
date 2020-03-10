package com.huzheng.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author 胡正
 * @Date 2020/3/10 20:34
 * @Description 顾客实体类
 */
public class Customer implements Serializable {

    private static final long serialVersionUID = -2171578017025627374L;

    private Integer id;
    private String name;
    private String sex;
    private Integer age;
    private String tel;
    private String email;
    private Date createDate;
    private String username;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", createDate=" + createDate +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
