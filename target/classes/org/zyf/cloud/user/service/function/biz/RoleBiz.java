package org.zyf.cloud.user.service.function.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.zyf.cloud.common.dto.RoleDto;
import org.zyf.cloud.user.service.function.service.RoleService;

/**
 * 描述：角色相关业务处理
 * 
 * @author 张彦峰
 * @date 2019.06.02
 *
 */
@Service
@Component
public class RoleBiz
{
    @Autowired
    private RoleService roleService;
    
    public RoleDto getRole(Integer id)
    {
        return this.roleService.getRole(id);
    }
}
