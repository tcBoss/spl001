package com.tourcoo.spl.serviceimpl;

import com.tourcoo.spl.domain.User;
import com.tourcoo.spl.mapper.UserMapper;
import com.tourcoo.spl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int add(User user) {
        userMapper.insert(user);
        int id=user.getId();
        return 0;
    }
}
