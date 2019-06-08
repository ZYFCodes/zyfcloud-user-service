package org.zyf.cloud.user.service.function.service.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.zyf.cloud.common.dto.RoleDto;
import org.zyf.cloud.user.service.function.dao.RoleMapper;
import org.zyf.cloud.user.service.function.service.RoleService;

/**
 * 描述：用户角色业务处理实现类
 * 
 * @author 张彦峰
 * @date 2019.06.02
 *
 */
@Service 
public class RoleServiceImpl implements RoleService
{
    @Autowired
    private RoleMapper roleDAO;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int insertRole(RoleDto roleDto)
    {
        return roleDAO.insertRole(roleDto);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int updateRole(RoleDto roleDto)
    {
        return roleDAO.updateRole(roleDto);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int deleteRole(Integer id)
    {
        return roleDAO.deleteRole(id);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public RoleDto getRole(Integer id)
    {
        return roleDAO.getRole(id);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<RoleDto> findRoles(String roleName, int start, int limit)
    {
        return roleDAO.findRoles(roleName, new RowBounds(start, limit));
    }
}
