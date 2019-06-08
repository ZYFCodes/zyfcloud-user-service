package org.zyf.cloud.user.service.function.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.zyf.cloud.common.dto.RoleDto;
import org.zyf.cloud.common.dto.UserDto;
import org.zyf.cloud.user.service.function.biz.RoleBiz;

/**
 * 描述：角色控制器
 * 
 * @author 张彦峰
 * @date 2019.06.02
 *
 */

@RestController
@RequestMapping("role")
public class RoleController
{
    @Autowired
    private RoleBiz roleBiz;

    @RequestMapping(value = "/getRoleInfo/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public RoleDto getRole(@RequestParam("id") Integer id)
    {
        return roleBiz.getRole(id);
    }
    
    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public UserDto getInfo()
    {
        return new UserDto();
    }
}
