package com.sy.hding.sys.dao.tjc;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sy.hding.sys.pojo.Refund;
import com.sy.hding.sys.vo.tjc.Refund_Orders_User_Services;

public interface Tjcrefunddao {
	
	
	/**
	 * 查询退款信息
	 * @param name
	 * @return
	 */
	public List<Refund_Orders_User_Services> querysrefundt(@Param("name") String name,@Param("id") int id);
	
	
	
	/**
	 * 退款成功
	 * @param uid 用户id
	 * @param pid 状态码
	 * @return
	 * pid=1，修改用户金额=退款金额-10%退狂金额
	 * pid=2，商家金额=商家金额-退款金额
	 */
	public int updateusertjc(@Param("uid") int uid,@Param("pid") int pid,@Param("qi") Double qi);
	
	/**
	 * 退款审核修改状态
	 * @param rid 订单di
	 * @param qi 退款金额
	 * @param pid 状态码
	 * pid=1 退款成功 实际退款金额=退款金额-10%，审核状态=2
	 * pid=2 退款失败 实际退款金额=0，审核状态=3
	 * @return
	 */
	public int updaterefundtjc(@Param("rid") int rid,@Param("qi") Double qi,@Param("pid") int pid);
}
