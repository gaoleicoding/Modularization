# Modularization
### 模块化：
单独module可以单独编译运行<br> 

### 为什么使用模块化：
 
在APP开发的初期，代码了不大，业务量比较下，一个APP作为一个单独的模块进行开发，往往问题不大，而且还能加快开发效率但是随着APP的用户量越来越多，也越来越复杂，这种开发方式显得结构特别的臃肿，特别是多个开发人员进行开发维护一个项目的时候每个人的代码质量也不相同，容易会产生代码冲突的问题。同时随着业务的增多，代码变的越来越复杂，每个模块之间的代码耦合变得越来越严重，导致代码混乱，没法进行单元测试，bug修改往往会牵一发而动全身，改掉一个bug，有产生新的bug，同时编译时间也会越来越长，这时候解耦问题急需解决。APP模块化的目标是告别结构臃肿，让各个业务变得相对独立，业务模块在组件模式下可以独立开发，而在集成模式下又可以变为依赖包集成到“app壳工程”中，组成一个完整功能的APP。<br>  
### 模块化的优点： 

1、团队可以并行工作<br> 
2、减少代码间耦合 <br> 
3、加快编译速度 <br>  

### Router的作用： 

我们所使用的原生路由方案一般是通过显式intent和隐式intent两种方式实现的，而在显式intent的情况下，因为会存在直接的类依赖的问题；而在隐式intent情况下，则会出现规则集中式管理，导致协作变得非常困难。而且一般而言配置规则都是在Manifest中的，这就导致了扩展性较差。除此之外，使用原生的路由方案会出现跳转过程无法控制的问题，因为一旦使用了StartActivity()就无法插手其中任何环节了，只能交给系统管理，这就导致了在跳转失败的情况下无法降级，而是会直接抛出运营级的异常。这时候如果考虑使用自定义的路由组件就可以解决以上的一些问题，比如通过URL索引就可以解决类依赖的问题；通过分布式管理页面配置可以解决隐式intent中集中式管理Path的问题；自己实现整个路由过程也可以拥有良好的扩展性，还可以通过AOP的方式解决跳转过程无法控制的问题，与此同时也能够提供非常灵活的降级方式。
项目中使用的是简单Router。其它功能丰富的Router，如阿里开源的ARouter，当然还有其它的。ARouter对页面、服务提供路由功能的中间件，提供跨模块API调用，通过控制反转来做组件解耦，提供参数传递、解析，跳转拦截等强大的功能


