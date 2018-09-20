package ru.alexandrstal.scala.traits

class Thin{
  def on="on"
  def off="off"
}

trait Rich{
  def on:String
  def off:String
  def mix=on + off + on
}

trait SuperRich{
  def on:String
  def off:String
  def mix="!!!!!!! " + on + off + on
}

object ExtInterface extends App{
  val c = new Thin with Rich
  println(c.mix)

  val c2 = new Thin with SuperRich
  println(c2.mix)
}
