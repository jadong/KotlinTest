package com.dong.function

/**
 *
 * Created by zengwendong on 2017/5/26.
 */
class Cat(name: String = "Hello Kitty",color:String = "灰色") : Animal() {

    private val catName: String = name
    private val color:String = color

    fun getName():String = this.catName

    fun getColor():String = this.color

    /**
     * 简单声明方法,默认无返回值,它的类型是Unit,可省略
     */
    fun run() {
        val strings = listOf("第一", "第二", "第三")
        println("跑了 ${strings.first()}")
        println("------------------------------------")
    }

    fun eat(foodName:String){
        val numbers = setOf(11, 22, 33)
        val num = numbers.max()
        println("吃 $num 份 $foodName ")
        println("------------------------------------")
    }

    /**
     * 重写方法不允许指定默认值。。
     */
    override fun eat(foodName: String, foodName1: String) {
        val numbers = setOf(11, 22, 33)
        val num = numbers.max()
        println("吃 $num 份 $foodName 和 $foodName1")
        println("------------------------------------")
    }

    /**
     * 指定默认值。简化Java中多种重载方法的写法
     */
    fun fly(catName: String = "Hello Kitty", changeName: String = "飞天猫", addr: String = "珠穆朗玛峰") {
        println("$catName 变身 $changeName 从 $addr 飞下")
        println("------------------------------------")
    }

    fun sing(){
        println("唱了一首离歌")
    }

    //componentN()函数需要标记为 operator , 才可以在解构声明中使用
    //componentN()函数的返回值类型必须与属性类型一致
    operator fun component1(): String {
        return this.catName
    }

    operator fun  component2(): String {
        return this.color
    }

    override fun toString(): String {
        return "Cat(catName='$catName', color='$color')"
    }


}

