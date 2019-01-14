package com.codinghou.blog.service.impl;

import com.codinghou.blog.entity.Theme;
import com.codinghou.blog.mapper.ThemeMapper;
import com.codinghou.blog.service.IThemeService;
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
public class ThemeServiceImpl extends ServiceImpl<ThemeMapper, Theme> implements IThemeService {

}
