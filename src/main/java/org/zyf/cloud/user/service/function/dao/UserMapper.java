package org.zyf.cloud.user.service.function.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;
import org.zyf.cloud.common.dto.UserDto;

/**
 * 描述：用户表操作接口
 * 
 * @author 张彦峰
 * @date 2019.06.02
 *
 */
@Repository
@Mapper
public interface UserMapper
{
    public int insertUser(UserDto userDto);

    public int updateUser(UserDto userDto);

    public int deleteUser(Integer id);

    public UserDto getUser(Integer id);

    public List<UserDto> findUsers(String UserName, RowBounds rowBounds); 
}

