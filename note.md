## 微服务
> 什么是微服务?
```text
    就目前而言，对于微服务业界并没有一个统一的，标准的定义。
    但通常而言，微服务架构是一种架构模式或者说是一种架构风格，它提倡将单一应用程序划分一组小的服务，每
个服务运行在其独立的自己的进程中，服务之间相互协调、互相配合，为用户提供最总价值。服务之间采用轻量级的
通信机制互相沟通（通常是基于HTTP的RESTful API）,每个服务都围绕着具体的业务进行构建，并且能够被独立的
构建在生产环境、类生产环境等。另外，应避免统一的、集中式的服务管理机制，对具体的一个服务而言，应根据业
务上下文，选择合适的语言、工具对其进行构建，可以有一个非常轻量级的集中式管理来协调这些服务，可以使用不
同的语言来编写服务，也可以使用不同的数据存储。
```



## springCloud分布式开发五大神兽
* 服务发现——Netflix Eureka
* 客服端负载均衡——Netflix Ribbon
* 断路器——Netflix Hystrix
* 服务网关——Netflix Zuul
* 分布式配置——Spring Cloud Config

#### Eureka
```text
        一个RESTful服务，用来定位运行在AWS地区（Region）中的中间层服务。由两个组件组成：Eureka服务
    器和Eureka客户端。Eureka服务器用作服务注册服务器。Eureka客户端是一个java客户端，用来简化与服
    务器的交互、作为轮询负载均衡器，并提供服务的故障切换支持。Netflix在其生产环境中使用的是另外的
    客户端，它提供基于流量、资源利用率以及出错状态的加权负载均衡。
```

#### Ribbon
```text
    Ribbon，主要提供客户侧的软件负载均衡算法。
    完善的配置选项，比如连接超时、重试、重试算法等。Ribbon内置可插拔、可定制的负载均衡组件。下面是用到的一些负载均衡策略：
    
        简单轮询负载均衡
        
        加权响应时间负载均衡
        
        区域感知轮询负载均衡
        
        随机负载均衡

    Ribbon中还包括以下功能：
    
        易于与服务发现组件（比如Netflix的Eureka）集成
        
        使用Archaius完成运行时配置
        
        使用JMX暴露运维指标，使用Servo发布
        
        多种可插拔的序列化选择
        
        异步和批处理操作（即将推出）
        
        自动SLA框架（即将推出）
        
        系统管理/指标控制台（即将推出）

```

#### Hystrix
```text
    断路器可以防止一个应用程序多次试图执行一个操作，即很可能失败，允许它继续而不等待故障恢复或者浪费 CPU 
周期，而它确定该故障是持久的。断路器模式也使应用程序能够检测故障是否已经解决。如果问题似乎已经得到纠正​​，
应用程序可以尝试调用操作。
    断路器增加了稳定性和灵活性，以一个系统，提供稳定性，而系统从故障中恢复，并尽量减少此故障的对性能的影响。
它可以帮助快速地拒绝对一个操作，即很可能失败，而不是等待操作超时（或者不返回）的请求，以保持系统的响应时间。
如果断路器提高每次改变状态的时间的事件，该信息可以被用来监测由断路器保护系统的部件的健康状况，或以提醒管理员
当断路器跳闸，以在打开状态。
```

#### Zuul
```text
    类似nginx，反向代理的功能，不过netflix自己增加了一些配合其他组件的特性。
```

### Spring Cloud Config
```text
这个还是静态的，得配合Spring Cloud Bus实现动态的配置更新。
```