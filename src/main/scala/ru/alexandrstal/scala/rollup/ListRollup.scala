package ru.alexandrstal.scala.rollup

object ListRollup extends App{

  def o(x:Int,y:Int)=x+y

  val op = o _

  val op2 = (x:Int, y:Int)=>x+y


  val xs:List[Int] = List(1,2,3)

  println((0/:xs)(op))

  println((0/:xs)((x:Int,y:Int)=>x+y))

 // val op = (x:Int, y:Int)=>x+y


   def listToSmth(xs:List[Int], op:(Int,Int)=>Int) = {
     val op3 = o _

      val r:Int = (0/:xs)(op3)
     r
   }

 println(listToSmth(xs,op2))


}
