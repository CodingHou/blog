package com.blog.service.impl;

import com.alibaba.fastjson.JSON;
import com.blog.entity.Blog;
import com.blog.mapper.BlogMapper;
import com.blog.service.IBlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blog.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;

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
        blog.setCreateTime(LocalDateTime.now());
        blog.setUpdateTime(LocalDateTime.now());
        int c = blogMapper.insert(blog);
        Result res = new Result();
        if (c == 0) {
            res.fail("9999","保存失败");
        }
        System.out.println(JSON.toJSONString(blog));
        res.success("0000","保存成功");
        res.setData(String.valueOf(blog.getId()));
        return  res;
    }

    @Override
    public Result updateBlog(Blog blog) {
        blog.setUpdateTime(LocalDateTime.now());
        int c = blogMapper.updateById(blog);
        Result res = new Result();
        if (c == 0) {
            res.fail("9999","更新失败");
        }
        System.out.println(JSON.toJSONString(blog));
        res.success("0000","更新成功");
        return  res;
    }

    public Result listBlog(String param,String theme,int userId){
        Result result = new Result();
        return null;

    }
}
