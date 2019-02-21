package net.ibyg.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 
 * @author byg
 * 2019年2月20日 上午9:06:56
 *
 */
@EnableConfigServer
@SpringCloudApplication
public class ConfigApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ConfigApplication.class, args);
	}
	
}