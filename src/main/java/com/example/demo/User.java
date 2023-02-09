package com.example.demo;

import javax.persistence.*;

//you have to create database manually and the table creation is the thing which can be taking care by the
//hibernate
@Entity // it is used to tell hibermnate conssidered this entity to make a table of it and column for its all the attribute
@Table(name="details",uniqueConstraints=@UniqueConstraint(columnNames= {"userId","userName","userMobNo","userStudy"})) // give table name to user-info
public class User {
    @Id
    @Column(name="userId")
    private int userId;

    @Column(name="userName")
    private String userName;

    @Column(name="userMobNo")
    private String userMobNo;

    @Column(name="userStudy")
    private String userStudy;

    //always make a default constructor because spring boot use it make a beans object there for
    public User(){

    }
    public User(int userId,String userName,String userMobNo,String userStudy){
        this.userId = userId;
        this.userName = userName;
        this.userMobNo = userMobNo;
        this.userStudy = userStudy;
    }

    //always make getter and setter method there


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserMobNo() {
        return userMobNo;
    }

    public void setUserMobNo(String userMobNo) {
        this.userMobNo = userMobNo;
    }

    public String getUserStudy() {
        return userStudy;
    }

    public void setUserStudy(String userStudy) {
        this.userStudy = userStudy;
    }
}
