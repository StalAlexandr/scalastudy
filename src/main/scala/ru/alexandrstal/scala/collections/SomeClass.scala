package ru.alexandrstal.scala.collections

class SomeClass {
  private[this] var h = 12

  var m = 3

  def hour:Int = h
  def hour_= (x:Int)={println("in setter " + x); h=x}

}

class AnotherClass{

  def func(): Unit ={
    val sc = new SomeClass
    sc.hour = 3
    val d = sc.hour + sc.m
  }

}

object Hi extends App{
  val ac = new AnotherClass
  ac.func
}