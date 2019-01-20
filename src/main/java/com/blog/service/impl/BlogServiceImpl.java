package com.blog.service.impl;

import com.alibaba.fastjson.JSON;
import com.blog.entity.Blog;
import com.blog.mapper.BlogMapper;
import com.blog.service.IBlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blog.utils.Result;
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
    public Result saveBlog(Blog blog) {
        blogMapper.insert(blog);
        System.out.println(JSON.toJSONString(blog));
        Result res = new Result();
        res.success("0000","保存成功");
        res.setData(String.valueOf(blog.getId()));
        return  res;
    }
}
