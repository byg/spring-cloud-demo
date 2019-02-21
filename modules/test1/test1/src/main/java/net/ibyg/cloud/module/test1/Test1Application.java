package net.ibyg.cloud.module.test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 
 * @author byg
 * 2019年2月20日 上午9:38:46
 *
 */
@SpringCloudApplication
@EnableFeignClients(basePackages={"net.ibyg.cloud.module.test2"})
public class Test1Application extends SpringBootServletInitializer {
	
	public static void main(String[] args) {
		SpringApplication.run(Test1Application.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		this.setRegisterErrorPageFilter(false); // 错误页面有容器来处理，而不是SpringBoot
		return builder.sources(Test1Application.class);
	}
	
}