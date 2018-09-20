package ru.alexandrstal.scala.traits

class Zero {
  def aaa()= "aaa"
  def speak()=aaa()
}

/*
trait A extends Zero {

  override def speak()="A " + toString
}

trait B extends  Zero {override def speak()="B" }
*/

trait A1 extends Zero{
  override def aaa():String="a1"
}


object TestTraits extends App{

  val p = new Zero with A1
  println(p.speak())
  println(p.isInstanceOf[A1])
}
