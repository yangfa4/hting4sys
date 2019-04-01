package com.sy.hding.sys;

import java.io.*;
import java.net.*;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sy.hding.sys.biz.tjc.Tjcservicetypebiz;
import com.sy.hding.sys.vo.tjc.Services_User_Servicetype;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Hanting4SysApplicationTests {
	@Autowired
	private Tjcservicetypebiz biz;
	
	@Test
	public void contextLoads() throws IOException {
		/*BufferedReader br=null;
			//访问百度
			URL ur=new URL("http://apis.juhe.cn/mobile/get?phone=19958128041&dtype=&key=61c6a4822158f67a501d6acf5e91a8f1");
			//获得连接
			HttpURLConnection http=(HttpURLConnection)ur.openConnection();
			//设置请求头
			http.setRequestMethod("GET");
			//http.setDefaultRequestProperty("C-http", "application/json");
			http.setConnectTimeout(6*10000);//连接超时
			http.setReadTimeout(6*1000);//coxket超时
			//建立连接
			http.connect();
			//获得响应信息
			int code=http.getResponseCode();
			switch (code) {
			case HttpURLConnection.HTTP_OK:
				  System.out.println("资源获取成功");
				  //读取数据
				  //低级流转换成高级流
				 br=new BufferedReader(new InputStreamReader(http.getInputStream(),"UTF-8"));
				 for(String str=null;(str=br.readLine())!=null;) {
					 System.out.println(str);
				 }
				break;
			case HttpURLConnection.HTTP_NOT_FOUND:
				  System.out.println("资源不存在");
				break;
			case HttpURLConnection.HTTP_INTERNAL_ERROR:
				  System.out.println("服务器内部错误");
				break;
			default:
				break;
			}
		*/
	}
	
	@Test
	public void ok(){
		 biz.service_identification(1, 2, 1, 2);
	}

}
