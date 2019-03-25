package com.sy.hding.sys.biz.lhq;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sy.hding.sys.dao.lhq.ILhqAdvertiseDao;
import com.sy.hding.sys.pojo.Advertisement;
import com.sy.hding.sys.pojo.Advertisementapply;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class LhqAdvertiseBiz {
	
	@Autowired
	private ILhqAdvertiseDao advertisDao;
	
	/**
	 *  新增广告位
	 * @param advertisement
	 */
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void saveAdvertisement(Advertisement advertisement) {
		advertisDao.saveAdvertisement(advertisement);
	}
	
	/**
	 * 申请广告位
	 * @param advertisementapply
	 */
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void saveAdvertisementApply(Advertisementapply advertisementapply) {
		advertisDao.saveAdvertisementApply(advertisementapply);
	}
	  
	/**
	 * 管理员审批申请(广告位)
	 * @param advertisementapply
	 */
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void updateAdvertisementApply(Advertisementapply advertisementapply) {
		advertisDao.updateAdvertisementApply(advertisementapply);
	}
	
	/**
	 * 分页查询全部广告
	 * @return
	 */
	public PageInfo<Advertisement> queryAdvertisementList(Integer pageNum,Integer pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Advertisement>(advertisDao.queryAdvertisementList());
	}
	
	/**
	 * 查询对象
	 * @param aid
	 * @return
	 */
	public Advertisement getAdvertisementByid(Integer aid) {
		return advertisDao.getAdvertisementByid(aid);
	}
	
	/**
	 * 修改
	 * @param advertise
	 * @return
	 */
	public void updateAdvertisement(Advertisement advertise) {
		advertisDao.updateAdvertisement(advertise);
	}

}
