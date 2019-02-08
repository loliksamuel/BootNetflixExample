# BootNetflixExample
Spring-boot multi-moudle(include 4 micro-services) with Netflix 
open source  (& boot integration) libraries:
1. https://github.com/Netflix/zuul - (@EnableZuulProxy) is the front door for all requests from devices and websites to the backend of the   application. As an edge service application, Zuul is built to monitoring, resiliency, security, and dynamic-Intelligent Routing ( api gateway / facade / reverse-proxy)
2. https://github.com/Netflix/ribbon - (@RibbonClient) Client Side Load Balancing 
3. https://github.com/Netflix/eureka - (@EnableEurekaClient, @EnableDiscoveryClient, @EnableEurekaServer) Service Discovery help find available microservice network location. instances can be registered and clients can discover the instances using Spring-managed beans.                
4. https://github.com/Netflix/Hystrix - (@EnableHystrix, @EnableCircuitBreaker) Circuit Breaker fault tolerance design pattern and a cool interface called the Hystrix Dashboard 
5. https://github.com/Netflix/Turbine - (@EnableTurbine, @EnableHystrixDashboard) Aggregate streams of Server-Sent Event(SSE) JSON data into a single stream and dashboard for monitoring.
6. https://github.com/OpenFeign/feign - (@EnableFeignClients) Feign is a Java to HTTP client binder 
7. https://github.com/openzipkin/zipkin - (@EnableZipkinServer) Zipkin is a distributed tracing system. It helps gather timing data needed to troubleshoot latency problems in microservice architectures.
8. https://spring.io/guides/gs/centralized-configuration - (@EnableConfigServer) spring cloud config
9. https://github.com/Netflix/archaius - Library for configuration management API


Slides explaning the projects can be found at: 
http://www.slideshare.net/IdanFridman/building-bootiful-microservices-cloud


 
