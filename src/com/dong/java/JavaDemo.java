package com.dong.java;

import java.util.ArrayList;
import java.util.List;

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


    public List<String> addList(String ...args){
        List<String> list = new ArrayList<>();
        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                list.add(args[i]);
            }
        }
        return list;
    }

}
