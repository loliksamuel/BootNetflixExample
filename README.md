# spring-cloud-Netflix-microservices-example
###### tutorial http://samchu.logdown.com/posts/313414-microservice-with-springcloud

## Spring-boot multi-moudle(include few core-micro-services and  few netflix-support-micro-services) 

## microservices-core:
1. service-auth (@EnableEurekaClient)
2. service-reservation  (@EnableEurekaClient)
3. service-reservation-client   (@EnableEurekaClient + @EnableFeignClients + @FeignClient("service-reservation"))


## microservices-support from netflix opensource(run it in this order):
1. https://github.com/Netflix/eureka - (@EnableEurekaServer) Service Discovery help find available microservice network location. instances can be registered and clients can discover the instances using Spring-managed beans.
2. https://spring.io/guides/gs/centralized-configuration - (@EnableConfigServer) spring cloud config
3. https://github.com/Netflix/archaius - Library for configuration management API
4. https://github.com/Netflix/zuul - (@EnableZuulProxy) is the front door for all requests from devices and websites to the backend of the   application. As an edge service application, Zuul is built to monitoring, resiliency, security, and dynamic-Intelligent Routing ( api gateway / facade / reverse-proxy)
5. https://github.com/Netflix/ribbon - (@RibbonClient) Client Side Load Balancing 
6. https://github.com/Netflix/Hystrix - (@EnableHystrix, @EnableCircuitBreaker) Circuit Breaker fault tolerance design pattern and a cool interface called the Hystrix Dashboard 
7. https://github.com/Netflix/Turbine - (@EnableTurbine, @EnableHystrixDashboard) Aggregate streams of Server-Sent Event(SSE) JSON data into a single stream and dashboard for monitoring.
8. https://github.com/openzipkin/zipkin - (@EnableZipkinServer) Zipkin is a distributed tracing system. It helps gather timing data needed to troubleshoot latency problems in microservice architectures.

![hystrix_monitor](https://raw.githubusercontent.com/whoooami/spring-cloud-microservice-world/master/images/localhost_8010_hystrix_monitor.png)

## see Feign:
https://github.com/OpenFeign/feign - (@EnableFeignClients) Feign is a Java to HTTP client binder 

## see Slides: 
http://www.slideshare.net/IdanFridman/building-bootiful-microservices-cloud


 
