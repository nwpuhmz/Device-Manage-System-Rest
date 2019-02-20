package com.scuhmz.device.model;

import java.util.Date;
import javax.persistence.*;

public class Interphone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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
     * 厂家
     */
    private String manufactor;

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
     * 型号（设备型号）
     */
    @Column(name = "equipment_type")
    private String equipmentType;

    /**
     * 保密编号
     */
    @Column(name = "security_num")
    private String securityNum;

    /**
     * 机号
     */
    @Column(name = "machine_num")
    private String machineNum;

    /**
     * 启用时间
     */
    @Column(name = "start_date")
    private Date startDate;

    /**
     * 放置地点
     */
    @Column(name = "install_site")
    private String installSite;

    /**
     * 备注
     */
    private String comments;

    /**
     * 用途
     */
    private String usefor;

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
     * 获取机号
     *
     * @return machine_num - 机号
     */
    public String getMachineNum() {
        return machineNum;
    }

    /**
     * 设置机号
     *
     * @param machineNum 机号
     */
    public void setMachineNum(String machineNum) {
        this.machineNum = machineNum;
    }

    /**
     * 获取启用时间
     *
     * @return start_date - 启用时间
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * 设置启用时间
     *
     * @param startDate 启用时间
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * 获取放置地点
     *
     * @return install_site - 放置地点
     */
    public String getInstallSite() {
        return installSite;
    }

    /**
     * 设置放置地点
     *
     * @param installSite 放置地点
     */
    public void setInstallSite(String installSite) {
        this.installSite = installSite;
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
     * 获取用途
     *
     * @return usefor - 用途
     */
    public String getUsefor() {
        return usefor;
    }

    /**
     * 设置用途
     *
     * @param usefor 用途
     */
    public void setUsefor(String usefor) {
        this.usefor = usefor;
    }
}