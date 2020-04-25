package top.datadriven.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @description: 提供者启动类
 * @author: jiayancheng
 * @email: jiayancheng@foxmail.com
 * @datetime: 2020/4/25 3:59 下午
 * @version: 1.0.0
 */
public class DomeServiceTest {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"classpath:spring.xml"}
        );
        context.start();
        //任意键退出
        System.in.read();
    }

}