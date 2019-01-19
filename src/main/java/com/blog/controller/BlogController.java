package com.blog.controller;


import com.blog.entity.Blog;
import com.blog.service.impl.BlogServiceImpl;
import com.blog.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Blob;

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

    @RequestMapping("/save")
    public Result saveBlog(Blob content) {
        Blog blog = new Blog();
        blog.setMarkdownValue(content);
        Result res =  blogService.saveBlog(blog);
        return res;

    }

}
