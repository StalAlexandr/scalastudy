package ru.alexandrstal.scala.functions

object PartFunction extends App{

  // метод принимает два параметра
  def some(x:String, y:String) = x+y
  println(some("a1", "b1"))

  // частично применяемая ф-я - принимает все параемтры без указания типа и работает
  val someA = some _
  println(someA("a", "b"))

  //не работает - требует указания типа 1-го аргумента
  // val partOfSome = some(_,"XXX")

  // а вот так работает!
  val partOfSome = some(_:String,"XXX")
  println(partOfSome("c"))


  // почему someB - ведет себя как функциональное значение без параметров возвращающее (x:String, y:String):String
  val someB = someA _
  println(someB()("x","y"))
}
