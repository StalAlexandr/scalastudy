package ru.alexandrstal.scala.constructor

object SampleConstructors extends App{


  val omc = new OneMainConstructor("aaa");

  println(omc getStr)


  val tc = new TwoConstructors(56);
  println(tc getStr)
  println(tc)

  val applyMethod = new ApplyMethod;
  print(applyMethod(7));


 // val ac = new  AmbiguousConstructor(45);
}
