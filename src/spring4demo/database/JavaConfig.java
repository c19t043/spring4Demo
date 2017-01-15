package spring4demo.database;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.WebApplicationContext;

@Configuration
public class JavaConfig {
	@Bean
	@Conditional(MagicExistsCondition.class)
	@Primary
	@Qualifier("magic")
	/*@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)*/
/*	@Scope(value=WebApplicationContext.SCOPE_SESSION,
			proxyMode=ScopedProxyMode.INTERFACES)*/
	@Scope(value=WebApplicationContext.SCOPE_SESSION,
	proxyMode=ScopedProxyMode.TARGET_CLASS)
	public MagicBean magicBean(){
		return new MagicBean();
	}
}
