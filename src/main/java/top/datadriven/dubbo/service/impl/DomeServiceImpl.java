package top.datadriven.dubbo.service.impl;

import top.datadriven.dubbo.service.DomeService;

/**
 * @description: 服务提供者接口实现
 * @author: jiayancheng
 * @email: jiayancheng@foxmail.com
 * @datetime: 2020/4/25 3:58 下午
 * @version: 1.0.0
 */

public class DomeServiceImpl implements DomeService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

}