package cn.sharetop.shiro.demo.web.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author piaolinzhi 切面类
 */
@Aspect
@Component
public class MyAspectJDemo {

    private static final Logger LOG = LoggerFactory
            .getLogger(MyAspectJDemo.class);
    @Pointcut("execution(* cn.sharetop.shiro.demo.web.service.HelloWorld.sayHello(..))")
    private void myPointcut(){ // define pointcut 
    }

    @Before(value="myPointcut()")
    public void before() {
        LOG.info("前置通知.....");
    }
    @AfterReturning(value="execution(* cn.sharetop.shiro.demo.web.service.HelloWorld.sayHello(..))",returning="returnVal")
    public void afterReturning(Object returnVal) {
        LOG.info("后置通知……{}",returnVal);
    }
    
    /**
     * 环绕通知
     * @param joinPoint 可用于执行切点的类
     * @return
     * @throws Throwable
     */
    @Around("execution(* cn.sharetop.shiro.demo.web.service.HelloWorld.sayHello(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        LOG.info("环绕通知前....");
        Object obj=  joinPoint.proceed();
        LOG.info("环绕通知后....");
        return obj;
    }

}
