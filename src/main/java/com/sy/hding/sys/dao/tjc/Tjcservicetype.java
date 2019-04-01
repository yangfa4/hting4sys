package com.sy.hding.sys.dao.tjc;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sy.hding.sys.pojo.Servicetype;
import com.sy.hding.sys.vo.tjc.Services_User_Servicetype;

public interface Tjcservicetype {
	/**
	 * 查询服务类别
	 * 可查询服务主类别
	 * i=1为查询所有服务
	 * i=2查询所有主服务
	 * @return
	 */
	public List<Servicetype> servicetypequerys(@Param("i") Integer i);
	
	/**
	 * 服务鉴定查询
	 * @param stid服务类别
	 * @param auditStatus审核状态
	 * @return
	 */
	public List<Services_User_Servicetype> service_identification(@Param("stid") int stid,@Param("auditStatus") int auditStatus);
	
	/**
	 * 批量修改审核状态、是否上架、是否推荐
	 * @param mid 服务商品id
	 * @param pid 状态码
	 * @return 
	 */
	public int servicesupdate(@Param("mid") int[] mid,@Param("pid") int pid);
}
