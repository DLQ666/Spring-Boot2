package com.dlq.boot;

import ch.qos.logback.core.db.DBHelper;
import com.dlq.boot.bean.Pet;
import com.dlq.boot.bean.User;
import com.dlq.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * 主程序类
 * @SpringBootApplication：这是一个SpringBoot应用
 */
//@SpringBootApplication
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan("com.dlq.boot")
public class Boot01HelloworldApplication {

    public static void main(String[] args) {
        //1、返回我们IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(Boot01HelloworldApplication.class, args);

        //2、查看容器里面的所有组件
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

        /*//3、从容器中获取组件
        Pet tom01 = run.getBean("tom", Pet.class);
        Pet tom02 = run.getBean("tom", Pet.class);

        System.out.println("组件："+(tom01 == tom02));

        //4、com.dlq.boot.config.MyConfig$$EnhancerBySpringCGLIB$$4cc66ae0@410e94e
        MyConfig bean = run.getBean(MyConfig.class);
        System.out.println(bean);

        //如果@Configuration(proxyBeanMethods = true)代理对象调用方法。SpringBoot总会检查这个组件是否在容器中有。
        //保持组件单实例
        User user = bean.user01();
        User user1 = bean.user01();
        System.out.println(user == user1);

        User user01 = run.getBean("user01", User.class);
        Pet tom = run.getBean("tom", Pet.class);
        System.out.println("用户的宠物："+(user01.getPet() == tom));

        System.out.println("--------------------------------------");

        String[] beanNamesForType = run.getBeanNamesForType(User.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
        DBHelper bean1 = run.getBean(DBHelper.class);
        System.out.println(bean1);*/

        boolean tom = run.containsBean("tom");
        System.out.println("容器中Tom组件："+tom);

        boolean user01 = run.containsBean("user01");
        System.out.println("容器中user01组件："+user01);

        boolean tom22 = run.containsBean("tom22");
        System.out.println("容器中tom22组件："+tom22);

        boolean hahaha = run.containsBean("hahaha");
        System.out.println("容器中hahaha组件："+hahaha);

        boolean hehehe = run.containsBean("hehehe");
        System.out.println("容器中hehehe组件："+hehehe);
    }
}
