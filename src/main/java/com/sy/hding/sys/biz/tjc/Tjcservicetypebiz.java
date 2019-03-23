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
	
	
}
