# Zipkin
Spring boot 2.0.3<br>
Spring Cloud Finchley.SR2<br>
Zipkin 2.9.4<br>
本项目总共有五个服务<br>
1、eureka 服务注册中心<br>
2、gateway 网关<br>
3、zk zipkin服务<br>
4、providera服务提供者a<br>
5、provider服务提供者b<br>

目前demo是通过访问网关服务a，
服务a通过feign访问服务b
还有就是直接访问服务b<br>
然后就可以再localhost:9411就可以查看个服务之间的链路调用<br>

因为demo比较简单，直接阅读代码就能明白
