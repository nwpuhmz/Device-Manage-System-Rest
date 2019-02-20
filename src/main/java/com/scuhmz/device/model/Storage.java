package com.scuhmz.device.model;

import javax.persistence.*;

public class Storage {
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
     * 密级
     */
    @Column(name = "secret_class")
    private String secretClass;

    /**
     * 机号
     */
    @Column(name = "machine_num")
    private String machineNum;

    /**
     * 厂家
     */
    private String manufactor;

    /**
     * 物理序列号
     */
    private String sn;

    /**
     * IP地址
     */
    private String ip;

    /**
     * MAC地址
     */
    private String mac;

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
     * 用途
     */
    private String comments;

    /**
     * 介质类型
     */
    @Column(name = "storage_type")
    private String storageType;

    /**
     * 介质容量
     */
    @Column(name = "storage_size")
    private String storageSize;

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
     * 获取密级
     *
     * @return secret_class - 密级
     */
    public String getSecretClass() {
        return secretClass;
    }

    /**
     * 设置密级
     *
     * @param secretClass 密级
     */
    public void setSecretClass(String secretClass) {
        this.secretClass = secretClass;
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
     * 获取物理序列号
     *
     * @return sn - 物理序列号
     */
    public String getSn() {
        return sn;
    }

    /**
     * 设置物理序列号
     *
     * @param sn 物理序列号
     */
    public void setSn(String sn) {
        this.sn = sn;
    }

    /**
     * 获取IP地址
     *
     * @return ip - IP地址
     */
    public String getIp() {
        return ip;
    }

    /**
     * 设置IP地址
     *
     * @param ip IP地址
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * 获取MAC地址
     *
     * @return mac - MAC地址
     */
    public String getMac() {
        return mac;
    }

    /**
     * 设置MAC地址
     *
     * @param mac MAC地址
     */
    public void setMac(String mac) {
        this.mac = mac;
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
     * 获取用途
     *
     * @return comments - 用途
     */
    public String getComments() {
        return comments;
    }

    /**
     * 设置用途
     *
     * @param comments 用途
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * 获取介质类型
     *
     * @return storage_type - 介质类型
     */
    public String getStorageType() {
        return storageType;
    }

    /**
     * 设置介质类型
     *
     * @param storageType 介质类型
     */
    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * 获取介质容量
     *
     * @return storage_size - 介质容量
     */
    public String getStorageSize() {
        return storageSize;
    }

    /**
     * 设置介质容量
     *
     * @param storageSize 介质容量
     */
    public void setStorageSize(String storageSize) {
        this.storageSize = storageSize;
    }
}