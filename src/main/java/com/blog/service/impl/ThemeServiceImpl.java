package com.blog.service.impl;

import com.blog.entity.Theme;
import com.blog.mapper.ThemeMapper;
import com.blog.service.IThemeService;
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
