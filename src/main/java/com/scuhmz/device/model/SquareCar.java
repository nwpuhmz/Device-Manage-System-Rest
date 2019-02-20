package com.scuhmz.device.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "square_car")
public class SquareCar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer category;

    @Column(name = "org_name")
    private String orgName;

    @Column(name = "dep_name")
    private String depName;

    @Column(name = "unified_num")
    private String unifiedNum;

    @Column(name = "device_name")
    private String deviceName;

    @Column(name = "equipment_type")
    private String equipmentType;

    @Column(name = "machine_num")
    private String machineNum;

    @Column(name = "leave_factory_date")
    private Date leaveFactoryDate;

    private String manufactor;

    @Column(name = "dep_code")
    private String depCode;

    private String country;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "original_value")
    private String originalValue;

    private String user;

    @Column(name = "use_desc")
    private String useDesc;

    @Column(name = "install_site")
    private String installSite;

    @Column(name = "funding_sources")
    private String fundingSources;

    @Column(name = "Reg_number")
    private String regNumber;

    @Column(name = "sys_name")
    private String sysName;

    @Column(name = "sys_code")
    private String sysCode;

    private String comments;

    @Column(name = "project_attr")
    private String projectAttr;

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
     * @return category
     */
    public Integer getCategory() {
        return category;
    }

    /**
     * @param category
     */
    public void setCategory(Integer category) {
        this.category = category;
    }

    /**
     * @return org_name
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * @param orgName
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    /**
     * @return dep_name
     */
    public String getDepName() {
        return depName;
    }

    /**
     * @param depName
     */
    public void setDepName(String depName) {
        this.depName = depName;
    }

    /**
     * @return unified_num
     */
    public String getUnifiedNum() {
        return unifiedNum;
    }

    /**
     * @param unifiedNum
     */
    public void setUnifiedNum(String unifiedNum) {
        this.unifiedNum = unifiedNum;
    }

    /**
     * @return device_name
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * @param deviceName
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * @return equipment_type
     */
    public String getEquipmentType() {
        return equipmentType;
    }

    /**
     * @param equipmentType
     */
    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    /**
     * @return machine_num
     */
    public String getMachineNum() {
        return machineNum;
    }

    /**
     * @param machineNum
     */
    public void setMachineNum(String machineNum) {
        this.machineNum = machineNum;
    }

    /**
     * @return leave_factory_date
     */
    public Date getLeaveFactoryDate() {
        return leaveFactoryDate;
    }

    /**
     * @param leaveFactoryDate
     */
    public void setLeaveFactoryDate(Date leaveFactoryDate) {
        this.leaveFactoryDate = leaveFactoryDate;
    }

    /**
     * @return manufactor
     */
    public String getManufactor() {
        return manufactor;
    }

    /**
     * @param manufactor
     */
    public void setManufactor(String manufactor) {
        this.manufactor = manufactor;
    }

    /**
     * @return dep_code
     */
    public String getDepCode() {
        return depCode;
    }

    /**
     * @param depCode
     */
    public void setDepCode(String depCode) {
        this.depCode = depCode;
    }

    /**
     * @return country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return start_date
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return original_value
     */
    public String getOriginalValue() {
        return originalValue;
    }

    /**
     * @param originalValue
     */
    public void setOriginalValue(String originalValue) {
        this.originalValue = originalValue;
    }

    /**
     * @return user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return use_desc
     */
    public String getUseDesc() {
        return useDesc;
    }

    /**
     * @param useDesc
     */
    public void setUseDesc(String useDesc) {
        this.useDesc = useDesc;
    }

    /**
     * @return install_site
     */
    public String getInstallSite() {
        return installSite;
    }

    /**
     * @param installSite
     */
    public void setInstallSite(String installSite) {
        this.installSite = installSite;
    }

    /**
     * @return funding_sources
     */
    public String getFundingSources() {
        return fundingSources;
    }

    /**
     * @param fundingSources
     */
    public void setFundingSources(String fundingSources) {
        this.fundingSources = fundingSources;
    }

    /**
     * @return Reg_number
     */
    public String getRegNumber() {
        return regNumber;
    }

    /**
     * @param regNumber
     */
    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    /**
     * @return sys_name
     */
    public String getSysName() {
        return sysName;
    }

    /**
     * @param sysName
     */
    public void setSysName(String sysName) {
        this.sysName = sysName;
    }

    /**
     * @return sys_code
     */
    public String getSysCode() {
        return sysCode;
    }

    /**
     * @param sysCode
     */
    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
    }

    /**
     * @return comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * @return project_attr
     */
    public String getProjectAttr() {
        return projectAttr;
    }

    /**
     * @param projectAttr
     */
    public void setProjectAttr(String projectAttr) {
        this.projectAttr = projectAttr;
    }

    /**
     * @return contract_number
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * @param contractNumber
     */
    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }
}