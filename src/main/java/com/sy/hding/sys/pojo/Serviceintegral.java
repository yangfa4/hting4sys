package com.sy.hding.sys.pojo;@SuppressWarnings("all")public class Serviceintegral {    private Integer integral;// 积分    private Integer serIntID;// 服务积分id，主键    private Integer stid;// 外键，服务类别    private Integer userID;// 外键，用户编号    public Serviceintegral() {        super();    }    /**     * @param integral 积分     * @param serIntID 服务积分id     * @param stid     外键，服务类别     * @param userID   外键，用户编号     * @description: 含主键的构造函数     */    public Serviceintegral(Integer integral, Integer serIntID, Integer stid, Integer userID) {        super();        this.integral = integral;        this.serIntID = serIntID;        this.stid = stid;        this.userID = userID;    }    public Integer getIntegral() {        return this.integral;    }    public void setIntegral(Integer integral) {        this.integral = integral;    }    public Integer getSerIntID() {        return this.serIntID;    }    public void setSerIntID(Integer serIntID) {        this.serIntID = serIntID;    }    public Integer getStid() {        return this.stid;    }    public void setStid(Integer stid) {        this.stid = stid;    }    public Integer getUserID() {        return this.userID;    }    public void setUserID(Integer userID) {        this.userID = userID;    }}	