package spring4demo.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("/spring4demo/demo/xmlConfig/knights.xml");//加载spring上下文
		Knight knight = context.getBean(Knight.class);//获取knight bean
		knight.embarkOnQuest();//使用knight
		context.close();
	}
}
