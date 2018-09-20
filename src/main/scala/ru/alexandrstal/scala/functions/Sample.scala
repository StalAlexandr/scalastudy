package ru.alexandrstal.scala.functions

object Sample extends App{

  val v = new ClosureSample(100)

  val f = v.add(5);
  println(f(7));


  val f2 = v.add2(5);
  val f3 = f2(7);

  println(f3("hello"));

}
