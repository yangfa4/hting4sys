package com.sy.hding.sys.vo.tjc;

import java.util.Date;

public class Services_User_Servicetype {
	//用户表
	private String userRealName;// 用户真实姓名
	private String shopName;// 店铺名称
	private Integer userID;// 用户编号，主键
	//服务类别表
	private String stName;// 服务名称
	//鉴定表
	private String serviceTitle;// 服务标题
	private String serviceCoverImg;// 封面图
	private String serviceImgUrlOne;// 细节图1
	private String serviceImgUrlTwo;// 细节图2
	private String serviceImgUrlThree;// 细节图3
	private String serviceFuTitle;// 服务副标题,价格标题
	private Integer servicePrice;// 金币价格
	private String serviceCostInclude;// 服务费用包含
	private String serviceCostTypeID;// 费用说明
	private String serviceIntro;// 服务介绍
	private Integer auditStatus;// 审核状态(1待审核2审核成功3未通过)
	private Integer shelfState;// 上架状态(1上架2下架)
	private Integer recommendBool;// 服务推荐
	private String adminOpinion;// 管理员意见
	private Integer serviceID;// 服务(商品)id，主键
	public String getUserRealName() {
		return userRealName;
	}
	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getServiceTitle() {
		return serviceTitle;
	}
	public void setServiceTitle(String serviceTitle) {
		this.serviceTitle = serviceTitle;
	}
	public String getServiceCoverImg() {
		return serviceCoverImg;
	}
	public void setServiceCoverImg(String serviceCoverImg) {
		this.serviceCoverImg = serviceCoverImg;
	}
	public String getServiceImgUrlOne() {
		return serviceImgUrlOne;
	}
	public void setServiceImgUrlOne(String serviceImgUrlOne) {
		this.serviceImgUrlOne = serviceImgUrlOne;
	}
	public String getServiceImgUrlTwo() {
		return serviceImgUrlTwo;
	}
	public void setServiceImgUrlTwo(String serviceImgUrlTwo) {
		this.serviceImgUrlTwo = serviceImgUrlTwo;
	}
	public String getServiceImgUrlThree() {
		return serviceImgUrlThree;
	}
	public void setServiceImgUrlThree(String serviceImgUrlThree) {
		this.serviceImgUrlThree = serviceImgUrlThree;
	}
	public String getServiceFuTitle() {
		return serviceFuTitle;
	}
	public void setServiceFuTitle(String serviceFuTitle) {
		this.serviceFuTitle = serviceFuTitle;
	}
	public Integer getServicePrice() {
		return servicePrice;
	}
	public void setServicePrice(Integer servicePrice) {
		this.servicePrice = servicePrice;
	}
	public String getServiceCostInclude() {
		return serviceCostInclude;
	}
	public void setServiceCostInclude(String serviceCostInclude) {
		this.serviceCostInclude = serviceCostInclude;
	}
	public String getServiceCostTypeID() {
		return serviceCostTypeID;
	}
	public void setServiceCostTypeID(String serviceCostTypeID) {
		this.serviceCostTypeID = serviceCostTypeID;
	}
	public String getServiceIntro() {
		return serviceIntro;
	}
	public void setServiceIntro(String serviceIntro) {
		this.serviceIntro = serviceIntro;
	}
	public Integer getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(Integer auditStatus) {
		this.auditStatus = auditStatus;
	}
	public Integer getShelfState() {
		return shelfState;
	}
	public void setShelfState(Integer shelfState) {
		this.shelfState = shelfState;
	}
	public Integer getRecommendBool() {
		return recommendBool;
	}
	public void setRecommendBool(Integer recommendBool) {
		this.recommendBool = recommendBool;
	}
	public String getAdminOpinion() {
		return adminOpinion;
	}
	public void setAdminOpinion(String adminOpinion) {
		this.adminOpinion = adminOpinion;
	}
	public Integer getServiceID() {
		return serviceID;
	}
	public void setServiceID(Integer serviceID) {
		this.serviceID = serviceID;
	}
	
	
}
