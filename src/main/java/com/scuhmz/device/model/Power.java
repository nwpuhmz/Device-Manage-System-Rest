package com.scuhmz.device.model;

import java.util.Date;
import javax.persistence.*;

public class Power {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 类别
     */
    private Integer category;

    /**
     * 单位名称
     */
    @Column(name = "org_name")
    private String orgName;

    /**
     * 组别（部门名称）
     */
    @Column(name = "dep_name")
    private String depName;

    /**
     * 保密编号
     */
    @Column(name = "security_num")
    private String securityNum;

    /**
     * 型号（设备型号）
     */
    @Column(name = "equipment_type")
    private String equipmentType;

    /**
     * 购买时间
     */
    @Column(name = "start_date")
    private Date startDate;

    /**
     * 责任人
     */
    private String user;

    /**
     * 使用情况
     */
    @Column(name = "use_desc")
    private String useDesc;

    /**
     * 安装地点
     */
    @Column(name = "install_site")
    private String installSite;

    /**
     * 检测证书名称
     */
    @Column(name = "test_certif_name")
    private String testCertifName;

    /**
     * 检测证书编号
     */
    @Column(name = "test_certif_num")
    private String testCertifNum;

    /**
     * 备注
     */
    private String comments;

    /**
     * 责任人工号
     */
    @Column(name = "user_code")
    private String userCode;

    /**
     * 厂家
     */
    private String manufactor;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取类别
     *
     * @return category - 类别
     */
    public Integer getCategory() {
        return category;
    }

    /**
     * 设置类别
     *
     * @param category 类别
     */
    public void setCategory(Integer category) {
        this.category = category;
    }

    /**
     * 获取单位名称
     *
     * @return org_name - 单位名称
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * 设置单位名称
     *
     * @param orgName 单位名称
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    /**
     * 获取组别（部门名称）
     *
     * @return dep_name - 组别（部门名称）
     */
    public String getDepName() {
        return depName;
    }

    /**
     * 设置组别（部门名称）
     *
     * @param depName 组别（部门名称）
     */
    public void setDepName(String depName) {
        this.depName = depName;
    }

    /**
     * 获取保密编号
     *
     * @return security_num - 保密编号
     */
    public String getSecurityNum() {
        return securityNum;
    }

    /**
     * 设置保密编号
     *
     * @param securityNum 保密编号
     */
    public void setSecurityNum(String securityNum) {
        this.securityNum = securityNum;
    }

    /**
     * 获取型号（设备型号）
     *
     * @return equipment_type - 型号（设备型号）
     */
    public String getEquipmentType() {
        return equipmentType;
    }

    /**
     * 设置型号（设备型号）
     *
     * @param equipmentType 型号（设备型号）
     */
    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    /**
     * 获取购买时间
     *
     * @return start_date - 购买时间
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * 设置购买时间
     *
     * @param startDate 购买时间
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * 获取责任人
     *
     * @return user - 责任人
     */
    public String getUser() {
        return user;
    }

    /**
     * 设置责任人
     *
     * @param user 责任人
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * 获取使用情况
     *
     * @return use_desc - 使用情况
     */
    public String getUseDesc() {
        return useDesc;
    }

    /**
     * 设置使用情况
     *
     * @param useDesc 使用情况
     */
    public void setUseDesc(String useDesc) {
        this.useDesc = useDesc;
    }

    /**
     * 获取安装地点
     *
     * @return install_site - 安装地点
     */
    public String getInstallSite() {
        return installSite;
    }

    /**
     * 设置安装地点
     *
     * @param installSite 安装地点
     */
    public void setInstallSite(String installSite) {
        this.installSite = installSite;
    }

    /**
     * 获取检测证书名称
     *
     * @return test_certif_name - 检测证书名称
     */
    public String getTestCertifName() {
        return testCertifName;
    }

    /**
     * 设置检测证书名称
     *
     * @param testCertifName 检测证书名称
     */
    public void setTestCertifName(String testCertifName) {
        this.testCertifName = testCertifName;
    }

    /**
     * 获取检测证书编号
     *
     * @return test_certif_num - 检测证书编号
     */
    public String getTestCertifNum() {
        return testCertifNum;
    }

    /**
     * 设置检测证书编号
     *
     * @param testCertifNum 检测证书编号
     */
    public void setTestCertifNum(String testCertifNum) {
        this.testCertifNum = testCertifNum;
    }

    /**
     * 获取备注
     *
     * @return comments - 备注
     */
    public String getComments() {
        return comments;
    }

    /**
     * 设置备注
     *
     * @param comments 备注
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * 获取责任人工号
     *
     * @return user_code - 责任人工号
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * 设置责任人工号
     *
     * @param userCode 责任人工号
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    /**
     * 获取厂家
     *
     * @return manufactor - 厂家
     */
    public String getManufactor() {
        return manufactor;
    }

    /**
     * 设置厂家
     *
     * @param manufactor 厂家
     */
    public void setManufactor(String manufactor) {
        this.manufactor = manufactor;
    }
}