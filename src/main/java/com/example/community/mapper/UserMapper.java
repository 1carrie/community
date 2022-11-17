package com.example.community.mapper;

import com.example.community.Model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Insert({"insert into User_user (name,account_id,token,gmt_create,gmt_modified) values (#{name},#{account_id},#{token},#{gmtCreate},#{gmtModified})"})
    void insert(User user);
}
