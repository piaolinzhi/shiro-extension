package cn.sharetop.shiro.demo.web.aop;

import java.lang.reflect.Field;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

import cn.sharetop.shiro.demo.web.domain.DataAuth;

@Aspect
@Component
public class DataAuthAspect {

    private static final Logger LOG = LoggerFactory
            .getLogger(DataAuthAspect.class);

    @Pointcut("execution(* cn.sharetop.shiro.demo.web.service.SystemUserInfoServiceImpl.find(..))")
    private void serviceFindPointcut() {
        // define a pointcut.
    }

    @Before(value = "serviceFindPointcut()")
    public void before(JoinPoint joinPoint) {
        DataAuth dataAuth = new DataAuth();
        dataAuth.setFieldName("userName");
        dataAuth.setOperator("=");
        dataAuth.setFiledValues("piaolinzhi");
        dataAuth.setMethodSignature(
                "List cn.sharetop.shiro.demo.web.service.SystemUserInfoServiceImpl.find(SystemUserInfoQueryModel)");
        dataAuth.setArgType(
                "class cn.sharetop.shiro.demo.web.domain.SystemUserInfoQueryModel");

        LOG.info("kind is :{}", joinPoint.getKind());
        LOG.info("signature is :{}", joinPoint.getSignature());
        LOG.info("long string of signature is :{}",
                joinPoint.getSignature().toLongString());
        LOG.info("shot string of signature is :{}",
                joinPoint.getSignature().toShortString());
        if(dataAuth.getMethodSignature()
                .equals(joinPoint.getSignature().toString())) {
            LOG.info("Signature mathed! Finding arg for modify!!!!");
            LOG.info("Args is :{}", joinPoint.getArgs());
            Object[] args = joinPoint.getArgs();
            if(null != args && args.length > 0) {
                for(int i = 0; i < args.length; i++) {
                    LOG.info("Arg[{}] class is :{}", i,
                            args[i].getClass());
                    LOG.info("Arg[{}] class simple name  is :{}", i,
                            args[i].getClass().getSimpleName());
                    if(dataAuth.getArgType()
                            .equals(args[i].getClass().toString())) {
                        LOG.info(
                                "Arg metched! Finding arg field for modify!!!");
                        Field field = ReflectionUtils.findField(
                                args[i].getClass(),
                                dataAuth.getFieldName());
                        if(null != field) {
                            LOG.info("Field matched !!!", field.getName());
                            field.setAccessible(true);
                            ReflectionUtils.setField(field, args[i],
                                    dataAuth.getFiledValues());
                        }

                    }
                }
            }
        }

        LOG.info("target is :{}", joinPoint.getTarget());
        LOG.info("long string is :{}", joinPoint.toLongString());
        LOG.info("joinpoint class is :{}", joinPoint.getClass());

        LOG.info("Data Auth aspect before()》》》》》》》》》》》》");
    }

}
