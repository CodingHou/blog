package com.blog.controller;


import com.blog.entity.Blog;
import com.blog.service.impl.BlogServiceImpl;
import com.blog.utils.Result;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping(value = "/save",method ={ RequestMethod.POST,RequestMethod.GET})
    public Result saveBlog(@Param("content")Byte[] content) {
        Blog blog = new Blog();
        blog.setMarkdownValue(content);
        Result res =  blogService.saveBlog(blog);
        return res;

    }

}
