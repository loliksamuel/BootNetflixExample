# spring-cloud-Netflix-Example

Spring-boot multi-moudle(include few micro-services) with Netflix 
open source  (& boot integration) libraries. run it in this order:
1. https://github.com/Netflix/eureka - (@EnableEurekaClient, @EnableDiscoveryClient, @EnableEurekaServer) Service Discovery help find available microservice network location. instances can be registered and clients can discover the instances using Spring-managed beans.
2. https://spring.io/guides/gs/centralized-configuration - (@EnableConfigServer) spring cloud config
3. https://github.com/Netflix/archaius - Library for configuration management API
4. https://github.com/Netflix/zuul - (@EnableZuulProxy) is the front door for all requests from devices and websites to the backend of the   application. As an edge service application, Zuul is built to monitoring, resiliency, security, and dynamic-Intelligent Routing ( api gateway / facade / reverse-proxy)
5. auth-server 
6. reservation-service  
7. reservation-client  
8. https://github.com/Netflix/ribbon - (@RibbonClient) Client Side Load Balancing 
9. https://github.com/Netflix/Hystrix - (@EnableHystrix, @EnableCircuitBreaker) Circuit Breaker fault tolerance design pattern and a cool interface called the Hystrix Dashboard 
10. https://github.com/Netflix/Turbine - (@EnableTurbine, @EnableHystrixDashboard) Aggregate streams of Server-Sent Event(SSE) JSON data into a single stream and dashboard for monitoring.
11. https://github.com/OpenFeign/feign - (@EnableFeignClients) Feign is a Java to HTTP client binder 
12. https://github.com/openzipkin/zipkin - (@EnableZipkinServer) Zipkin is a distributed tracing system. It helps gather timing data needed to troubleshoot latency problems in microservice architectures.



Slides explaning the projects can be found at: 
http://www.slideshare.net/IdanFridman/building-bootiful-microservices-cloud


 
