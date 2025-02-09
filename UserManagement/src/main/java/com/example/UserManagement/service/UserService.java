package com.example.UserManagement.service;

import com.example.UserManagement.bean.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserService {

    public static int userCount =5;
    private static List<User> userlist = new ArrayList<>();

    static{
        userlist.add(new User(1, "Robert",new Date()));
        userlist.add(new User(2, "John",new Date()));
        userlist.add(new User(3, "Adam",new Date()));
        userlist.add(new User(4, "Andrew",new Date()));
        userlist.add(new User(5, "Jack",new Date()));

    }

    public List<User> findAllUser(){
        return userlist;
    }

    public User findOne(int id){
        for(User user: userlist){
            if(user.getId() ==id){
                return user;
            }
        }
        return null;
    }

    public User save(User user) {
//        if(user.getId()== null){
//            user.setId(++userCount);
//        }
        ++userCount;
        userlist.add(user);
        return user;
    }
}
