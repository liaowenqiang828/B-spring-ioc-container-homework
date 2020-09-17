#### @Component 已经可以支持声明一个 bean 了，为何还要再弄个 @Bean 出来?

1. @Component注解表明一个类会作为组件类, @Bean注解告诉Spring这个方法将会返回一个对象.
2. @Bean比@Component的自定义性更强,可以实现一些@Component实现不了的自定义加载类。
3. 在使用第三方库中的组件时，不能在组件类上添加@Component注解的，因为该组件类内部可能包含了大量我们不需要的Beans,因此就不能使用自动化装配的方案了，但是我们可以使用@Bean来标记我们需要的Beans。
