package org.zyf.cloud.user.service.function.service.impl;


import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.zyf.cloud.common.dto.UserDto;
import org.zyf.cloud.user.service.function.dao.UserMapper;
import org.zyf.cloud.user.service.function.service.UserService;

/**
 * 描述：用户数据通道接口实现类
 * 
 * @author 张彦峰
 * @date 2019.06.02
 *
 */
@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserMapper userDAO;
    
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int insertUser(UserDto userDto)
    {
        return userDAO.insertUser(userDto);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int updateUser(UserDto userDto)
    {
        return userDAO.updateUser(userDto);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int deleteUser(Integer id)
    {
        return userDAO.deleteUser(id);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public UserDto getUser(Integer id)
    {
        return userDAO.getUser(id);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<UserDto> findUsers(String UserName, int start, int limit)
    {
        return userDAO.findUsers(UserName, new RowBounds(start, limit));
    }
}
