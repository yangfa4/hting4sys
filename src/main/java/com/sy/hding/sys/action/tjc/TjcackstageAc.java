package com.sy.hding.sys.action.tjc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sy.hding.sys.biz.tjc.Tjcservicetypebiz;


@Controller
@RequestMapping("/sys/index")
public class TjcackstageAc {
	@Autowired
	private Tjcservicetypebiz biz;
	
	/**
	 * 进入服务审核页面
	 * @return
	 */
	@GetMapping("fwsh")
	public String fwsh() {
		return "tjc/fwsh";
	}
	
	/**
	 * 进入服务管理
	 * @return
	 */
	@GetMapping("fwlbsz")
	public String fwlbsz() {
		return "tjc/fwlbsz";
	}
	
	
	/**
	 * 进入退款审核
	 * @return
	 */
	@GetMapping("tkgl")
	public String tkgl() {
		return "tjc/tkgl";
	}
	
	/**
	 * 退款详情页面
	 */
	@GetMapping("tkcl")
	public String tkcl() {
		return "tjc/tkcl";
	}
}
