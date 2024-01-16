[toc]

### 作业1

#### 1 工程环境搭建

创建工程 `egmvc1`，注意勾选依赖 `Spring Web`

#### 2 完成控制器方法及测试

##### 2.1 添加用户-接口说明

用户将：用户名、密码、昵称 数据传递给服务端，服务端处理请求。

* 请求地址：/v1/users/insert
* 请求方法：POST
* 请求体数据：用户名username、密码password、昵称nickname【服务端终端打印】
* 返回响应：String "添加用户成功"

##### 2.2 用户列表-接口说明

* 请求地址：`/v1/users/userList`
* 请求方法：GET
* 查询参数：无
* 返回响应：String "查询用户列表成功"

##### 2.3 删除用户-接口说明

* 请求地址：/v1/users/delete
* 请求方法：GET
* 查询参数：用户id
* 返回响应：String "删除成功，用户id为：数字"

##### 2.4 更新用户-接口说明

* 请求地址：/v1/users/update
* 请求方法：POST
* 请求体数据：用户id、用户名username、密码password、昵称nickname 【终端打印数据】
* 返回响应：String "更新成功"













