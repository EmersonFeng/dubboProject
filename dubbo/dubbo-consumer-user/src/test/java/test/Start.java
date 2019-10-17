package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dubbo.service.DemoService;
import com.dubbo.service.UserService;

public class Start {
	public static void main(String[] args) {
		// 测试常规服务
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		context.start();
		System.out.println("consumer user start");
		UserService userService = (UserService) context.getBean("userService");
		System.out.println("consumer user");
		System.out.println(userService.getName("1"));
		
//		DemoService demoService = (DemoService) context.getBean("ddemoService");
//		System.out.println("consumer demo");
//		System.out.println(demoService.getPermissions(15L));
		
		
	}
}
