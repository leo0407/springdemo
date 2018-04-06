package com.leo.demo.foundation.druid;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;

@Configuration
public class DruidMonitorConfig {
    /**
     * 注册ServletRegistrationBean
     * 
     * @return
     */
    @Bean
    public ServletRegistrationBean<StatViewServlet> registrationBean() {
        ServletRegistrationBean<StatViewServlet> bean = new ServletRegistrationBean<>(new StatViewServlet(),
                "/druid/*");
        // 白名单
        bean.addInitParameter("allow", "127.0.0.1");
        // 黑名单
        // bean.addInitParameter("deny", "127.0.0.1");
        // 登录查看信息的账号
        bean.addInitParameter("loginUsername", "admin");
        bean.addInitParameter("loginPassword", "123456");
        // 是否能够重置数据
        bean.addInitParameter("resetEnable", "false");

        return bean;
    }

    /**
     * 注册FilterRegistrationBean
     * 
     * @return
     */
    @Bean
    public FilterRegistrationBean<WebStatFilter> druidStatFilter() {
        FilterRegistrationBean<WebStatFilter> bean = new FilterRegistrationBean<>(new WebStatFilter());
        // 添加过滤规则
        bean.addUrlPatterns("/*");
        // 添加不需要忽略的格式信息
        bean.addInitParameter("exclusions", "*.js,*.gif,*.jpg，*。png,*.css,*.ico,/druid/*");

        return bean;
    }
}
