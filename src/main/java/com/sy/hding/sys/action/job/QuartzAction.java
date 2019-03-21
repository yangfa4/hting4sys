package com.sy.hding.sys.action.job;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.Job;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.TriggerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/job")
public class QuartzAction {

/*	@Autowired
	private Scheduler scheduler;// Quartz任务调度器【非常重要】,最终在Action中可以使用

	@Autowired
	private TblJobBiz jobBiz;

	@GetMapping("/list")
	public List<TblJob> getJobsList() {
		return jobBiz.findJobList();
	}

	*//**
	 * 
	 * @title: addJob
	 * @description: 追加任务并开启调度
	 * @param name
	 * @param group
	 * @return
	 * @throws Exception
	 *//*
	@PostMapping("/add")
	public Map<String, Object> addJob(TblJob job) throws Exception {
	
		String cls = null, cron = null;
		switch (job.getJdes()) {
		case "定时报表任务":
			cls = "com.accp.quartz.job.Job2";
			break;
		case "定时数据库备份任务":
			cls = "com.accp.quartz.job.Job1";
			break;
		}
		switch (job.getJcron()) {
		case "每隔5秒执行":
			cron = "0/5 * * * * ?";
			break;
		case "每隔15秒执行":
			cron = "0/15 * * * * ?";
			break;
		}
		// 可以考虑不同的任务类，采用传递类的完整限定名来构建JobDetail
		JobDetail jd = JobBuilder.newJob((Class<? extends Job>) Class.forName(cls))
				.withIdentity(job.getJname(), job.getJgroup()).build();
		CronTrigger trigger = TriggerBuilder.newTrigger().withIdentity(job.getJname(), job.getJgroup())
				.withSchedule(CronScheduleBuilder.cronSchedule(cron)).build();
		scheduler.scheduleJob(jd, trigger);// 追加任务
		jobBiz.addJob(job);// 保存业务任务表中
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		return message;
	}

	*//**
	 * 
	 * @title: delJob
	 * @description: 移除任务
	 * @param name
	 * @param group
	 * @return
	 * @throws Exception
	 *//*
	@DeleteMapping("/del/{name}/{group}")
	public Map<String, Object> delJob(@PathVariable String name, @PathVariable String group) throws Exception {
		scheduler.pauseJob(JobKey.jobKey(name, group));
		scheduler.deleteJob(JobKey.jobKey(name, group));
		jobBiz.removeJob(name, group);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		return message;
	}

	*//**
	 * 
	 * @title: pauseJob
	 * @description: 暂停任务
	 * @param name
	 * @param group
	 * @return
	 * @throws Exception
	 *//*
	@PutMapping("/pause/{name}/{group}")
	public Map<String, Object> pauseJob(@PathVariable String name, @PathVariable String group) throws Exception {
		// scheduler.pauseAll();
		scheduler.pauseJob(JobKey.jobKey(name, group));
		jobBiz.modifyJobState(name, group, 1);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		return message;
	}

	*//**
	 * 
	 * @title: resumeJob
	 * @description: 恢复任务
	 * @param name
	 * @param group
	 * @return
	 * @throws Exception
	 *//*
	@PutMapping("/resume/{name}/{group}")
	public Map<String, Object> resumeJob(@PathVariable String name, @PathVariable String group) throws Exception {
		scheduler.resumeJob(JobKey.jobKey(name, group));
		jobBiz.modifyJobState(name, group, 0);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		return message;
	}
*/
}
