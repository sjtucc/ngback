package cc.ngback.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cc.ngback.mapper.RoleMapper;
import cc.ngback.model.Role;

/**
 * 角色Service实现类
 *
 * @author StarZou
 * @since 2014年6月10日 下午4:16:33
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Resource
    private RoleMapper roleMapper;



    @Override
    public List<Role> selectRolesByUserId(Long userId) {
        return roleMapper.selectRolesByUserId(userId);
    }

}
