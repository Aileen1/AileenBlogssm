package blog.config;

import com.sun.deploy.association.utility.AppAssociationWriter;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.PathResource;
import org.springframework.core.io.Resource;

import javax.sql.DataSource;
import java.net.URL;

/**
 * Created by  Aileen on 2017/12/1.
 */
@Configuration
public class BlogConfig implements ApplicationContextAware {
    private  ApplicationContext applicationContext ;

    private DataSource dataSource;
    @Bean("sqlSessionFactory")
    public SqlSessionFactoryBean sqlSessionFactoryBean(){

        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        URL resource2 = this.getClass().getResource("/");
        String string = resource2.toString();
        string = string.replace("file:/", "");
        Resource resource1 = new PathResource(string+"blog/model/BlogUserMapper.xml");
        Resource[] resources ={resource1};
        sqlSessionFactoryBean.setMapperLocations(resources);
        return sqlSessionFactoryBean;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("blog.dao");
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        return mapperScannerConfigurer;
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        dataSource= (DataSource) applicationContext.getBean("dataSource");
    }
}
