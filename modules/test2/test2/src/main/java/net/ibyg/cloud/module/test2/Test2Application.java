package net.ibyg.cloud.module.test2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * 
 * @author byg
 * 2019年2月20日 上午9:38:46
 *
 */
@SpringCloudApplication
public class Test2Application extends SpringBootServletInitializer {
	
	public static void main(String[] args) {
		SpringApplication.run(Test2Application.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		this.setRegisterErrorPageFilter(false); // 错误页面有容器来处理，而不是SpringBoot
		return builder.sources(Test2Application.class);
	}
	
}