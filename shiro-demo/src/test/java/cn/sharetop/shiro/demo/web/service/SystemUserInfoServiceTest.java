package cn.sharetop.shiro.demo.web.service;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cn.sharetop.shiro.demo.web.domain.SystemUserInfo;
import cn.sharetop.shiro.demo.web.domain.SystemUserInfoQueryModel;
import cn.sharetop.shiro.test.common.BaseJunit4Test;

public class SystemUserInfoServiceTest extends BaseJunit4Test {

    private static final Logger LOG = LoggerFactory
            .getLogger(SystemUserInfoServiceTest.class);

    @Autowired
    private SystemUserInfoService systemUserInfoService;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findTest() {
        Assert.assertNotNull(systemUserInfoService);
        SystemUserInfoQueryModel queryModel = new SystemUserInfoQueryModel();
        List<SystemUserInfo> userInfos = systemUserInfoService
                .find(queryModel);
        Assert.assertNotNull(userInfos);
        Assert.assertTrue(!userInfos.isEmpty());
        LOG.info("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        LOG.info("Test result username is: {}",userInfos.get(0).getUserName());
        LOG.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        Assert.assertNotNull(queryModel.getUserName());
    }

}
