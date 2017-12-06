package blog.dao;

import blog.model.BlogInfo;


import java.util.List;

/**
 * Created by  Aileen on 2017/12/1.
 */

public interface BlogInfoDao  {

    // 添加
    String addBlog(BlogInfo blogInfo);

    // 修改
    String editBlog(BlogInfo blogInfo);

    // 找出作者的所有文章
    List<BlogInfo> pullBlogsByAuthor(String author);

    // 通过id获取博客
    BlogInfo pullBlogById (String id );

    // 删除博客
    void delBlogInfo(String id );


}
