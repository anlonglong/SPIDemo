**Shader**
- 中文意思:着色器，是图形领域里的一种概念，用于设置绘制颜色，他和直接设置颜色的区别是，着色器设置的是一种着色方案，
或是一套规则，当设置了 Shader 之后，Paint 在绘制图形和文字时就不使用  setColor/ARGB() 设置的颜色了，而是使用 Shader 的方案中的颜色。

**setXfermode(Xfermode xfermode)**
- "Xfermode" 其实就是 "Transfer mode"，用 "X" 来代替 "Trans" 是一些美国人喜欢用的简写方式。严谨地讲， Xfermode 指的是你要绘制的内容和 Canvas 的目标位置的内容应该怎样结合计算出最终的颜色。但通俗地说，其实就是要你以绘制的内容作为源图像，以 View 中已有的内容作为目标图像，选取一个  PorterDuff.Mode 作为绘制内容的颜色处理方案
- Android中文字的绘制底层其实都是把要绘制的文字转换成图片来绘制的。