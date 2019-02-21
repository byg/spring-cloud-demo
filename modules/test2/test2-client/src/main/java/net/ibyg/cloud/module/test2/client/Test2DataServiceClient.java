package net.ibyg.cloud.module.test2.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author byg
 * 2019年2月20日 上午8:28:06
 *
 */
@FeignClient(name="${service.test2.name}", path="${service.test2.path}")
public interface Test2DataServiceClient {
	
	@RequestMapping("list")
	public String list();
}
