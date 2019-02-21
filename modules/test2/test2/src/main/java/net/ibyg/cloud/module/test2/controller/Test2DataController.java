package net.ibyg.cloud.module.test2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="${adminPath}/test2/testData")
public class Test2DataController {

	@RequestMapping("/list")
	@ResponseBody
	public String list() {
		return "hello from test2";
	}
}
