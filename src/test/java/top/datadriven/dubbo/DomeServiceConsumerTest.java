package top.datadriven.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.datadriven.dubbo.service.DomeService;

/**
 * @description: 费者启动类
 * @author: jiayancheng
 * @email: jiayancheng@foxmail.com
 * @datetime: 2020/4/25 3:59 下午
 * @version: 1.0.0
 */
public class DomeServiceConsumerTest {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"classpath:/config/consumer.xml"}
        );
        context.start();
        int i = 1;
        while (true) {
            DomeService demo = (DomeService) context.getBean("demoService");
            String hello = demo.sayHello("jyc" + i);
            i++;
            System.out.println(hello);
            Thread.sleep(2000);

        }
    }
}