package com.sy.hding.sys.dao.lhq;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sy.hding.sys.pojo.Advertisement;
import com.sy.hding.sys.pojo.Advertisementapply;

public interface ILhqAdvertiseDao {
	/**
	 * 新增广告位
	 * @param advertisement
	 */
	public void saveAdvertisement(@Param("advertis")Advertisement advertisement);
	
	/**
	 * 申请广告位
	 * @param advertisementapply
	 */
	public void saveAdvertisementApply(@Param("apply")Advertisementapply advertisementapply);
	  
	/**
	 * 管理员审批申请(广告位)
	 * @param advertisementapply
	 */
	public void updateAdvertisementApply(@Param("apply")Advertisementapply advertisementapply);
	
	/**
	 * 查询全部广告
	 * @return
	 */
	public List<Advertisement> queryAdvertisementList();
	
	/**
	 * 查询对象
	 * @param aid
	 * @return
	 */
	public Advertisement getAdvertisementByid(@Param("aid")Integer aid);
	
	
	/**
	 * 修改
	 * @param advertise
	 * @return
	 */
	public int updateAdvertisement(@Param("advertise")Advertisement advertise);

}
