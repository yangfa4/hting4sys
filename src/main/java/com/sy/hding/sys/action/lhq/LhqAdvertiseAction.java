package com.sy.hding.sys.action.lhq;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.sy.hding.sys.biz.lhq.LhqAdvertiseBiz;
import com.sy.hding.sys.pojo.Advertisement;

@RestController
@RequestMapping("/sys/api")
public class LhqAdvertiseAction {
	
	@Autowired
	private LhqAdvertiseBiz biz;
	
	@GetMapping(value="advertise/queryAlladvertise")
	public PageInfo<Advertisement> queryAdvertisementList(Integer p,Integer s) {
		System.out.println("输出P:"+p+","+"s:"+s);
		System.out.println("输出集合："+biz.queryAdvertisementList(1,3).getList());
		return biz.queryAdvertisementList(p,s);
		
	}
	
	@GetMapping(value="advertise/getAdvertisementByid") 
	public Advertisement getAdvertisementByid(Integer aid) {
		System.out.println("输出aid:"+aid);
		return biz.getAdvertisementByid(aid);
	}
	
	@PutMapping(value="advertise/updateAdvertisement")
	public Map<String,String>  updateAdvertisement(@RequestBody Advertisement advertise) {
		Map<String,String> message=new HashMap<String,String>();
		biz.updateAdvertisement(advertise);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}

}
