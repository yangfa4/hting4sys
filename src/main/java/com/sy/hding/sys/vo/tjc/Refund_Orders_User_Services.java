package com.sy.hding.sys.vo.tjc;

import java.util.Date;

public class Refund_Orders_User_Services {
		//退狂表
		private String refundImg;// 退款附带图片

	    private String orderID;// 外键，订单编号

	    private String refundReason;// 退款原因

	    private String adminRemarks;// 管理员审核备注

	    private Float actualRefundMoney;// 实际退款金额

	    private Integer userID;// 外键，用户编号

	    private String businessRemarks;// 商家审核备注

	    private Integer point;// 退款申请指向，1：商家，2：管理员

	    private Float applyRefundMoney;// 申请退款金额

	    private Date adminTime;// 管理员审核时间

	    private String refundExplain;// 退款说明

	    private Date applicationTime;// 申请时间

	    private Date auditTime;// 商家审核时间

	    private Integer adminStatus;// 管理员审核状态(1待审核2审核成功3未通过)

	    private Integer auditStatus;// 商家审核状态(1待审核2审核成功3未通过)

	    private Integer refundID;// 退款id，主键
	    
	    //订单表
	    private Float totalPrice;// 订单总价
	    
	    //用户表
	    private String userRealName;// 用户真实姓名
	    
	    //商品服务表
	    private String serviceTitle;// 服务标题
	    
	    //用户id
	    private int yhid;
	    //商家id
	    private int sjid;
		public Refund_Orders_User_Services() {	
			super();
			// TODO Auto-generated constructor stub
		}
		public Refund_Orders_User_Services(String refundImg, String orderID, String refundReason, String adminRemarks,
				Float actualRefundMoney, Integer userID, String businessRemarks, Integer point, Float applyRefundMoney,
				Date adminTime, String refundExplain, Date applicationTime, Date auditTime, Integer adminStatus,
				Integer auditStatus, Integer refundID, Float totalPrice, String userRealName, String serviceTitle,
				int yhid, int sjid) {
			super();
			this.refundImg = refundImg;
			this.orderID = orderID;
			this.refundReason = refundReason;
			this.adminRemarks = adminRemarks;
			this.actualRefundMoney = actualRefundMoney;
			this.userID = userID;
			this.businessRemarks = businessRemarks;
			this.point = point;
			this.applyRefundMoney = applyRefundMoney;
			this.adminTime = adminTime;
			this.refundExplain = refundExplain;
			this.applicationTime = applicationTime;
			this.auditTime = auditTime;
			this.adminStatus = adminStatus;
			this.auditStatus = auditStatus;
			this.refundID = refundID;
			this.totalPrice = totalPrice;
			this.userRealName = userRealName;
			this.serviceTitle = serviceTitle;
			this.yhid = yhid;
			this.sjid = sjid;
		}
		public String getRefundImg() {
			return refundImg;
		}
		public void setRefundImg(String refundImg) {
			this.refundImg = refundImg;
		}
		public String getOrderID() {
			return orderID;
		}
		public void setOrderID(String orderID) {
			this.orderID = orderID;
		}
		public String getRefundReason() {
			return refundReason;
		}
		public void setRefundReason(String refundReason) {
			this.refundReason = refundReason;
		}
		public String getAdminRemarks() {
			return adminRemarks;
		}
		public void setAdminRemarks(String adminRemarks) {
			this.adminRemarks = adminRemarks;
		}
		public Float getActualRefundMoney() {
			return actualRefundMoney;
		}
		public void setActualRefundMoney(Float actualRefundMoney) {
			this.actualRefundMoney = actualRefundMoney;
		}
		public Integer getUserID() {
			return userID;
		}
		public void setUserID(Integer userID) {
			this.userID = userID;
		}
		public String getBusinessRemarks() {
			return businessRemarks;
		}
		public void setBusinessRemarks(String businessRemarks) {
			this.businessRemarks = businessRemarks;
		}
		public Integer getPoint() {
			return point;
		}
		public void setPoint(Integer point) {
			this.point = point;
		}
		public Float getApplyRefundMoney() {
			return applyRefundMoney;
		}
		public void setApplyRefundMoney(Float applyRefundMoney) {
			this.applyRefundMoney = applyRefundMoney;
		}
		public Date getAdminTime() {
			return adminTime;
		}
		public void setAdminTime(Date adminTime) {
			this.adminTime = adminTime;
		}
		public String getRefundExplain() {
			return refundExplain;
		}
		public void setRefundExplain(String refundExplain) {
			this.refundExplain = refundExplain;
		}
		public Date getApplicationTime() {
			return applicationTime;
		}
		public void setApplicationTime(Date applicationTime) {
			this.applicationTime = applicationTime;
		}
		public Date getAuditTime() {
			return auditTime;
		}
		public void setAuditTime(Date auditTime) {
			this.auditTime = auditTime;
		}
		public Integer getAdminStatus() {
			return adminStatus;
		}
		public void setAdminStatus(Integer adminStatus) {
			this.adminStatus = adminStatus;
		}
		public Integer getAuditStatus() {
			return auditStatus;
		}
		public void setAuditStatus(Integer auditStatus) {
			this.auditStatus = auditStatus;
		}
		public Integer getRefundID() {
			return refundID;
		}
		public void setRefundID(Integer refundID) {
			this.refundID = refundID;
		}
		public Float getTotalPrice() {
			return totalPrice;
		}
		public void setTotalPrice(Float totalPrice) {
			this.totalPrice = totalPrice;
		}
		public String getUserRealName() {
			return userRealName;
		}
		public void setUserRealName(String userRealName) {
			this.userRealName = userRealName;
		}
		public String getServiceTitle() {
			return serviceTitle;
		}
		public void setServiceTitle(String serviceTitle) {
			this.serviceTitle = serviceTitle;
		}
		public int getYhid() {
			return yhid;
		}
		public void setYhid(int yhid) {
			this.yhid = yhid;
		}
		public int getSjid() {
			return sjid;
		}
		public void setSjid(int sjid) {
			this.sjid = sjid;
		}
		
		
	
	    
}
