package cn.sharetop.shiro.demo.web.domain;

import java.util.Date;
/**
 * 数据权限类
 * @author piaolinzhi
 *
 */
public class DataAuth {

    private Integer dataAuthId;
    private String projectName;
    private String projectCode;
    private String methodSignature;
    private String argType;
    private String fieldName;
    private String operator;
    private String filedValues;
    private Date createTime;
    private Date updateTime;
    private Integer lastModifyUserId;
    private String deleteTime;
    
    public String getMethodSignature() {
        return methodSignature;
    }

    public void setMethodSignature(String methodSignature) {
        this.methodSignature = methodSignature;
    }

    public String getArgType() {
        return argType;
    }

    public void setArgType(String argType) {
        this.argType = argType;
    }

    public Integer getDataAuthId() {
        return dataAuthId;
    }

    public void setDataAuthId(Integer dataAuthId) {
        this.dataAuthId = dataAuthId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getFiledValues() {
        return filedValues;
    }

    public void setFiledValues(String filedValues) {
        this.filedValues = filedValues;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getLastModifyUserId() {
        return lastModifyUserId;
    }

    public void setLastModifyUserId(Integer lastModifyUserId) {
        this.lastModifyUserId = lastModifyUserId;
    }

    public String getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(String deleteTime) {
        this.deleteTime = deleteTime;
    }

}
