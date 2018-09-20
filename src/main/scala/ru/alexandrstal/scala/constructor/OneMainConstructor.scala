package ru.alexandrstal.scala.constructor



class OneMainConstructor(val str:String) {

  implicit def intToOneMainConstructor(i:Int):OneMainConstructor = {new OneMainConstructor("")};


  println(str);

  def getStr:String = {return str}


}
