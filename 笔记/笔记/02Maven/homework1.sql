# ### 作业2
# 1. 创建库 **egdb1** 并指定字符集为UTF8
DROP DATABASE IF EXISTS egdb1;
CREATE DATABASE egdb1 CHARSET = UTF8;
# 2. 查看所有的库
SHOW DATABASES;
# 3. 切换到库 **egdb1**
USE egdb1;
# 4. 在该库中创建数据表 **books** 并指定字符集为UTF8，字段类型和约束要求如下：
#
#    - 书籍编号id：整型，设置为主键并设置自增长属性
#    - 书籍名称bname：变长，宽度为50，不能为NULL
#    - 书籍作者author：变长，宽度为30，不能为NULL，设置默认值为 '佚名'
#    - 书籍出版社press：变长，宽度为128
#    - 书籍价格price：浮点型，总位数为7，小数位为2，不能为NULL，设置默认值为 0.00
#    - 书籍描述comment：text类型，不用指定宽度
CREATE TABLE IF NOT EXISTS books
(
    id      INT PRIMARY KEY AUTO_INCREMENT COMMENT '书籍编号',
    bname   VARCHAR(50)  NOT NULL COMMENT '书籍名称',
    author  VARCHAR(30)  NOT NULL DEFAULT '佚名' COMMENT '书籍作者',
    press   VARCHAR(128) COMMENT '出版社',
    price   DOUBLE(7, 2) NOT NULL DEFAULT 0.00 COMMENT '书籍价格',
    comment TEXT COMMENT '书籍描述'
) CHARSET = UTF8;
# 5. 查看表结构
DESC egdb1.books;
# 6. 在表中任意插入1条表记录；
INSERT INTO egdb1.books(bname, author, press, price, comment)
VALUES ('倚天屠龙记', '金庸', '清华大学出版社', 99.99, '这是一本武侠小说');
# 7. 查询所有表记录；
SELECT *
FROM egdb1.books;
# 8. 在表中批量插入表记录
INSERT INTO books(bname, author, press, price, comment)
VALUES ('边城', '沈从文', '机械工业出版社', 36, '小城故事多'),
       ('骆驼祥子', '老舍', '机械工业出版社', 43, '你是祥子么'),
       ('茶馆', '老舍', '中国文学出版社', 55, '老北京'),
       ('呐喊', '鲁迅', '人民教育出版社', 71, '最后的声音'),
       ('朝花夕拾', '鲁迅', '中国文学出版社', 53, '好时光'),
       ('围城', '钱钟书', '中国文学出版社', 44, '你心中的围城是什么');

INSERT INTO books(bname, author, press, price)
VALUES ('林家铺子', '茅盾', '机械工业出版社', 51),
       ('子夜', '茅盾', '人民教育出版社', 47);
SELECT * FROM egdb1.books;
# 9. SQL语句练习
# 1. 查找人民教育出版社出版的图书
SELECT bname,press FROM egdb1.books WHERE press='人民教育出版社';
# 2. 查找老舍写的，中国文学出版社出版的图书
SELECT bname,author,press FROM egdb1.books WHERE author='老舍' AND press='中国文学出版社';
# 3. 查找价格超过60元[**不包括60元**]的图书，只看书名和价格
SELECT bname,price FROM egdb1.books WHERE price>60;
# 4. 将呐喊的价格修改为45元
UPDATE egdb1.books SET price=45 WHERE bname='呐喊';
# 5. 增加一个字段出版时间，类型为 date ，放在价格字段price后面
ALTER TABLE egdb1.books ADD pub_time DATE AFTER price;
DESC egdb1.books;
# 6. 修改所有老舍的作品出版时间为 2018-10-01
UPDATE egdb1.books SET pub_time='2018-10-01' WHERE author='老舍';
# 7. 所有鲁迅的图书价格增加5元
UPDATE egdb1.books SET price=price+5 WHERE author='鲁迅';
# 8. 删除所有价格超过70元[**包含70元**]或者不到40元[**不包含40元**]的图书
DELETE FROM egdb1.books WHERE price>=70 OR price<40;
SELECT * FROM books;

# ========================作业3[选做] ===========================
# 1. 创建库 **egdb2**，指定字符集为UTF8
DROP DATABASE IF EXISTS egdb2;
CREATE DATABASE egdb2 CHARSET=UTF8;
# 2. 切换库
USE egdb2;
# 3. 创建表 **sanguo** 并指定字符集为UTF8，字段要求如下
#    - 英雄编号id：INT，主键自增长
#    - 英雄名称name：变长，字符宽度为30，不允许为空
#    - 性别gender：定长，字符宽度为1，不允许为空
#    - 国家country：定长，字符宽度为1，不允许为空
#    - 攻击力attack：INT，不允许为空
#    - 防御力defense：INT，不允许为空
CREATE TABLE IF NOT EXISTS sanguo(
    id INT PRIMARY KEY AUTO_INCREMENT COMMENT '英雄编号',
    name VARCHAR(30) NOT NULL COMMENT '英雄名称',
    gender CHAR(1) NOT NULL COMMENT '性别',
    country CHAR(1) NOT NULL COMMENT '国家',
    attack INT NOT NULL COMMENT '攻击力',
    defense INT NOT NULL COMMENT '防御力'
)CHARSET=UTF8;
# 4. 在表中插入数据
INSERT INTO sanguo
VALUES (1, '曹操', '男', '魏', 256, 63),
       (2, '张辽', '男', '魏', 328, 69),
       (3, '甄姬', '女', '魏', 168, 34),
       (4, '夏侯渊', '男', '魏', 366, 83),
       (5, '刘备', '男', '蜀', 220, 59),
       (6, '诸葛亮', '男', '蜀', 170, 54),
       (7, '赵云', '男', '蜀', 377, 66),
       (8, '张飞', '男', '蜀', 370, 80),
       (9, '孙尚香', '女', '蜀', 249, 62),
       (10, '大乔', '女', '吴', 190, 44),
       (11, '小乔', '女', '吴', 188, 39),
       (12, '周瑜', '男', '吴', 303, 60),
       (13, '吕蒙', '男', '吴', 330, 71);
SELECT * FROM sanguo;
# 5. **SQL练习**
# SELECT ...聚合函数
# FROM 表名
# WHERE 过滤条件
# GROUP BY 分组字段
# HAVING 过滤分组
# ORDER BY 排序字段
# LIMIT 分页;
# 1. 查找所有蜀国人信息，按照攻击力排名
SELECT name,country,attack FROM sanguo
WHERE country='蜀'
ORDER BY attack DESC;
# 2. 查找攻击力超过200[**包含200**]的魏国英雄名字和攻击力并显示为姓名， 攻击力
SELECT name,country,attack FROM sanguo
WHERE attack>=200 AND country='魏';
# 3. 所有英雄按照攻击力降序排序，如果相同则按照防御升序排序
SELECT name,attack,defense FROM sanguo
ORDER BY attack DESC,defense;
# 4. 查找名字为3个字符的数据
SELECT name FROM sanguo
WHERE name LIKE '___';
# 5. 找到魏国防御力排名2-3名的英雄
SELECT name,country,defense FROM sanguo
WHERE country='魏'
ORDER BY defense DESC
LIMIT 1,2;
# 6. 找出表中的最大攻击力的值？
SELECT MAX(attack) FROM sanguo;
# 7. 表中共有多少个英雄？
SELECT COUNT(*) FROM sanguo;
# 8. 蜀国英雄中攻击值大于200[**包含200**]的英雄的数量
SELECT COUNT(*) FROM sanguo
WHERE country='蜀' AND attack>=200;
# 9. 计算每个国家的平均攻击力
SELECT country,AVG(attack) FROM sanguo
GROUP BY country;
# 10. 统计每个国家男性英雄和女性英雄的平均攻击力
SELECT country,gender,AVG(attack) FROM sanguo
GROUP BY country,gender;
# 11. 所有国家的男英雄中 英雄数量最多的前2名的 国家名称及英雄数量
SELECT country, COUNT(*) total FROM sanguo
WHERE gender='男'
GROUP BY country
ORDER BY total DESC
LIMIT 2;
# 12. 统计平均攻击力大于250[**包含250**]的国家的英雄数量
SELECT country,COUNT(*) FROM sanguo
GROUP BY country
HAVING AVG(attack)>=250;






