
---

简历要求：http://b.codekk.com/detail/Trinea/%E4%B8%80%E5%A4%A7%E5%8D%8A%E4%BB%A5%E4%B8%8A%E7%AE%80%E5%8E%86%E9%83%BD%E6%98%AF%E4%B8%8D%E5%90%88%E6%A0%BC%E7%9A%84

简历模板：http://j.codekk.com/blogs/detail/5705bcdf4a38205862ef476f

---

## 技能点
- 良好的Java语言基础，良好编程风格，熟悉面向对象编程思想。
- 熟悉Android应用框架的设计。
- 掌握Kotlin语言的语法并可以在项目中熟练的应用，并且能良好的在以Java为主开发语言的项目中使用Kotlin语言进行某些模块的开发。
- 熟练掌握常用的设计模式，如单利设计模式，观察者模式，建造者模式，工厂模式，状态模式等。
- 熟练掌握Android事件分发机制，View的绘制流程，自定义控件和动画。
- 能够熟练运用Android中的数据存储框架，如Android组件架构中的Room，GreenDao，OrmLite等ORM型数据库框架。
- 熟练运用Android官方组件架构中的ViewModel，LiveData，LifeCycle等生命周期组件，还有分页加载组件Paging。
- 熟练应用依赖注入框架Dagger2，降低项目的耦合度，达到模块的解耦。
- 熟练应用网络请求框架Okhttp,Retrofit，并对其进行二次封装。
- 熟练运用第三方图片加载框架，Picasso，Glide，Fresco，ImageLoader，Volley。
- 熟悉AndroidBLE低功耗蓝牙的开发。
- 熟练使用调优工具，如SysTrace、Hierarchy Viewer、LeakCanary对项目进行优化。
- 熟悉AndroidBLE蓝牙开发。

# 公司项目

## 西游单车（2016-12-至今）

### 项目简介
西游单车是由西游骑物（上海）网络技术有限公司研发的互联网租赁出行解决方案，是有桩借还车模式的智能电助力单车。用户通过智能手机就能快速租用和归还一辆西游单车，用非常经济的价格来轻松的完成一次1-15公里的城市出行，缓解和改善城市交通拥堵的状况，为城市居民和政府企业员工出行提供一种更加轻松、便捷、经济、环保出行方式。
#### 框架介绍：
西游单车App的整个项目架构采用的是MVP的设计架构，UI数据和业务逻辑分离，并对其进行了抽象和封装，代码层次分明，
项目也封装了一些公共的组件，比如常用的控件和弹框以及一些工具类库，
对MVP架构的基类的封装，以便项目的快速快发。
数据存储采用的是OrmLite+SharePreference，并对其进行了二次封装，
网络请求和图片加载框架使用的是lite-http+Picasso。
整体UI框架是DrawerLayout+Activity+Fragment。

### 项目职责
1. 前期移动端App的需求制订和评审。
2. 移动端某些UI页面的设计和交互逻辑的设计和评审。
3. 制定一些开发规范，比如控件的样式，字体大小，间距，图片资源的命名规则。
4. 参与一些后台接口的设计和评审。
5. Android移动端故障上报，意见反馈，分享，认证等模块的实现。
6. 编写和维护一些与硬件调试相关的工具，与硬件调试蓝牙交互的数据。
7. 协同测试人员测试，修改项目bug，完善项目。
8. 维护Android移动端的稳定和版本迭代。


### 项目模块
##### 1. 用户模块
- 实名认证。
- 订单详情。
- 押金和余额。
- 好友邀请。
- 骑行红包。

##### 2. 蓝牙模块
- 扫描蓝牙。
- 与蓝牙交互，获取电量，开锁，关锁。
##### 3. 故障模块
- 扫到故障车故障上报。
- 骑中遇到问题故障上报。
- 用户反馈问题上报。
## 蓝牙调试工具&电池锁开锁工具&cyouAdmin
### 项目简介
1. 蓝牙调试工具是一个未上线的，公司内部用于和硬件进行联调的Android端小工具，主要的目的是方便前期和硬件联调蓝牙通讯；
App就不用在蓝牙这个模块进行重复的联调测试了，直接接入小工具的内部逻辑即可，缩短了客户端开发的周期，
同时小工具还可以对蓝牙的一些异常数据进行统计。另一方面小工具也可以用于检验自行车厂商生产线上生产的车是否满足
投放市场的条件。
2. 电池锁开锁工具是方便线下运维人员方便把电池换点。
3. cyouAdmin是一个用户授权工具，后期由于业务的扩展和调整，公司和苏州西山旅游景区的民俗商家达成合作，为一些游客提供定制化服务，
需要一个用户开多辆车，通过这个工具授权后就可以实现一个用户开多辆车的需求。
### 项目职责
1. 需求的调研，统计，可行性分析。
2. UI界面的设计和交互逻辑。
3. 参与设计一些蓝牙数据的交互规则和数据交互格式。
4. 维护和优化各个工具类。
### 项目模块
#####  蓝牙模块
- 扫描蓝牙。
- 与蓝牙交互，获取电量，开锁，关锁，GPS信息，GSM信息，版本号，开关锁等。


# 个人项目
## Live
### 项目简介
Live是一个仿斗鱼Tv的项目。利用工作之余和周末等闲暇时间写的一个练手App。
- [扫码下载地址]( https://fir.im/7qgz)
#### 项目架构
项目的整体结构采用的是MVP分层架构，MVP是目前Android开发中比较流行的开发架构模式。
数据存储层Repository采用的是GreenDao，并对其进行了二次封装.
网络请求和图片加载框架使用的是OkHttp+Picasso。
整体UI结构是BottomNavigationView+ViewPager+Fragment的结构，并实现了Fragment的懒加载机制。
#### 项目职责
1. 项目的整体MVP框架的搭建。
2. 网络请求和图片加载框架的封装。
3. UI页面的设计和逻辑交互。
4. 项目中的工具类的编写。
5. 数据存储层的封装。
6. 视频库Vitamio的集成
7. 三方弹幕库的集成。
8. 降低Crash的概率并对项目进行优化。
9. 二维码扫描的集成。

### 项目模块
#### 1.首页
- 首页包括五大模块：推荐，手游，娱乐，游戏，趣玩，主要展示一些模块的最热门视频
#### 2.直播
- 直播模块的分类主要由后台返回，包括很多直播信息的展示
#### 3.视频
- 视频模块的分类主要由后台返回，包括很多视频分类信息的展示
#### 4.关注
- 关注模块展示的是用户曾经关注过的视频信息
#### 5.我的
- 一些与用户有关的的操作，比如登录，注册，历史记录，任务，账户信息等，由于没有接口，只是一个UI界面的展示。

## ShopMall
###  项目简介
比幕商城是一款用kotlin语言写的以Bmob第三方后端云的基于MVP框架模式的商城项目，还用到了讯飞的语音交互SDK，
独立开发且开发周期为两个月，由于时间有限，其中可能有些UI交互不是建善尽美，存在一些瑕疵；
后续在空闲的时候会进行合理的优化。
- [APK下载链接](https://fir.im/8t1r)
#### 项目职责
1. 数据库使用的是google官方架构指南中的room组件，这是一款ORM关系型的数据库，抽象了SQLite的使用,它作为Android的亲儿子orm，并且原生支持LiveData和Rxjava嵌套使用.
2. 图片加载框架使用的是Glide
3. 在分类模块中使用了Google官方架构指南的另外两款组件，ViewModel和LiveData，VM是一个可以可感知应用生命周期的组件，在应用横竖屏切换的时候可以很好的保存数据，LiveData是一个可观测数据变化的组件，一旦数据发生变化就会通知UI界面来刷新数据。
4. 权限框架使用的是Google官方出品的Easypermissions库，并在对其进行了二封装。
5. 二维码扫描使用的是基于Googlez的zxing封装的bga-qrcode-zxing，可实现定制化的扫码界面，支持二维码和条形码的扫码秒。
6. 事件传递用的EventBus

### 项目模块
#### 1.首页
- 首页主要展示一些有打折信息和商家推荐类的产品，轮播图轮播展示一些最新的信息。
- 用户不仅可以用通过语音搜索想要的商品还可以通过扫描二维码来搜索自己想要的商品，由于搜索功能Bmob后端并未提供，所以实现
#### 2.分类
-  分类页面主要是把不同的产品分门别类了，左边是大概的分类项，右边则是该分类下面的详细分类。
- 该页面也支持语音搜索和二维码的识别搜索。
#### 3.发现
- 发现页面主要是用户对已买过的商品的晒图和评价，点击可以进入该商品所在的商店，展现更详细的信息。
#### 4.购物车
- 购物车主要展现用户放入购物车里面的商品和选中商品的价格
#### 5.我的
- 我的页面主要是一些和用户有关的一些造作；如登录，修改用户信息，添加地址，用户的订单，关注的商店，卡卷，收藏，客服等信息。
### 项目技术总结
#### 架构
  项目的整体结构采用的是MVP分层架构，MVP是目前Android开发中比较流行的开发架构模式它具有一下优缺点
##### 优点：
1. 降低耦合度，实现了Model和View真正的完全分离，可以修改View而不影响Modle。
2. 模块职责划分明显，层次清晰。
3.  Presenter可以复用，一个Presenter可以用于多个View，而不需要更改Presenter的逻辑（当然是在View的改动不影响业务逻辑的前提下）。
4.  View可以进行组件化。在MVP当中，View不依赖Model。这样就可以让View从特定的业务场景中脱离出来，可以说View可以做到对业务完全无知。它只需要提供一系列接口提供给上层操作。这样就可以做到高度可复用的View组件。
5.  代码灵活性高，在要替换网络请求框架的时候，不需要对P&V层进行任何的变动。
##### 缺点
1. 增加了许多的接口和Model和Presenter文件。
2. Presenter中除了应用逻辑以外，还持有大量的View&Model的引用。
3. Presenter比较笨重，因为P层持有了V层的引用，如果处理不好的话在Activty/fragment被系统回收的时候容易导致内存泄漏。维护起来会比较困难。

#### 测试账号
测试账号  | 密码
---|---
俊俊俊|123
俊俊俊1|123
俊俊俊2|123


----------------------------