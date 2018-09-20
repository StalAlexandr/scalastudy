package ru.alexandrstal.scala.functions

class ClosureSample (delta: Int){

  def add(x:Int):(Int)=>Int = {(y)=>y+x+delta}

  def add2(x:Int):(Int)=>(String)=>String = {(y)=>(str)=>str + x + y + delta}

  def add3(x:Int): Int =>Int = { (y)=>y+x+delta}


}

