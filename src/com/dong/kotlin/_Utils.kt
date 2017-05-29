package com.dong.kotlin

import com.dong.function.Animal
import com.dong.function.Cat

/**
 * 扩展函数
 * Created by dong on 2017/5/29.
 */
fun Util.calc(a:Int,b:Int){
    val num = this.add(a+b)
    println("计算结果为：$num")
}

fun Cat.jump(){
    println("猫跳了100米")
}

fun Animal.jump(){
    println("动物跳50米")
}

fun Cat.run(){
    val strings = listOf("第一", "第二", "第三")
    println("假跑了 ${strings.first()}")
    println("------------------------------------")
}
