package com.sy.hding.sys.action.tjc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sy.hding.sys.biz.tjc.Tjcrefundbiz;
import com.sy.hding.sys.vo.tjc.Refund_Orders_User_Services;

@RestController
@RequestMapping("/sys/fuwu/tk")
public class TjcrefundAc {
	
	@Autowired
	private Tjcrefundbiz biz;
	

	/**
	 * 查询退款信息
	 * @param name
	 * @return
	 */
	@GetMapping(value= {"/querysrefundt/{name}/{id}/{p}/{s}","/querysrefundt/{id}/{p}/{s}"})
	public PageInfo<Refund_Orders_User_Services> querysrefundt(@PathVariable(required=false) String name,@PathVariable int id,
			@PathVariable Integer p,@PathVariable Integer s){
			PageHelper.startPage(p, s);
			return biz.querysrefundt(name, id, p, s);
	}
	
	
	
	/**
	 * 退款成功
	 * @param uid 用户id
	 * @param pid 状态码
	 * @return
	 * pid=1，修改用户金额=退款金额-10%退狂金额
	 * pid=2，商家金额=商家金额-退款金额
	 */
	@PutMapping("/updateusertjc/{uid}/{pid}/{qi}")
	public int updateusertjc(@PathVariable int uid,@PathVariable int pid,@PathVariable Double qi) {
		return biz.updateusertjc(uid, pid, qi);
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
	@PutMapping("/updaterefundtjc/{rid}/{qi}/{pid}")
	public int updaterefundtjc(@PathVariable int rid,@PathVariable Double qi,@PathVariable int pid) {
		return biz.updaterefundtjc(rid, qi, pid);
	}
}
