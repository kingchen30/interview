![img](https://upload-images.jianshu.io/upload_images/1443947-bf3776592815de57.png?imageMogr2/auto-orient/strip|imageView2/2/w/1200)

typora官网截图

markdown是个好东西，用它写东西可以几乎不用考虑排版就可以得到还过得去的文章格式，作为学生党用来平时记东西很方便。简书的编辑器虽然好用，但对我来说有几个硬伤：

- 不支持数学公式的编辑；
- 无法导出为pdf或html等其他格式；
- 只能在线编辑。

因此我就需要一款本地编辑器，能支持数学公式的编辑，能导出为pdf。我目前主要使用的是mac，在网上搜索了几款mac下的markdown编辑器，最著名的就是 *Mou* 和 *MacDown* 了，试用了下，感觉预览窗口渲染的很慢，不知道是不是我电脑的原因，放弃之。还有几款收费的我就懒得找破解版了，而正版又买不起233333也就没有试用。各种百度，终于发现了**Typora**这一神器。

## 特性简介

Typora不止拥有上面提到的功能，还拥有很多其他优秀的特性。最最重要的是这么好用的编辑器居然是 *免费* 的，虽然是因为还是Beta版，现在已经更新到 *0.9.9.6* 版本了，正式版估计是要收费了，希望到时候能有一些老用户的优惠吧，so sad，，，

#### 所见即所得

Typora的设计理念就是极致简洁，简洁到什么程度呢？把其他编辑器的预览窗口都省了，而且同时还支持实时预览。打开一个新文件时：



![img](https://upload-images.jianshu.io/upload_images/1443947-61b836ff7b2d224c.png?imageMogr2/auto-orient/strip|imageView2/2/w/635)

新建文件

就只有一个窗口，编辑在该窗口，预览也是在该窗口，没有预览窗口如何做到实时预览呢？比如说，我现在需要添加一个标题，代码如下：

```bash

```

输入这行代码后，按下回车键或方向键中的下键，效果如下：



![img](https://upload-images.jianshu.io/upload_images/1443947-04d47f65815b0796.png?imageMogr2/auto-orient/strip|imageView2/2/w/635)

测试标题

------

#### 便捷的表格、代码、公式编辑

之所以把这三个放一块是因为他们都是区块元素，而且它们都可以使用快捷键插入。插入表格的快捷键在mac上是`command + T`,效果如下：



![img](https://upload-images.jianshu.io/upload_images/1443947-85add4ca9039f03a.png?imageMogr2/auto-orient/strip|imageView2/2/w/635)

插入表格

最上面可以选择行列数、没一列的对齐方式，并且支持在表格中使用`tab`键跳到下一单元格。

插入代码的语法和其他markdown并没有区别，同样支持行内代码和行间代码块，语法是相同的，只是在插入行间代码时可以选择快捷键`command + alt + c`和输入```后按回车两种方式，效果是一样的:



![img](https://upload-images.jianshu.io/upload_images/1443947-94da3613be1f7a51.png?imageMogr2/auto-orient/strip|imageView2/2/w/635)

插入代码块

右下角可以输入代码的语言，可以根据不同的语言自动高亮显示。

Typora支持Latex的公式编辑，公式编辑几乎和代码编辑的使用方法相同，同样分行内公式和行间公式，行内公式用两个`$`包裹起来，行间公式可以使用快捷键`command + alt + b`和`$$ + enter`插入：



![img](https://upload-images.jianshu.io/upload_images/1443947-11eaf67b30867a74.png?imageMogr2/auto-orient/strip|imageView2/2/w/635)

数学公式编辑

光标所在位置输入Latex的数学公式的语法，在Preview窗口会有实时预览效果，便于调整。

------

#### 图片拖拽

这个功能和简书的拖入图片即可插入图片功能是一样的，但是这个功能默认是关闭的需要在设置中手动开启，设置的路径为:

```undefined

```

在`Image Drag & Drop`后打上勾就可以了，如图所示：



![img](https://upload-images.jianshu.io/upload_images/1443947-921b510c3546863b.png?imageMogr2/auto-orient/strip|imageView2/2/w/491)

设置

该菜单中还有一些其他选项，我就不在一一介绍，自己可以根据自己的需要勾选。

------

#### 自定义主题

下载完成后默认会带有几套主题，我个人比较喜欢其中的`Github`和`newprint`：



![img](https://upload-images.jianshu.io/upload_images/1443947-829ca16319bbb07b.png?imageMogr2/auto-orient/strip|imageView2/2/w/1085)

官网截图

个人认为自带的主页已经比较好看了，如果认为不够好看可以使用css自定义。首先需要在help菜单勾选`Enable Debugging`:



![img](https://upload-images.jianshu.io/upload_images/1443947-ece5a5b4232565dd.png?imageMogr2/auto-orient/strip|imageView2/2/w/384)

help菜单

然后在编辑器的空白处单击右键，选择:



![img](https://upload-images.jianshu.io/upload_images/1443947-a584c6a71ff44c1d.png?imageMogr2/auto-orient/strip|imageView2/2/w/178)

Inspect Element



![img](https://upload-images.jianshu.io/upload_images/1443947-3fbc1a3238cb5a66.png?imageMogr2/auto-orient/strip|imageView2/2/w/1200)

Debug效果

------

#### 目录

在文章中使用`[TOC]`自动根据层级生成目录：



![img](https://upload-images.jianshu.io/upload_images/1443947-881682e88fef899f.png?imageMogr2/auto-orient/strip|imageView2/2/w/787)

自动生成效果

同时还支持在编辑时实时显示目录，开关快捷键为`command + shift + b`或窗口右上角的符号：



![img](https://upload-images.jianshu.io/upload_images/1443947-2b33f9d2bfa47405.png?imageMogr2/auto-orient/strip|imageView2/2/w/1200)

实时目录

------

#### 导出

Typora的导出选项提供了很多选项，有几个我都不知道是啥：





![img](https://upload-images.jianshu.io/upload_images/1443947-d77058eca50f0802.png?imageMogr2/auto-orient/strip|imageView2/2/w/221)

导出菜单

在横线以上的三个是默认支持导出的，这个导出没啥问题；横线以下的需要安装`Pandoc`来支持，我测试了一下，横线一下的几乎处于不可用状态，一选择就崩溃，可能这个功能还在开发中。导出的PDF的效果和编辑时看到的效果几乎没有差别：



![img](https://upload-images.jianshu.io/upload_images/1443947-fc2f19ee3fe200c9.png?imageMogr2/auto-orient/strip|imageView2/2/w/1083)

导出的pdf效果

我觉得可能是主题的原因，当我选择`newprint`主题时，上面的文章中有比较长的表格，在导出为PDF是就有无法正确处理换页问题，换成`Github`主题后就没问题了。