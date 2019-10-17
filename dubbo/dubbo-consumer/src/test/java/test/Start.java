package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dubbo.service.DemoService;

public class Start {
	public static void main(String[] args) {

		// 测试常规服务
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		context.start();
		System.out.println("consumer demo start");
		DemoService demoService = context.getBean(DemoService.class);
		System.out.println("consumer demo");
		System.out.println(demoService.getPermissions(1L));

	}
}
