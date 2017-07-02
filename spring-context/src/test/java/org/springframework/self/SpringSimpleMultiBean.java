package org.springframework.self;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * SpringSimpleMultiBean
 *
 * @author longhuashen
 * @since 17/7/2
 */
public class SpringSimpleMultiBean implements BeanFactoryAware, BeanNameAware, BeanFactoryPostProcessor, BeanPostProcessor, InitializingBean{

    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SpringSimpleMultiBean() {
        System.out.println("构造函数 init");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean接口具体实现 begin and id is " + id + " and name is " + name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryName初始化 begin and BeanFactory is" + beanFactory);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryPostProcessor 接口初始化 begin and this beanFactory is "+beanFactory);
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor接口 before 初始化 postProcessBeforeInitialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor接口 after 初始化 postProcessAfterInitialization");
        return bean;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("BeanNameAware初始化 set BeanName begin and name is "+name);
    }

    public void initMethod() {
        System.out.println("init method Begin");
    }

    public void say(){
        System.out.println("hello I am " + name);
    }
}
