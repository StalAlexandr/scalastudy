package ru.alexandrstal.scala.cases

case class Person(name:String, age:Int) extends Ordered[Person]{
  override def compare(that: Person): Int = age-that.age
}
