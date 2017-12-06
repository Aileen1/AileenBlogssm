package blog.service;

import blog.dao.BlogInfoDao;
import blog.model.BlogInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by  Aileen on 2017/11/30.
 */
@Service("blogInfoService")
public class BlogInfoService {


    private BlogInfoDao blogInfoDao;


    public BlogInfoDao getBlogInfoDao() {
        return blogInfoDao;
    }

    @Autowired
    public void setBlogInfoDao(BlogInfoDao blogInfoDao) {
        this.blogInfoDao = blogInfoDao;
    }

    // 获取该作者的所有博客
    public void pullBlogsByAuthor(String author) {
        blogInfoDao.pullBlogsByAuthor(author);
    }

    // 添加博客
    public void addBlog(BlogInfo blogInfo) {
        blogInfoDao.addBlog(blogInfo);
    }

    //修改博客
    public void editBlog(BlogInfo blogInfo) {
        blogInfoDao.editBlog(blogInfo);
    }

    // 查看博客详情
    public void pullBlogInfoById(String id) {
        blogInfoDao.pullBlogById(id);
    }


}
