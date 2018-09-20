package ru.alexandrstal.scala.constructor

class TwoConstructors(val str:String) {

  println (str)

  def this(i:Int) = {
    this(i.toString)
    // require(i<0);
  }

  def getStr:String = {return str}

  override def toString: String = super.toString+" " + str
}
