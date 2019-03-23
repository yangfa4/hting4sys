package com.sy.hding.sys;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.github.pagehelper.PageInfo;
import com.sy.hding.sys.biz.lhq.LhqAdvertiseBiz;
import com.sy.hding.sys.pojo.Advertisement;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LhqAdvertisementTest {
	
	@Autowired
	private LhqAdvertiseBiz biz;
	
	@Test
	public void queryAdvertisementList() {
		PageInfo<Advertisement> list=biz.queryAdvertisementList(1,3);
		for (Advertisement temp : list.getList()) {
			System.out.println(temp);
		}
	}
	
	@Test
	public void getAdvertisementByid() {
		Advertisement ad=biz.getAdvertisementByid(1);
		System.out.println("输出对象："+ad);
		
	}

	
}
