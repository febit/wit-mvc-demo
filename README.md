webitscript-mvc-demo
====================

Webit Script MVC demo

本示例尽量采用最少的代码演示使用方法，尽量做到最小第三方依赖，因此没有的数据库调用模块，无需复杂配置，生成后可直接部署在Web容器下运行并查看效果

##目录说明
- [x] base-model        共享的基础代码
- [x] common-templates  共享的模板及配置文件
- [ ] jfinal-demo       JFinal 支持示例
- [ ] jodd-madvoc-demo  Jodd-madvoc 支持示例
- [ ] spring-mvc-demo   Spring mvc 支持示例
- [ ] struts-demo       Struts 支持示例
- [ ] servlet-demo      servlet 支持示例
- [ ] servlet-filter-demo servlet-filter 支持示例

##编辑说明
- 必须保留`<module>base-model</module>`
- 根据需要可注释掉以下可选模块

~~~~~xml
<module>jfinal-demo</module>
<module>jodd-madvoc-demo</module>
<module>spring-mvc-demo</module>
<module>struts-demo</module>
<module>servlet-demo</module>
<module>servlet-filter-demo</module>
~~~~~

##生成示例

###IDE生成示例
+ Netbeans: 在项目右键菜单中选择`清理并构建`即可
+ eclipse 需要先安装Maven 插件


###命令行生成示例

~~~~~~
cd /path/to/webitscript-mvc-demo
mvn clean install
~~~~~~

###运行示例
- 每个模块的实例将会在 `target` 文件夹下，打包为war文件，已经合并了共享的模板以及配置
- 可直接部署在Tomcat、jetty 等Web容器下




[![Bitdeli Badge](https://d2weczhvl823v0.cloudfront.net/zqq90/webitscript-mvc-demo/trend.png)](https://bitdeli.com/free "Bitdeli Badge")

