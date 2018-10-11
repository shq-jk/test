package com.jk.service;

import com.jk.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserService {
    
    List<User> queryUser();

    void addUser(User user);

    void deleteUser(String ids);

    User queryUserById(String id);

    void updateUser(User user);
}
