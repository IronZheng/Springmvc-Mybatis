# Springmvc-Mybatis
通过搭建springmvc和mybaits，完成一个web项目的基础学习
利用maven，将spring mvc和mybatis所需依赖的jar包导入。然后按照mvc的目录结构创建文件夹。

src
├─ main …………………………………………主目录

│  ├─ java  ……………………………………核心代码

│  │  ├─ com                            核心代码文件

│  │  ├─ test                             测试模块

│  ├─resources

│  │  │ ………………………………………… 资源文件

│  ├─webapp

│  │  │ ………………………………………… 页面和WEB-INF
## 需要在spring中添加注解驱动的Spring MVC功能，注册请求url和注解POJO类方法的映射.
启动包扫描功能，以便注册带有@Controller、@service、@repository、@Component等注解的类成为spring的bean 
