### 步骤一：创建项目
1.参考：http://ityouknow.com/springcloud/2018/07/20/spring-cloud-consul.html

### 步骤二：使用 Ribbon 消费服务
1.参考：https://www.jianshu.com/p/562045489d9d

### 步骤三：Ribbon 中引入 Hystrix
1. 访问 http://localhost:8504/add ，页面显示：30
2. 关闭所有服务后再访问 http://localhost:8504/add ，页面显示：error
3. 参考：http://blog.didispace.com/springcloud3/

### 参考
参考资料 | 网址
--- | ---
springcloud(十三)：注册中心 Consul 使用详解 | http://ityouknow.com/springcloud/2018/07/20/spring-cloud-consul.html
四：服务消费（LoadBalancerClient、Ribbon、Feign）（章节：4.2使用Ribbon）| https://www.jianshu.com/p/562045489d9d
Spring Cloud构建微服务架构（三）断路器（章节：Ribbon中引入Hystrix） | http://blog.didispace.com/springcloud3/