package com.scuhmz.device.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "display_tv")
public class DisplayTv {
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
     * 统一编号（国资编号）
     */
    @Column(name = "unified_num")
    private String unifiedNum;

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
     * 机号
     */
    @Column(name = "machine_num")
    private String machineNum;

    /**
     * 出厂时间
     */
    @Column(name = "leave_factory_date")
    private Date leaveFactoryDate;

    /**
     * 厂家
     */
    private String manufactor;

    /**
     * 单位代码
     */
    @Column(name = "dep_code")
    private String depCode;

    /**
     * 国别
     */
    private String country;

    /**
     * 启用时间
     */
    @Column(name = "start_date")
    private Date startDate;

    /**
     * 原值
     */
    @Column(name = "original_value")
    private String originalValue;

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
     * 经费来源
     */
    @Column(name = "funding_sources")
    private String fundingSources;

    /**
     * 登记单号
     */
    @Column(name = "Reg_number")
    private String regNumber;

    /**
     * 系统名称
     */
    @Column(name = "sys_name")
    private String sysName;

    /**
     * 系统代号
     */
    @Column(name = "sys_code")
    private String sysCode;

    /**
     * 备注
     */
    private String comments;

    /**
     * 项目归属
     */
    @Column(name = "project_attr")
    private String projectAttr;

    /**
     * 合同单号
     */
    @Column(name = "contract_number")
    private String contractNumber;

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
     * 获取统一编号（国资编号）
     *
     * @return unified_num - 统一编号（国资编号）
     */
    public String getUnifiedNum() {
        return unifiedNum;
    }

    /**
     * 设置统一编号（国资编号）
     *
     * @param unifiedNum 统一编号（国资编号）
     */
    public void setUnifiedNum(String unifiedNum) {
        this.unifiedNum = unifiedNum;
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
     * 获取出厂时间
     *
     * @return leave_factory_date - 出厂时间
     */
    public Date getLeaveFactoryDate() {
        return leaveFactoryDate;
    }

    /**
     * 设置出厂时间
     *
     * @param leaveFactoryDate 出厂时间
     */
    public void setLeaveFactoryDate(Date leaveFactoryDate) {
        this.leaveFactoryDate = leaveFactoryDate;
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
     * 获取单位代码
     *
     * @return dep_code - 单位代码
     */
    public String getDepCode() {
        return depCode;
    }

    /**
     * 设置单位代码
     *
     * @param depCode 单位代码
     */
    public void setDepCode(String depCode) {
        this.depCode = depCode;
    }

    /**
     * 获取国别
     *
     * @return country - 国别
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置国别
     *
     * @param country 国别
     */
    public void setCountry(String country) {
        this.country = country;
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
     * 获取原值
     *
     * @return original_value - 原值
     */
    public String getOriginalValue() {
        return originalValue;
    }

    /**
     * 设置原值
     *
     * @param originalValue 原值
     */
    public void setOriginalValue(String originalValue) {
        this.originalValue = originalValue;
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
     * 获取经费来源
     *
     * @return funding_sources - 经费来源
     */
    public String getFundingSources() {
        return fundingSources;
    }

    /**
     * 设置经费来源
     *
     * @param fundingSources 经费来源
     */
    public void setFundingSources(String fundingSources) {
        this.fundingSources = fundingSources;
    }

    /**
     * 获取登记单号
     *
     * @return Reg_number - 登记单号
     */
    public String getRegNumber() {
        return regNumber;
    }

    /**
     * 设置登记单号
     *
     * @param regNumber 登记单号
     */
    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    /**
     * 获取系统名称
     *
     * @return sys_name - 系统名称
     */
    public String getSysName() {
        return sysName;
    }

    /**
     * 设置系统名称
     *
     * @param sysName 系统名称
     */
    public void setSysName(String sysName) {
        this.sysName = sysName;
    }

    /**
     * 获取系统代号
     *
     * @return sys_code - 系统代号
     */
    public String getSysCode() {
        return sysCode;
    }

    /**
     * 设置系统代号
     *
     * @param sysCode 系统代号
     */
    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
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
     * 获取项目归属
     *
     * @return project_attr - 项目归属
     */
    public String getProjectAttr() {
        return projectAttr;
    }

    /**
     * 设置项目归属
     *
     * @param projectAttr 项目归属
     */
    public void setProjectAttr(String projectAttr) {
        this.projectAttr = projectAttr;
    }

    /**
     * 获取合同单号
     *
     * @return contract_number - 合同单号
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * 设置合同单号
     *
     * @param contractNumber 合同单号
     */
    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }
}