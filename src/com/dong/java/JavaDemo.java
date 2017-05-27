package com.dong.java;

/**
 * Created by zengwendong on 2017/5/27.
 */
public class JavaDemo {

    public void function(){
        function("Java");
    }

    public void function(String name){
        function(name,"男");
    }

    public void function(String name,String sex){
        System.out.printf("name--%s,sex--%s",name,sex);
    }

}
