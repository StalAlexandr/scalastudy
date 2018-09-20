package ru.alexandrstal.scala.collections

object Ordung extends App {

  val ts = scala.collection.mutable.TreeSet[String]() ++ List("aa", "11")
  ts ++= List("bb")
  println(ts)

  val set = Set(2, 4, 5, 1, 88, -5)

  val ss = collection.immutable.SortedSet[Int]() ++ set

  println(set.getClass)
  println(ss.getClass)
  println(ss)


  val list = List(2, 4, 5, 1, 88, -5)

  val list2 =  list.sortWith((x,y)=>y<x)
  println(list2)

  val str = "myString"
  println (str.reverse)

  println (str.toList.exists(x=>x.isUpper))

  println (str.toList.filter(x=>x.isLower).mkString(""))

  println (str.toList.sortWith((x,y)=>x<y).mkString(""))


}
