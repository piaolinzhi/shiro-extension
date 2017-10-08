package cn.sharetop.shiro.demo.web.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import cn.sharetop.shiro.demo.web.domain.SystemUserInfo;
import cn.sharetop.shiro.demo.web.domain.SystemUserInfoQueryModel;
@Service
public class SystemUserInfoServiceImpl implements SystemUserInfoService {

    @Override
    public List<SystemUserInfo> find(
            SystemUserInfoQueryModel systemUserInfoQueryModel) {

        List<SystemUserInfo> userInfos = new ArrayList<>();
        if(null != systemUserInfoQueryModel && StringUtils
                .isNotBlank(systemUserInfoQueryModel.getUserName())) {
            SystemUserInfo userInfo = new SystemUserInfo();
            userInfo.setUserName(systemUserInfoQueryModel.getUserName());
            userInfo.setRealName("注入成功");
            userInfos.add(userInfo);
        }
        return userInfos;
    }

}
