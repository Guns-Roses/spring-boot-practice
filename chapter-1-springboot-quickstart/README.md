# Chapter-1 知识点

## 1.@RestController和@Controller
    @RestController = @Controller + @ResponseBody  

## 2.application.properties和application.yml
    在一个maven工程中同时配置了application.yml和application.properties文件
    会按照怎么样的顺序去加载？两个文件中的配置都会被读取吗？还是只读取其中的一个文件？
    如果只读取一个文件的话，那个文件最终有效？
    
    在一个 Spring Boot 的 Maven 项目中，如果同时配置了 application.yml 和 application.properties 文件，Spring Boot 默认会同时读取两个文件的配置，并按特定的优先级进行合并。优先级规则如下：
    1.优先级顺序：application.properties 的配置优先级高于 application.yml，也就是说，如果两个文件中有相同的配置项，application.properties 中的值会覆盖 application.yml 中的值。
    2.配置合并：两个文件的内容会一起加载，并合并成为一个环境配置。不同的配置项会相互补充，不同的配置会同时生效。例如，如果 application.yml 中定义了数据库配置，而 application.properties 中定义了服务端口，Spring Boot 会将这两个配置都加载到环境中。
    3.配置文件的覆盖规则：
    若 application.properties 和 application.yml 中存在相同的配置项，application.properties 中的值将覆盖 application.yml 中的值。
    若两个文件的配置项不同，则两者的配置会同时生效。
