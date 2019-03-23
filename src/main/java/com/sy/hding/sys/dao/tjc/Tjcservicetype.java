package com.sy.hding.sys.dao.tjc;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sy.hding.sys.pojo.Servicetype;

public interface Tjcservicetype {
	/**
	 * 查询服务类别
	 * 可查询服务主类别
	 * i=1为查询所有服务
	 * i=2查询所有主服务
	 * @return
	 */
	public List<Servicetype> servicetypequerys(@Param("i") Integer i);
}
