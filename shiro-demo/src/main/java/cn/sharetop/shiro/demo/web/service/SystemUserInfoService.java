package cn.sharetop.shiro.demo.web.service;

import java.util.List;

import cn.sharetop.shiro.demo.web.domain.SystemUserInfo;
import cn.sharetop.shiro.demo.web.domain.SystemUserInfoQueryModel;

public interface SystemUserInfoService {
    
    List<SystemUserInfo> find(SystemUserInfoQueryModel systemUserInfoQueryModel);

}
