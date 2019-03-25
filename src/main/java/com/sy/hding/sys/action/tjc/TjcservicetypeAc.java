package com.sy.hding.sys.action.tjc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.sy.hding.sys.biz.tjc.Tjcservicetypebiz;
import com.sy.hding.sys.pojo.Servicetype;

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

}
