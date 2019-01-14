package com.codinghou.blog.service;

import com.codinghou.blog.entity.Blog;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author codinghou
 * @since 2019-01-14
 */
public interface IBlogService extends IService<Blog> {

    Blog saveBlog(Blog blog);

}
