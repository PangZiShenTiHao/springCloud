package com.hxch.springutil.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @ClassName:SpringContextUtil
 * @Description:TODO
 * @Author:huangxc
 * @Date: 2019/11/28 0028 15:54
 **/
@Component
public class SpringContextUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (null == SpringContextUtil.applicationContext){
            SpringContextUtil.applicationContext = applicationContext;
        }

    }

    //获取 Application
    public static ApplicationContext getApplicationContext(){
        return SpringContextUtil.applicationContext;
    }

    // 通过名字获取 bean
    public static Object getBean(String beanName){
        return getApplicationContext().getBean(beanName);

    }

    // 通过类型 获取对象
    public static <T> T getBean(Class<T> clazz){
        return getApplicationContext().getBean(clazz);
    }

    //通过name,以及Clazz返回指定的Bean
    public static <T> T getBean(String beanName,Class<T> clazz){
        return getApplicationContext().getBean(beanName, clazz);
    }

}
