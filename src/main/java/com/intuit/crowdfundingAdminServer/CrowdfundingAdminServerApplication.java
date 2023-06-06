package com.intuit.crowdfundingAdminServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class CrowdfundingAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrowdfundingAdminServerApplication.class, args);
	}

}
