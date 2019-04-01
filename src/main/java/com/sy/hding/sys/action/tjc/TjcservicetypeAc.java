package com.sy.hding.sys.action.tjc;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.sy.hding.sys.biz.tjc.Tjcservicetypebiz;
import com.sy.hding.sys.pojo.Servicetype;
import com.sy.hding.sys.vo.tjc.Services_User_Servicetype;

@RestController
@RequestMapping("/sys/fuwu")
public class TjcservicetypeAc {
	
	@Autowired 
	private Tjcservicetypebiz servicetype;
	
	
	/**
	 * 查询所有服务
	 * @param i 状态码
	 * @param p	
	 * @param s	
	 * @return
	 */
	@GetMapping("/query/{i}/{p}/{s}")
	public PageInfo<Servicetype> query(@PathVariable Integer i,@PathVariable Integer p,@PathVariable Integer s){
		return servicetype.query(i, p, s);
	}
	
	
	/**
	 * 查询鉴定服务
	 * @param p
	 * @param s
	 * @param stid
	 * @param aid
	 * @return
	 */
	@GetMapping("/servicequery/{p}/{s}/{stid}/{aid}")
	public PageInfo<Services_User_Servicetype> service_identification(@PathVariable Integer p,@PathVariable Integer s,
			@PathVariable Integer stid,@PathVariable Integer aid){
		return servicetype.service_identification(p, s, stid, aid);
	}
	
	/**
	 * 批量修改状态
	 * @param mid
	 * @param pid
	 * @return
	 */
	@PutMapping("/servicesupdate/{mid}/{pid}")
	public Map<String, Object>servicesupdate(@PathVariable String mid,@PathVariable int pid){
		String[] str = mid.split(",");
		int[] uids=new int[str.length];
		for (int i = 0; i < str.length; i++) {
			uids[i]=Integer.parseInt(str[i]);
		}
		int i=servicetype.servicesupdate(uids, pid);
		for (int j = 0; j < uids.length; j++) {
			System.out.println(uids[j]);
		}
		Map<String, Object> message=new HashMap<String,Object>();
		if(i>0) {
			message.put("code", 200);
		}else {
			message.put("code",400);
		}
		return message;
	}
	
}
