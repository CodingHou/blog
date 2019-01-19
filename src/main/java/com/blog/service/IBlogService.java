package com.blog.service;

import com.blog.entity.Blog;
import com.baomidou.mybatisplus.extension.service.IService;
import com.blog.utils.Result;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author codinghou
 * @since 2019-01-14
 */
public interface IBlogService extends IService<Blog> {

    Result saveBlog(Blog blog);

}
