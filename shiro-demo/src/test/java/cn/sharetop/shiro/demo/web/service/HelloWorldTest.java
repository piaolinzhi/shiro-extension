package cn.sharetop.shiro.demo.web.service;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import cn.sharetop.shiro.test.common.BaseJunit4Test;



public class HelloWorldTest extends BaseJunit4Test {
    @Autowired
    private HelloWorld helloWorld;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testSayHello() {
        Assert.assertNotNull(helloWorld);
        String s = helloWorld.sayHello();
        Assert.assertTrue("hello world !".equals(s));
    }
}
