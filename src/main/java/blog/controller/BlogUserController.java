package blog.controller;

import blog.model.BlogUser;
import blog.service.BlogUserService;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by  Aileen on 2017/11/29.
 */
@RestController
@RequestMapping("/blogUserController")
public class BlogUserController {
    Logger logger = Logger.getLogger(BlogUserController.class);

    private BlogUserService blogUserService;

    public BlogUserService getBlogUserService() {
        return blogUserService;
    }

    @Autowired
    public void setBlogUserService(BlogUserService blogUserService) {
        this.blogUserService = blogUserService;
    }

    @GetMapping("/test")
    public String test() {
        logger.info("1231312313213");
        BlogUser blogUser= new BlogUser();
        blogUser.setUserName("sdfsdfsd");
        blogUserService.addUser(blogUser);
        return "sdfsdf";
    }


    @GetMapping("/pullBlogUsers")
    public String pullBlogUsers() {
        logger.info("1231312313213");
        blogUserService.pullBlogUsers();
        return "sdfsdf";
    }




    @ExceptionHandler({Exception.class})
    public Object exe(Exception ex){
        logger.error(ex.getMessage(),ex);
        return "22323";
    }
}
