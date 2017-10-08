package cn.sharetop.shiro.demo.web.dao;

import java.util.List;

import cn.sharetop.shiro.demo.web.domain.DataAuth;

/**
 * 数据权限查询接口
 * @author piaolinzhi
 */
public interface DataAuthDao {
    List<DataAuth> select(String methodName);
}
