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
import com.sy.hding.sys.pojo.Servicetype;
import com.sy.hding.sys.vo.tjc.Refund_Orders_User_Services;


@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class Tjcrefundbiz {
	@Autowired 
	private Tjcrefunddao dao;
	
	

	/**
	 * 查询退款信息
	 * @param name
	 * @return
	 */
	public PageInfo<Refund_Orders_User_Services> querysrefundt(String name, int id,Integer p,Integer s){
			PageHelper.startPage(p, s);
			PageInfo<Refund_Orders_User_Services> list= new PageInfo<Refund_Orders_User_Services>(dao.querysrefundt(name, id)); 
			return list;
	}
	
	
	
	/**
	 * 退款成功
	 * @param uid 用户id
	 * @param pid 状态码
	 * @return
	 * pid=1，修改用户金额=退款金额-10%退狂金额
	 * pid=2，商家金额=商家金额-退款金额
	 */
	public int updateusertjc( int uid,int pid, Double qi) {
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
	public int updaterefundtjc( int rid, Double qi,int pid) {
		return dao.updaterefundtjc(rid, qi, pid);
	}
}
