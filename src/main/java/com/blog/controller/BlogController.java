package com.blog.controller;


import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.blog.entity.Blog;
import com.blog.service.impl.BlogServiceImpl;
import com.blog.utils.Result;
import com.blog.vo.BlogVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author codinghou
 * @since 2019-01-13
 */
@RestController
@SpringBootApplication
@RequestMapping("/blog")
public class BlogController extends BaseController {

    @Autowired
    private BlogServiceImpl blogService;

    @ResponseBody
    @RequestMapping(value = "/save",method ={ RequestMethod.POST,RequestMethod.GET})
    public Result saveBlog(@RequestBody Blog blog) {
//        blog.setMarkdownValue(vo.getContent());
        System.out.println(JSON.toJSONString(blog));
        Result res = blogService.saveBlog(blog);
        return res;

    }

    @ResponseBody
    @RequestMapping(value = "/update",method ={ RequestMethod.POST,RequestMethod.GET})
    public Result updateBlog(@RequestBody Blog blog){
        Result res = blogService.updateBlog(blog);
        return res;
    }

    @ResponseBody
    @RequestMapping(value = "/list",method ={ RequestMethod.POST,RequestMethod.GET})
    public Result listBlog(String param) {
        Wrapper wrapper = new QueryWrapper();
        List<Blog> list = blogService.list();
        Result result = new Result();
        result.setData(JSON.toJSONString(list));
        return result ;
    }
}
