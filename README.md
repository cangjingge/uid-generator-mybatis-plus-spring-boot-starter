超简单使用百度uid生成器;
如果你的项目生态中使用的是mybatis-plus纯配置即可引入到项目中；
如果项目中使用的是其他数据库框架那么请使用
https://github.com/cangjingge/cangjingge/uid-generator-spring-boot-starter
自行实现一个接口即可完成集成
### 1.引入jar包

      
```
 <dependency>
            <groupId>com.chungkui</groupId>
          <artifactId>uid-generator-mybatis-plus-spring-boot-starter</artifactId>
          <version>1.0-bate</version>
        </dependency>
```

        
### 2.spring配置文件,启用配置

  `uid.enable=true  `  

### 3.数据库中创建表

```
DROP DATABASE IF EXISTS `xxxx`;
CREATE DATABASE `xxxx` ;
use `xxxx`;
DROP TABLE IF EXISTS WORKER_NODE;
CREATE TABLE WORKER_NODE
(
ID BIGINT NOT NULL AUTO_INCREMENT COMMENT 'auto increment id',
HOST_NAME VARCHAR(64) NOT NULL COMMENT 'host name',
PORT VARCHAR(64) NOT NULL COMMENT 'port',
TYPE INT NOT NULL COMMENT 'node type: ACTUAL or CONTAINER',
LAUNCH_DATE DATE NOT NULL COMMENT 'launch date',
MODIFIED TIMESTAMP NOT NULL COMMENT 'modified time',
CREATED TIMESTAMP NOT NULL COMMENT 'created time',
PRIMARY KEY(ID)
)
 COMMENT='DB WorkerID Assigner for UID Generator',ENGINE = INNODB;
```


### 4.开始使用


     
```
  @Autowired
  UidGenerator uidGenerator;
       
  uidGenerator.getUID()
```
