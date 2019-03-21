package com.sy.hding.sys.pojo;import org.springframework.format.annotation.DateTimeFormat;import java.util.Date;@SuppressWarnings("all")public class Putforward {    private String bankAccount;// 银行账号    private String putName;// 提现人姓名    private Integer bankID;// 银行类别    private Date submitTime;// 提交申请时间    private Float money;// 提现金额    private Integer pfID;// 提现id，主键    private Date auditTime;// 审核时间    private Integer auditStatus;// 审核状态(1待审核2审核成功3未通过)    private Integer userID;// 外键，用户ID    private String openBankName;// 开户行    public Putforward() {        super();    }    /**     * @param bankAccount  银行账号     * @param putName      提现人姓名     * @param bankID       银行类别     * @param submitTime   提交申请时间     * @param money        提现金额     * @param pfID         提现id     * @param auditTime    审核时间     * @param auditStatus  审核状态(1待审核2审核成功3未通过)     * @param userID       外键，用户ID     * @param openBankName 开户行     * @description: 含主键的构造函数     */    public Putforward(String bankAccount, String putName, Integer bankID, Date submitTime, Float money, Integer pfID, Date auditTime, Integer auditStatus, Integer userID, String openBankName) {        super();        this.bankAccount = bankAccount;        this.putName = putName;        this.bankID = bankID;        this.submitTime = submitTime;        this.money = money;        this.pfID = pfID;        this.auditTime = auditTime;        this.auditStatus = auditStatus;        this.userID = userID;        this.openBankName = openBankName;    }    public String getBankAccount() {        return this.bankAccount;    }    public void setBankAccount(String bankAccount) {        this.bankAccount = bankAccount;    }    public String getPutName() {        return this.putName;    }    public void setPutName(String putName) {        this.putName = putName;    }    public Integer getBankID() {        return this.bankID;    }    public void setBankID(Integer bankID) {        this.bankID = bankID;    }    public Date getSubmitTime() {        return this.submitTime;    }    public void setSubmitTime(Date submitTime) {        this.submitTime = submitTime;    }    public Float getMoney() {        return this.money;    }    public void setMoney(Float money) {        this.money = money;    }    public Integer getPfID() {        return this.pfID;    }    public void setPfID(Integer pfID) {        this.pfID = pfID;    }    public Date getAuditTime() {        return this.auditTime;    }    public void setAuditTime(Date auditTime) {        this.auditTime = auditTime;    }    public Integer getAuditStatus() {        return this.auditStatus;    }    public void setAuditStatus(Integer auditStatus) {        this.auditStatus = auditStatus;    }    public Integer getUserID() {        return this.userID;    }    public void setUserID(Integer userID) {        this.userID = userID;    }    public String getOpenBankName() {        return this.openBankName;    }    public void setOpenBankName(String openBankName) {        this.openBankName = openBankName;    }}	