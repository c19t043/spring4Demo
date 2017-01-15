package spring4demo.database;


import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jndi.JndiObjectFactoryBean;
import org.springframework.test.context.ActiveProfiles;

@Configuration
@ActiveProfiles("dev")
public class DataSourceConfig {
	
	@Bean(destroyMethod="shutdown")
	@Profile("dev")
	public DataSource dataSource(){
		return new EmbeddedDatabaseBuilder()
			.addScript("classpath:schema.sql")
			.addScript("classpath:test-data.sql")
			.build();
	}
	@Bean(destroyMethod="close")
	@Profile("qa")
	public DataSource dataSource2(){
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setUrl("jdbc:h2:tcp:/dbserver/~/test");
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUsername("sa");
		dataSource.setPassword("password");
		dataSource.setInitialSize(20);
		dataSource.setMaxActive(30);
		return dataSource;
	}
	@Bean
	@Profile("prod")
	public DataSource dataSource1(){
		JndiObjectFactoryBean jndiObjectFactoryBean = 
				new JndiObjectFactoryBean();
		jndiObjectFactoryBean.setJndiName("jdbc/myDataBase");
		jndiObjectFactoryBean.setResourceRef(true);	
		jndiObjectFactoryBean.setProxyInterface(DataSource.class);
		return (DataSource) jndiObjectFactoryBean.getObject();
	}

}
