package com.codinghou.blog.service.impl;

import com.alibaba.fastjson.JSON;
import com.codinghou.blog.entity.Blog;
import com.codinghou.blog.mapper.BlogMapper;
import com.codinghou.blog.service.IBlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author codinghou
 * @since 2019-01-14
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements IBlogService {

    @Autowired
    private BlogMapper blogMapper;

    @Override
    public Blog saveBlog(Blog blog) {
        blogMapper.insert(blog);
        System.out.println(JSON.toJSONString(blog));
        return blog;
    }
}
