package com.dong.function

import com.dong.kotlin.Bird
import com.dong.kotlin.Util
import com.dong.kotlin.calc


/**
 *
 * Created by zengwendong on 2017/5/22.
 */
fun main(args: Array<String>) {


    val cat = Cat()

    //cat.run()

    //cat.eat("老鼠")

    //cat.eat("老鼠","老鼠毛")

    //可以指定参数名赋值,
    //调用Java函数时不能使用命名参数语法，因为Java字节码中不保留函数参数的名称
    //cat.eat(foodName1 = "老鼠", foodName = "老鼠毛")

    //方法重载
    //cat.fly()
    //cat.fly("波斯猫")
    //cat.fly("波斯猫","猫头鹰")
    //cat.fly(addr = "喜马拉雅山")

    val util = Util()
    //简化方法。。
    println("生了${util.add(5)}只猫")

    //中缀标记法使用
    util move 5
    1 shl 5

    //调用可变数量参数的函数
    val arr = arrayOf(Cat("白猫"), Cat("黑猫"))
    util.addCats(Cat("大猫"), *arr, Cat("小猫"), name = "猫头鹰")

    //局部函数
    util.exec("命令")

    //扩展函数--1
    util.calc(5,5)

    //扩展函数--2 当父子类有同一个扩展函数时，由声明的类型决定
    util.execJump(cat)

    // 扩展函数--3 当类与扩展类的函数名称一致时，成员函数优先于扩展函数
    cat.run()

    // 扩展函数--4 扩展接受者的成员函数被优先使用
    val bird = Bird()
    bird.start(cat)

    //

}