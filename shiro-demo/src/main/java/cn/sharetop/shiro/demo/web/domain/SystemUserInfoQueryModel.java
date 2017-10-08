package cn.sharetop.shiro.demo.web.domain;

import cn.sharetop.shiro.demo.web.domain.querymodel.QueryModel;

/**
 * 系统用户查询 model
 * @author piaolinzhi
 */
public class SystemUserInfoQueryModel implements QueryModel {

    private String userName;
    private String password;

    @Override
    public QueryModel getQueryModel() {
        return this;
    }

    @Override
    public String getQueryString() {
        StringBuilder sb = new StringBuilder();
        if(null != userName) {
            sb.append(" user_name = '").append(userName).append("' ");
        }
        if(null != password) {
            sb.append(" password = '").append(password).append("' ");
        }
        return sb.toString();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
