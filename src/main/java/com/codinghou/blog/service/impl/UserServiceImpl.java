package com.codinghou.blog.service.impl;

import com.codinghou.blog.entity.User;
import com.codinghou.blog.mapper.UserMapper;
import com.codinghou.blog.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author codinghou
 * @since 2019-01-13
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
