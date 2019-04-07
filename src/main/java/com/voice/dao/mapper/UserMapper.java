package com.voice.dao.mapper;

import com.voice.web.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
@Component(value = "userMapper")
public interface UserMapper extends BaseMapper<User> {

//    int deleteByPrimaryKey(Integer id);
//
//    int insert(User record);
//
//    User selectByPrimaryKey(Integer id);
//
//    List<User> selectAll();
//
//    int updateByPrimaryKey(User record);
}