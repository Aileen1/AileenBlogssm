package blog.dao;

import blog.model.BlogUser;

import java.util.List;

/**
 * Created by  Aileen on 2017/11/30.
 */
public interface BlogUserDao {


    // 添加用户 -> 返回该用户的id
    void addUser(BlogUser blogUser);

    // 更新用户
    String editUser(BlogUser blogUser);

    // 通过用户名查找用户
    String pullUserByUserName(String userName);

    List<BlogUser> pullBlogUsers();



}
