package com.tourcoo.spl.mapper;

import com.tourcoo.spl.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {


    @Insert("INSERT INTO user(name,pwd,phone,born) VALUES(#{name},#{pwd},#{phone},#{born})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    int insert(User user);

    @Select("SELECT * FROM user")
    List<User> getAll();
}
