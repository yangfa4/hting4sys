package com.sy.hding.sys.biz.tjc;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sy.hding.sys.dao.tjc.Tjcrefunddao;
import com.sy.hding.sys.pojo.Refund;


@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class Tjcrefundbiz {
	@Autowired 
	private Tjcrefunddao dao;
	
	
	/**
	 * 查询退款表
	 * @return
	 */
	public  PageInfo<Refund> querysrefundt(Integer p,Integer s){
		PageHelper.startPage(p, s);
		return new PageInfo<Refund>(dao.querysrefundt());
	}
	
	/**
	 * 查询退款详情
	 * @param id
	 * @return
	 *//*
	public vo querysvo(@Param("id") int id);*/
	
	/**
	 * 退款成功
	 * @param uid 用户id
	 * @param pid 状态码
	 * @return
	 * pid=1，修改用户金额=退款金额-10%退狂金额
	 * pid=2，商家金额=商家金额-退款金额
	 */
	public int updateusertjc( int uid, int pid, Double qi) {
		return dao.updateusertjc(uid, pid, qi);
	}
	
	/**
	 * 退款审核修改状态
	 * @param rid 订单di
	 * @param qi 退款金额
	 * @param pid 状态码
	 * pid=1 退款成功 实际退款金额=退款金额-10%，审核状态=2
	 * pid=2 退款失败 实际退款金额=0，审核状态=3
	 * @return
	 */
	public int updaterefundtjc(int rid,Double qi,int pid) {
		return dao.updaterefundtjc(rid, qi, pid);
	}
}
