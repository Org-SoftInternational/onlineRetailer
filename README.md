# onlineRetailer
# 电商项目

# lombok.jar部署
# jar下载位置：http://pan.baidu.com/s/1o8QLVSY  密钥：d5v1
# 将下面两行添加到Eclipse所在目录的eclipse.ini文件最后，并将下载的jar包放在eclipse.ini所在目录下
# -Xbootclasspath/a:lombok.jar
# -javaagent:lombok.jar

# 环境
# apache-tomcat-7.0.40(onlineRetailer/container) + mysql + Eclipse + jdk8
# Eclipse  http://pan.baidu.com/s/1mh6WXkc		h0qg
# mysql	   http://pan.baidu.com/s/1boVBKK3		r0jn
# jdk8	   http://pan.baidu.com/s/1bp4hHvD		04s5

# onlineRetailer-common  -- 以后写工具类的，比如加密
# onlineRetailer
# |--onlineRetailer-parent -- 管理依赖jar包的版本，全局，公司级别
# |--onlineRetailer-manage  -- 后台系统
# |--onlineRetailer-admin  -- 前台系统
# |--container  -- 存放容器
# |--document  -- 存放技术文档
# |--story  -- 存放需求分析
