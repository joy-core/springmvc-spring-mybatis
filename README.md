# ssmdemo

一个小的spring+spring MVC+<u>Mybatis</u>例子



创建数据库表语句

```
CREATE TABLE `user_t` (

     `id` VARCHAR(50) NOT NULL,

     `user_name` VARCHAR(50) NOT NULL,

     `password` VARCHAR(50) NOT NULL,

     `age` VARCHAR(50) NULL DEFAULT NULL,

     PRIMARY KEY (`id`)

)

COMMENT='用户表'

COLLATE='utf8_general_ci'

ENGINE=InnoDB

;
```





插入数据

```
insert into user_t (id, user_name, password, age) values ('1', 
'张三', '1111', 25);

insert into user_t (id, user_name, password, age) values ('2', 
'李四', '2222', 26);

insert into user_t (id, user_name, password, age) values ('3', 
'王五', '3333', 27);

insert into user_t (id, user_name, password, age) values ('4', 
'马六', '4444', 28);
```



访问url：`http://localhost:8080/springmvc4mybatis3spring4/`

界面显示hello world



访问url：`http://localhost:8080/springmvc4mybatis3spring4/user/get.do?id=3`

界面显示查询3用户



可通过按钮进行用户查询