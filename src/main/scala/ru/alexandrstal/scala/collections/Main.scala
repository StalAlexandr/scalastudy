package ru.alexandrstal.scala.collections

import scala.collection.mutable

object Main extends App{

  val map = Map("Russia"->"Putin", "USA"->"Trump")
  val map2 = Map("USSR"->"Lenin")




  var mutmap = mutable.Map[String,String]()

  mutmap++map

  mutmap++=map2
  val map3 =  Map.empty++ mutmap

  val wtf = ("France","Macron")

  mutmap.put("USA","Obama")


  println(wtf.getClass)

  mutmap+=wtf

  println(map)
  println(mutmap)
  println(map3)

}
