package ru.alexandrstal.scala.functions


class WithFunc{
  def some(i:Int):((String,String)=>String)= {(x,y)=>"some " + x + y + i}


  def getS(s:((String,String)=>String),s1:String, s2:String)=s(s1,s2)

}

object FuncFirstClass extends App {
  val myFunc = new WithFunc some(5)
  val someResult = myFunc("sss", "world")
  val withFunc =  new WithFunc;

  println (withFunc.getS(myFunc,"AAA","BBBB"))

  println (withFunc.getS(_+_,"CCC","DDD"))  //proxy

  println (myFunc("hello", "world"))

  val s_ = 5
  val _d = 5
  val proxyf = (1, 0)
  println(proxyf)
  println(someResult)
  println(myFunc)
  println(s_)
  println(_d)

 // println(partOfSome)

  val ss = myFunc(_:String, "aa")

  println (ss("aaa"))

}


