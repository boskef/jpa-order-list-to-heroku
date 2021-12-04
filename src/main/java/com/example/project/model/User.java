package com.example.project.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "TT_USER")
@NamedQueries({
        @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u"),
        @NamedQuery(name = "User.findUserLikeStartName", query = "SELECT u FROM User u WHERE u.user_name LIKE ':userName%'"),
        @NamedQuery(name = "User.findUserLikeEndName", query = "SELECT u FROM User u WHERE u.user_name LIKE '%:userName'"),
        @NamedQuery(name = "User.findUserByName", query = "SELECT u FROM User u WHERE u.user_name=:userName")
})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;

    @Column(name = "user_name")
    private String user_name;

    @Column(name = "user_surname")
    private String user_surname;

    @Column(name = "user_phone_number")
    private String user_phone_number;


    @OneToMany(mappedBy = "user")
    private List<Order> orderList;

    @Temporal(TemporalType.DATE)
    private Date user_created_date;


    public User(){

    }

    public User(String user_name, String user_surname, String user_phone_number, Date user_created_date) {
        this.user_name = user_name;
        this.user_surname = user_surname;
        this.user_phone_number = user_phone_number;
        this.user_created_date = user_created_date;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_surname() {
        return user_surname;
    }

    public void setUser_surname(String user_surname) {
        this.user_surname = user_surname;
    }

    public String getUser_phone_number() {
        return user_phone_number;
    }

    public void setUser_phone_number(String user_phone_number) {
        this.user_phone_number = user_phone_number;
    }

    public Date getUser_registered_date() {
        return user_created_date;
    }

    public void setUser_registered_date(Date user_registered_date) {
        this.user_created_date = user_registered_date;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public Date getUser_created_date() {
        return user_created_date;
    }

    public void setUser_created_date(Date user_created_date) {
        this.user_created_date = user_created_date;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_surname='" + user_surname + '\'' +
                ", user_phone_number='" + user_phone_number + '\'' +
                ", user_registered_date=" + user_created_date +
                '}';
    }
}
