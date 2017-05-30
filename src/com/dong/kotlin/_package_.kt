package com.dong.function

/**
 *
 * Kotlin中的函数
 *
 * 1.函数的定义：函数的基本组成部分包括：名称、参数、返回值和函数体，其使用fun关键字定义函数
 *       ---指定默认参数。类似Java中方法重载
 *       ---不固定数数量参数，其实就是同一类型的数组参数。
 *       ---简化函数定义，单表达式时可以简写
 *       ---可见性修饰符： public private internal

 *
 * 2.函数的使用：
 *     ---调用函数时，可以通过参数名来指定参数，当函数参数很多，或者存在默认参数时，指定参数名是一种非常便利的功能。
 *     ---中缀标记法调用函数，需满足一定条件：成员函数或扩展函数；只有单个参数；使用infix关键字标记。
 *
 * 3.重写函数
 *     ---重写方法不允许指定默认值
 *
 * 4.成员函数
 *
 * 5.局部函数
 *
 * 6.扩展函数
 *   ----扩展函数是静态解析，不是由动态类型决定
 *   ----当类与扩展类的函数名称一致时，成员函数优先于扩展函数，见扩展函数 run
 *   ----当派发接受者与扩展接受者的成员名称一致时，扩展接受者的成员函数被优先使用，见 Bird中catAndBird函数
 *
 * 7.高阶函数
 *      ---一种特殊的函数， 它接受函数作为参数， 或者返回一个函数。见Other
 *      ---对于接受另一个函数作为参数的函数，我们必须为该参数指定函数类型
 *
 * 8.尾递归函数
 *   ---要符合 tailrec 修饰符的要求，函数必须在它执行的所有操作的最后一步，递归调用它自身
 *   ---如果递归调用后还有其他逻辑代码，不能使用尾递归
 *   ---尾递归不能用在try/catch/finally 结构内
 *   ---尾递归目前只能用在JVM环境内
 *
 *   满足尾递归的函数式编程方式的形式时，编译器就会对代码进行优化， 消除函数的递归调用， 产生一段基于循环实现的，快速而且高效的代码
 *
 * 9.解构：将一个对象解构为多个变量
 *  ---声明了多个变量，将对象的属性赋值给相应的变量
 *  ---被解构类需要自定义componentN()函数，并且需要operator标记
 *  ---componentN()函数的返回值类型必须与属性类型一致
 */