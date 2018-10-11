package com.jk.service;

import com.jk.domain.User;
import com.jk.mapper.UserMapper;
import com.jk.utils.StringUUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <pre>项目名称：springboot-one
 * 类名称：UserServiceImpl
 * 类描述：
 * 创建人：史航启
 * 创建时间：2018/10/10 16:23
 * 修改人：史航启
 * 修改时间：2018/10/10 16:23
 * 修改备注：
 * @version </pre>
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryUser() {
        return userMapper.queryUser();
    }

    @Override
    public void addUser(User user) {
        user.setId(StringUUID.StringUtil());
        userMapper.addUser(user);
    }

    @Override
    public void deleteUser(String ids) {
        userMapper.deleteUser(ids);
    }

    @Override
    public User queryUserById(String id) {
        return userMapper.queryUserById(id);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }
}
