package spring4demo.demo.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring4demo.demo.BraveKnight;
import spring4demo.demo.Knight;
import spring4demo.demo.Quest;
import spring4demo.demo.SlayDragonQuest;

@Configuration
public class KnightConfig {

	@Bean
	public Knight knight(){
		return new BraveKnight(quest());
	}
	@Bean
	public Quest quest(){
		return new SlayDragonQuest(System.out);
	}
}
