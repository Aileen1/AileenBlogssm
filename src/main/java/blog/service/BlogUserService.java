package blog.service;

import blog.dao.BlogUserDao;
import blog.model.BlogUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by  Aileen on 2017/11/29.
 */
@Service("blogUserService")
public class BlogUserService {
    @Autowired
    private BlogUserDao blogUserDao;


    // 添加用户
    public void addUser(BlogUser blogUser){
        blogUserDao.addUser(blogUser);
    }


    // 修改用户
    public void editUser(BlogUser blogUser){
        blogUserDao.editUser(blogUser);
    }

    // 查找所有的用户
    public List<BlogUser> pullBlogUsers(){
        return blogUserDao.pullBlogUsers();
    }







}
