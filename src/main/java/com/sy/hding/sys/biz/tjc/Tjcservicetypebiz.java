package com.sy.hding.sys.biz.tjc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sy.hding.sys.dao.tjc.Tjcservicetype;
import com.sy.hding.sys.pojo.Servicetype;
import com.sy.hding.sys.vo.tjc.Services_User_Servicetype;

@Service("/servicetype")
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class Tjcservicetypebiz {
	@Autowired
	private Tjcservicetype dao;
	
	
	/**
	 * 根据状态码查询服务
	 * @param i
	 * @param p
	 * @param s
	 * @return
	 */
	public PageInfo<Servicetype> query(int i,Integer p,Integer s){
		PageHelper.startPage(p, s);
		PageInfo<Servicetype> list= new PageInfo<Servicetype>(dao.servicetypequerys(i)); 
		return list;
	}
	
	/**
	 * 批量修改状态
	 * @param mid
	 * @param pid
	 * @return 
	 */
	public int servicesupdate(int[] mid,int pid) {
		
		return dao.servicesupdate(mid, pid);
	}
	
	
	/**
	 * 查询服务鉴定表
	 * @param p
	 * @param s
	 * @param stid
	 * @param aid
	 * @return
	 */
	public PageInfo<Services_User_Servicetype> service_identification(Integer p,Integer s,Integer stid,Integer aid){
		PageHelper.startPage(p,s);
		return new PageInfo<Services_User_Servicetype>(dao.service_identification(stid, aid));
	}
	
}
