wit-mvc-demo
====================

Wit MVC demo

本示例尽量采用最少的代码演示使用方法，尽量做到最小第三方依赖，因此没有的数据库调用模块，无需复杂配置，生成后可直接部署在Web容器下运行并查看效果

##目录说明

- [x] base-model        共享的基础代码
- [x] common-templates  共享的模板及配置文件
- [x] jfinal-demo       JFinal 支持示例
- [x] jodd-madvoc-demo  Jodd-madvoc 支持示例
- [x] spring-mvc-demo   Spring mvc 支持示例
- [x] struts-demo       Struts 支持示例
- [x] servlet-demo      servlet 支持示例
- [x] servlet-filter-demo servlet-filter 支持示例

##生成示例

~~~~~~
mvn clean install
~~~~~~

###运行示例

+ 每个模块的实例将会在 `target` 文件夹下，打包为war文件，已经合并了共享的模板以及配置
+ 可直接部署在Tomcat、jetty 等Web容器下
