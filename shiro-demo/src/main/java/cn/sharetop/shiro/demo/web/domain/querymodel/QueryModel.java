package cn.sharetop.shiro.demo.web.domain.querymodel;

public interface QueryModel {
    
    /**
     * 获取查询条件集合
     * @return
     */
    QueryModel getQueryModel();
    
    /**获取查询条件的语句
     * @return
     */
    String getQueryString();

}
