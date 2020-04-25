# 说明
dubbo直连demo：基于maven、spring，并且不使用注册中心(比如zk)。

- 发布服务：无注册中心，直接发布。在`dubbo:service`中加入`registry="N/A"`
- 调用服务：不通过注册中心，通过URL直接调用。在`dubbo:reference`中加入`url`

参考：http://dubbo.apache.org/zh-cn/docs/user/demos/explicit-target.html

