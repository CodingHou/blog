package com.blog.controller;


import com.blog.entity.Blog;
import com.blog.service.impl.BlogServiceImpl;
import com.blog.utils.Result;
import com.blog.vo.BlogVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

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
    public Result saveBlog(@RequestBody BlogVO vo) {
        Blog blog = new Blog();
        blog.setMarkdownValue(vo.getContent());
        Result res =  blogService.saveBlog(blog);
        return res;

    }

}
