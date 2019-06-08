package org.zyf.cloud.user.service.function.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;
import org.zyf.cloud.common.dto.RoleDto;

/**
 * 描述：用户角色表操作接口
 * 
 * @author 张彦峰
 * @date 2019.06.02
 *
 */
@Repository
@Mapper
public interface RoleMapper
{
    public int insertRole(RoleDto roleDto);

    public int updateRole(RoleDto roleDo);

    public int deleteRole(Integer id);

    public RoleDto getRole(Integer id);

    public List<RoleDto> findRoles(String roleName, RowBounds rowBounds);
}

