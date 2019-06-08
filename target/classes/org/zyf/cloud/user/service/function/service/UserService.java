package org.zyf.cloud.user.service.function.service;

import java.util.List;

import org.zyf.cloud.common.dto.UserDto;


/**
 * 描述：用户数据通道接口
 * 
 * @author 张彦峰
 * @date 2019.06.02
 *
 */
public interface UserService
{
    public int insertUser(UserDto userDto);

    public int updateUser(UserDto userDto);

    public int deleteUser(Integer id);

    public UserDto getUser(Integer id);

    public List<UserDto> findUsers(String userName, int start, int limit);
}
