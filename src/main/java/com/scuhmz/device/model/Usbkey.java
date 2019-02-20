package com.scuhmz.device.model;

import java.util.Date;
import javax.persistence.*;

public class Usbkey {
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
     * 厂家
     */
    private String manufactor;

    /**
     * 有效结束时间
     */
    @Column(name = "end_date")
    private Date endDate;

    /**
     * 有效起始时间
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
     * 责任人工号
     */
    @Column(name = "user_code")
    private String userCode;

    /**
     * 数字证书号
     */
    @Column(name = "digital_sn")
    private String digitalSn;

    /**
     * 对应计算机保密编号
     */
    @Column(name = "corres_pc_security_num")
    private String corresPcSecurityNum;

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

    /**
     * 获取有效结束时间
     *
     * @return end_date - 有效结束时间
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 设置有效结束时间
     *
     * @param endDate 有效结束时间
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * 获取有效起始时间
     *
     * @return start_date - 有效起始时间
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * 设置有效起始时间
     *
     * @param startDate 有效起始时间
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
     * 获取数字证书号
     *
     * @return digital_sn - 数字证书号
     */
    public String getDigitalSn() {
        return digitalSn;
    }

    /**
     * 设置数字证书号
     *
     * @param digitalSn 数字证书号
     */
    public void setDigitalSn(String digitalSn) {
        this.digitalSn = digitalSn;
    }

    /**
     * 获取对应计算机保密编号
     *
     * @return corres_pc_security_num - 对应计算机保密编号
     */
    public String getCorresPcSecurityNum() {
        return corresPcSecurityNum;
    }

    /**
     * 设置对应计算机保密编号
     *
     * @param corresPcSecurityNum 对应计算机保密编号
     */
    public void setCorresPcSecurityNum(String corresPcSecurityNum) {
        this.corresPcSecurityNum = corresPcSecurityNum;
    }
}