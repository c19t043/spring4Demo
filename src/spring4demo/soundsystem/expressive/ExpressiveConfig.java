package spring4demo.soundsystem.expressive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import spring4demo.soundsystem.BlankDisc;


@Configuration
@PropertySource("classpath:/spring4demo/soundsystem/expressive/app.properties")
public class ExpressiveConfig {
	@Autowired
	private Environment env;
	
	@Bean
	public spring4demo.soundsystem.BlankDisc disc(){
		return new BlankDisc(env.getProperty("disc.title"), env.getProperty("disc.artist"));
	}
}
