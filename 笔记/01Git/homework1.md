[TOC]

### 1 理论及命令

#### 1.1 说明 git、gitee、GitHub 三者之间的关系

#### 1.2 写出如下`git`命令

- 初始化本地仓库：git init
- 查看状态：git status
- 添加到暂存区：git add 文件名
- 提交到本地仓库：git commit -m "xxx" 文件名
- 查看历史版本：git reflog
- 版本穿梭：git reset --hard 版本号
- 创建分支：git branch 分支名
- 查看分支：git branch -v
- 切换分支：git checkout 分支名
- 合并分支：git merge 分支名
- 本地仓库推送到远程仓库：git push 别名 分支
- 克隆远程仓库到本地：git clone 远程地址
- 拉取远程仓库代码到本地：git pull 远程库地址别名 远程分支名

### 2 操作题

#### 2.1 课上练习题

##### 2.1.1 练习1

1. D盘下创建目录 eggit1；
2. 在该目录下打开 `Git Bash` 并初始化本地仓库；
3. 创建文件 `eg1.txt` ，并任意输入内容；
4. 查看状态；
5. 将文件添加到暂存区并查看状态；
6. 提交到本地仓库；
7. 修改 `eg1.txt` 文件内容并查看状态；
8. 添加到暂存区并查看状态；
9. 提交到本地仓库。

```git

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit
$ git init
Initialized empty Git repository in D:/git练习题目/eggit/.git/

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit (master)
$ cat eg1.txt
可爱圆圆胖脸旁，小小叮当挂身上。
总会在我不知所措的时候给我帮忙。
Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit (master)
$ git status
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        eg1.txt

nothing added to commit but untracked files present (use "git add" to track)

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit (master)
$ git add eg1.txt

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit (master)
$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   eg1.txt


Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit (master)
$ git commit -m "x" eg1.txt
[master (root-commit) 0b46763] x
 1 file changed, 2 insertions(+)
 create mode 100644 eg1.txt

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit (master)
$ git status
On branch master
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   eg1.txt

no changes added to commit (use "git add" and/or "git commit -a")

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit (master)
$ git add eg1.txt

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit (master)
$ git status
On branch master
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        modified:   eg1.txt


Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit (master)
$ git commit -m "x" eg1.txt
[master 7bfcc00] x
 1 file changed, 2 insertions(+), 1 deletion(-)

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit (master)
$

```



##### 2.1.2 练习2

1. D盘下创建目录：`eggit2` ，并初始化仓库；
2. 创建文件 `eg2.txt` ，并查看状态；
3. 提交到暂存区并查看状态；
4. 提交到本地仓库并查看状态；
5. 修改文件内容并再次提交到暂存区和本地仓库；
6. 查看提交版本信息；
7. 穿梭到第一次提交的版本并查看文件内容确认；
8. 穿梭到第二次提交的版本并查看文件内容确认。

```

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit2
$ git init
Initialized empty Git repository in D:/git练习题目/eggit2/.git/

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit2 (master)
$ git add eg2.txt

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit2 (master)
$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   eg2.txt


Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit2 (master)
$ git commit -m "x" eg2.txt
[master (root-commit) 800c641] x
 1 file changed, 1 insertion(+)
 create mode 100644 eg2.txt

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit2 (master)
$ git add eg2.txt

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit2 (master)
$ git commit -m "x" eg2.txt
[master fccf768] x
 1 file changed, 2 insertions(+), 1 deletion(-)

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit2 (master)
$ git reflog
fccf768 (HEAD -> master) HEAD@{0}: commit: x
800c641 HEAD@{1}: commit (initial): x

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit2 (master)
$ git reset --hard 800c641
HEAD is now at 800c641 x

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit2 (master)
$ cat eg2.txt
你存在我深深的脑海里。
Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit2 (master)
$ git reset --hard fccf768
HEAD is now at fccf768 x

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit2 (master)
$ cat eg2.txt
你存在我深深的脑海里。
我的心里，我的梦里，我的歌声里。
Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit2 (master)
$

```



##### 2.1.3 练习3

1. D盘下创建目录：`eggit3` 并初始化仓库；
2. 创建文件 `eg3.txt` 并存入任意内容；
3. 添加到暂存区，并提交到本地仓库；
4. 创建新的分支 `feature-game` ，并查看分支；
5. 切换到分支 `feature-game` ，并修改文件内容【<font color=red>只允许在下面新添加内容，不允许修改原内容</font>】；
6. 添加到暂存区，并提交到本地仓库，查看内容；
7. 切换到分支 `master` ，并查看文件内容确认。
8. 将 `feature-game` 分支合并到 `master` 分支

```

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit3
$ git init
Initialized empty Git repository in D:/git练习题目/eggit3/.git/

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit3 (master)
$ git add eg3.txt

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit3 (master)
$ git commit -m "x" eg3.txt
[master (root-commit) 9eceb77] x
 1 file changed, 1 insertion(+)
 create mode 100644 eg3.txt

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit3 (master)
$ git branch feature-game

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit3 (master)
$ git checkout feature-game
Switched to branch 'feature-game'

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit3 (feature-game)
$ git add eg3.txt

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit3 (feature-game)
$ git commit -m "xx" eg3.txt
[feature-game 700a214] xx
 1 file changed, 2 insertions(+), 1 deletion(-)

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit3 (feature-game)
$ cat eg3.txt
我曾吹过你吹过的风这算不算相拥。
我曾走过你走过的路这算不算相逢。
Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit3 (feature-game)
$ git checkout master
Switched to branch 'master'

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit3 (master)
$ cat eg3.txt
我曾吹过你吹过的风这算不算相拥。
Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit3 (master)
$ git merge feature-game
Updating 9eceb77..700a214
Fast-forward
 eg3.txt | 3 ++-
 1 file changed, 2 insertions(+), 1 deletion(-)

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit3 (master)
$

```



##### 2.1.4 练习

1. D盘目录下创建目录：`eggit4` 并初始化本地仓库；
2. 创建文件 `eg4.txt`，输入内容：`abcdefg`，并添加到暂存区提交到本地仓库；
3. 创建分支 `hot-fix` ；
4. 修改 `master` 分支文件内容，在第二行添加内容 `master-666`；
5. 添加到暂存区并提交到本地仓库；
6. 切换到 `hot-fix` 分支，修改文件内容，在第二行添加 `hot-fix-888`；
7. 添加到暂存区并提交到本地仓库；
8. 切换到 `master` 分支，将 `hot-fix` 分支合并到 `master` 分支中；
9. 解决合并冲突。

```

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit4
$ git init
Initialized empty Git repository in D:/git练习题目/eggit4/.git/

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit4 (master)
$ git add eg4.txt

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit4 (master)
$ git commit -m "x" eg4.txt
[master (root-commit) b768315] x
 1 file changed, 1 insertion(+)
 create mode 100644 eg4.txt

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit4 (master)
$ git branch hot-fix

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit4 (master)
$ git add eg4.txt

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit4 (master)
$ git commit -m "xx" eg4.txt
[master 34e2cf7] xx
 1 file changed, 1 insertion(+)

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit4 (master)
$ git checkout hot-fix
Switched to branch 'hot-fix'

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit4 (hot-fix)
$ git add eg4.txt

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit4 (hot-fix)
$ git commit -m "xx" eg4.txt
[hot-fix e7e11a1] xx
 1 file changed, 1 insertion(+)

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit4 (hot-fix)
$ git checkout master
Switched to branch 'master'

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit4 (master)
$ git merge hot-fix
Auto-merging eg4.txt
CONFLICT (content): Merge conflict in eg4.txt
Automatic merge failed; fix conflicts and then commit the result.

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit4 (master|MERGING)
$ git add eg4.txt

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit4 (master|MERGING)
$ git commit -m "xxx" eg4.txt
fatal: cannot do a partial commit during a merge.
//注意该命令的错误。在解决分支冲突时，向本地库提交这一步时，不需要在次输入文件名


Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit4 (master|MERGING)
$ git commit -m "xxx"
[master 6d2c0be] xxx

Sakai@DESKTOP-T1E8HL0 MINGW64 /d/git练习题目/eggit4 (master)
$

```



##### 2.1.5 练习5

* 第1步：创建一个自己的远程仓库并设置开源，名字自定义；
* 第2步：将自己电脑中的工程 `jsd2311-ssm` 推送到自己的远程仓库中；
* 第3步【选做】：回到家后，使用另一台电脑将工程克隆到本地电脑。







