package com

/**
  * Created by wangyong on 2016/6/12.
  */
object Console {
  def main(args: Array[String]): Unit = {
    //println("hello scala...");


    //var num: Int = add(3, 2);
    //print(num);
    // judge(num = -1);
    //circle();
    array();
  }

  /**
    * 默认无返回值-->unit类型
    *
    * @param a
    * @param b
    */
  /* def add(a: Int, b: Int) {
     print(a + b);
   }*/


  /**
    * 定义返回值的函数，有返回值的函数必须满足两个条件
    * 1. ()和{}之间必须与等号
    * 2. 返回值的变量放在最后一行，scala默认返回最后一行的值
    * 3. 如果返回值类型强制指定为unit，返回值就是unit
    *
    * @param b
    * @param a
    * @return
    */
  def add(b: Int, a: Int) = {
    a + b;
  }

  /**
    * if控制结构
    *
    * @param num
    */
  def judge(num: Int): Unit = {
    if (num > 0) {
      print(0);
    }
    else {
      print(1);
    }
  }

  /**
    * 循环
    */
  def circle(): Unit = {
    /*while(true){
        .....
    }*/

    //闭区间
    /*  for (i <- 1 to 10) {
        println(i);
      }
  */
    //开区间
    /* for (i <- 1 until 10) {
       println(i);

     }*/

    //倒序
    /* for (i <- 1 to 10 reverse) {
       println(i);
     }*/

    //遍历字符
    /* for (i <- "hello,scala") {
       println(i);
     }*/

    //改变步长
    /*  for (i <- 0 to 10 if i % 2 == 0) {
        println(i);
      }*/

    /*  for (i <- 1 to(10, 2)) {
        println(i);
      }*/

    //for 推导式
    /*    var c = for(i <-1 to 10) yield {i+1}
        print(c);*/

    //双重for循环
    for (i <- 1 to 10; j <- 1 to 5) {
      println(i + ">>" + j);
    }

  }

  /**
    * 数组
    */
  def array(): Unit = {
    /*   var array = new Array[Int](5);
       array(0) = 1;*/
    // var array = Array(1,2,3,4,5,"hello");
    var array = Array(1, 2, 3, 4, 5);
    /* for (i <- array){
       println(i);
     }*/
    println("max:" + array.max);
    println("min" + array.min);
    println("sum" + array.sum);
    println(array.mkString(","));

  }

}