package ru.alexandrstal.scala.traits

abstract class ASome{
  def ppp
}


class Some extends ASome {
  def ppp = println("Some")
}

trait Exec extends ASome{
abstract override def ppp = {super.ppp; println("exec")}
}

trait Exec2 extends ASome{
  abstract override def ppp = {super.ppp; println("exec2")}
}


object Decorator  extends App{

  val s = new Some with Exec with Exec2
 println(s.ppp)
}
