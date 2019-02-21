package net.ibyg.cloud.module.test1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.ibyg.cloud.module.test2.client.Test2DataServiceClient;

/**
 * 
 * @author byg
 * 2019年2月20日 上午9:46:01
 *
 */
@RestController
@RequestMapping(value="${adminPath}/test1/testData")
public class TestDataController {

	@Autowired
	private Test2DataServiceClient testDataService;
	
	
	/**
	 * 查询列表
	 */
	@RequestMapping(value = {"list1", ""})
	public String list1() {
		return "hello from test1";
	}
	
	/**
	 * 查询列表
	 */
	@RequestMapping(value = {"list2", ""})
	public String list2() {
		return testDataService.list();
	}
}
