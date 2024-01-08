[toc]

### 1 介绍

#### 1.1 课程介绍

* 总时长：19个工作日

* 内容

  * SSM框架

    Git、Maven、Spring框架、Spring MVC框架、MyBatis框架、Lomok、Knife4j、统一响应结果返回、全局异常处理器、AOP、过滤器、拦截器......

  * Web前端

    `html、css、javascript`

#### 1.2 自我介绍

* 姓名：王伟超
* 邮箱：wangweichao@tedu.cn
* 微信：13603263409

### 2 Git&Gitee&GitHub

<font color=red>**Git是版本控制工具，Gitee和GitHub则是基于Git的代码托管仓库.**</font>

- Git

  Git：免费的、开源的分布式版本控制系统.

- Gitee

  开源中国推出的基于Git的代码托管服务[<font color=red>**国内,稳定速度快**</font>].

- GitHub

  开源的代码托管平台[<font color=red>**外网,不稳定**</font>]

### 3 Git常用命令

<font color=red>**注意：首次安装使用git时，需要设置用户签名。**</font>

```java
git config --user.name 用户名[自定义]
git config --user.email 用户邮箱[自定义]
```

#### 3.1 基础命令

* 初始化本地仓库：`git init`

* 查看仓库状态：`git status`

* 添加到暂存区：`git add 文件名`

* 提交到本地仓库：`git commit -m "提示消息" 文件名`

  <font color=red>**只有提交到本地仓库后，才会生成唯一的历史版本.**</font>

* 查看版本：`git reflog`
* 版本穿梭：`git reset --hard 版本号`

#### 3.2 分支命令

* 创建分支：`git branch 分支名`

* 查看分支：`git branch -v`

* 切换分支：`git checkout 分支名`

* 合并分支：`git merge 分支名`

  <font color=red>**合并分支之前，需要向切换到需要合并到的分支名.**</font>

* **合并冲突解决方法**

  * 第1步：`git merge 分支名`  出现合并冲突；

  * 第2步：手动调整合并冲突的代码；

  * 第3步：调整完成后，添加到暂存区，并提交到本地仓库；

    <font color=red>**注意 ：提交到本地仓库时，无需添加文件名，直接使用 git commit -m "提示消息" 即可.**</font>

#### 3.3 远程仓库命令

- 本地推送到远程：`git push 远程地址 分支`

- 克隆远程仓库：`git clone 远程地址`

- 本地拉取远程：`git pull 远程地址 分支`

  <font color=red>**操作本地代码前，一定要先拉取pull远程仓库的代码.**</font>

#### 3.4快捷操作命令

* 清屏：`Ctrl + l`
* 自动补全：`命令关键字 + Tab键`  <font color=red>**能使用自动补全的坚决杜绝手写！**</font>
* 查看文件内容：`cat 文件名`





















