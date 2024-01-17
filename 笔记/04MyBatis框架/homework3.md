[TOC]

### 作业1

#### 1 数据表

##### 1.1 客户信息表

创建客户信息表 `customers`，包含字段如下表所示，并插入数据

| 字段名称      | 中文名称 | 类型                           | 长度  | 备注 |
|-----------|------|------------------------------|-----|----|
| cust_id   | 客户编号 | <font color=red>字符串类型</font> | 32  | 主键 |
| cust_tel  | 电话号码 | 字符串类型                        | 11  |    |
| cust_name | 客户姓名 | 字符串类型                        | 64  |    |
| address   | 送货地址 | 字符串类型                        | 128 |    |

##### 1.2 订单表

创建订单表(`user_orders`)，包含字段如下所示，并插入数据

| 字段名称         | 中文名称 | 类型                           | 长度 | 备注            |
|--------------|------|------------------------------|----|---------------|
| order_id     | 订单编号 | <font color=red>字符串类型</font> | 32 | 主键            |
| cust_id      | 客户编号 | 字符串类型                        | 32 |               |
| order_date   | 下单时间 | 日期时间类型                       |    |               |
| status       | 订单状态 | <font color=red>字符串类型</font> | 10 |               |
| products_num | 商品数量 | 整数类型                         |    |               |
| amt          | 订单金额 | 浮点数                          |    | 总位数10位,保留2位小数 |

#### 2 数据说明

* <font color=red>**SQL脚本:03MyBatis顾客订单大练习.sql**</font>

* 库名：`mybatisdb`
* 表名：`customers` 和 `user_orders`

#### 3 工程说明

* 要求1：工程 <font color=red>**egmybatis数字**</font> （<font color=blue>注意SpringBoot版本和添加依赖</font>）

* 要求2：使用 <font color=red>**xml配置文件**</font> 方式管理数据库

    * 第1题：在客户信息表中插入一条数据：`'0004', '13811112222', 'Tony', '成都'`

    * 第2题：在订单表中插入一条数据：`'202301020004', '0004', new Date(), '3', 4, 800.88`

    * <font color=red>**第3题：使用resultMap查询指定客户成交的订单信息，结果放到：OrderListVO
      中，需要显示：顾客id、顾客姓名、订单集合 `List<UserOrders>`**</font>

    * 第4题：<font color=red>**使用resultMap**</font>根据客户编号查询某个客户的 **姓名和电话**，结果：`CustomersVO1`

    * 第5题：<font color=red>**使用resultMap**</font>查询指定城市的客户的 **姓名和地址**，结果集放到 List集合 中，

      ​ 比如查询北京的客户信息：`CustomersVO2`

    * 第6题：根据订单编号动态删除订单信息，使用 **List集合方式**

    * 第7题：动态修改订单信息；













