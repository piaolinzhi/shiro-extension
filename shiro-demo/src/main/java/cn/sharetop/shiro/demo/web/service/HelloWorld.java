package cn.sharetop.shiro.demo.web.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 待切入的类
 * @author piaolinzhi
 */
@Component
public class HelloWorld {

    private static final Logger LOG = LoggerFactory
            .getLogger(HelloWorld.class);

    /**
     * 待切入方法
     */
    public String sayHello() {
        LOG.warn("hello world !");
        return "hello world !";
    }
}
