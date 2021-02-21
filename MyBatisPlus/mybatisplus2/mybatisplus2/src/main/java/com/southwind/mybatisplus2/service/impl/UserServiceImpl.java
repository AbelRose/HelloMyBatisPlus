package com.southwind.mybatisplus2.service.impl;

import com.southwind.mybatisplus2.entity.User;
import com.southwind.mybatisplus2.mapper.UserMapper;
import com.southwind.mybatisplus2.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author southwind
 * @since 2020-05-17
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
