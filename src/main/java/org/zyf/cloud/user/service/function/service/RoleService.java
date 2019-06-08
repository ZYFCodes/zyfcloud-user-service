package org.zyf.cloud.user.service.function.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.zyf.cloud.common.dto.RoleDto;

/**
 * 描述：用户角色数据通道接口
 * 
 * @author 张彦峰
 * @date 2019.06.02
 *
 */
@Service
public interface RoleService
{
    public int insertRole(RoleDto roleDto);

    public int updateRole(RoleDto roleDto);

    public int deleteRole(Integer id);

    public RoleDto getRole(Integer id);

    public List<RoleDto> findRoles(String roleName, int start, int limit);
}
