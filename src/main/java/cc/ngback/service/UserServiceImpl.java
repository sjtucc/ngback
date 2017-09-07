package cc.ngback.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cc.ngback.mapper.UserMapper;
import cc.ngback.model.User;
import cc.ngback.model.UserExample;


/**
 * 用户Service实现类
 *
 * @author StarZou
 * @since 2014年7月5日 上午11:54:24
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource	
    private UserMapper userMapper;
	
    @Override
    public int insert(User model) {
        return userMapper.insertSelective(model);
    }
    
    @Override
    public User authentication(User user) {
        return userMapper.authentication(user);
    }
    
    @Override
    public int update(User model) {
        return userMapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public int delete(Long id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public User selectById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public User selectByUsername(String username) {
        UserExample example = new UserExample();
        example.createCriteria().andUsernameEqualTo(username);
        final List<User> list = userMapper.selectByExample(example);
        return list.get(0);
    }

    

}
