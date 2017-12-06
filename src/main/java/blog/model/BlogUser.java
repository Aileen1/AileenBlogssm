package blog.model;

import common.BlogCommenConst.UserType;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by  Aileen on 2017/11/29.
 */
@Getter
@Setter
public class BlogUser {

    private String id;
    private String userName; // 用户名
    private String password; // 密码
    private String author; // 真实姓名
    private UserType userType; // 用户类型
    private int age; // 年龄
    private String gender; // 性别


}
