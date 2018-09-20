package ru.alexandrstal.esimulator

class BasicSimulator extends ESimulator {

  class Wire{
    private var signal = false;
    private var actions:List[Action] = List()

    def getSignal:Boolean = signal

    def addAction(a:Action):Unit = {
      println ("A actions count " + actions.length)
      actions = a::actions
    //  println ("B actions count " + actions.length)
      a()
    }

    def setSignal(s:Boolean): Unit ={
      if (s!=signal){
        signal = s
        actions foreach(x=>x())
      }
    }
  }

  def probe(name:String, wire:Wire) = {
    def probeAction() = {
      println ("wire " + name + " time " + currentTime + " signal " + wire.getSignal)
    }
    wire addAction probeAction
  }

  def inverter(input:Wire, output:Wire): Unit ={
     def invertAction() = {
       val inputSignal = input.getSignal
       afterDelay(2){
         output setSignal !inputSignal
       }
     }
    input addAction invertAction

  }

  def simulate(): Unit = {

    val in, out,last, last2 = new Wire()
  //  in.setSignal(true)

    in.setSignal(true)
    inverter(in, out)
    inverter(out, in)

    in.setSignal(false)
    // inverter(out, in)

    //   inverter(last, last2)

//    probe("in", in)
//    probe("out", out)
   // probe("last", last)
   // probe("last2", last2)
    run()
  }

}


object Launcher extends App{

  val bs = new BasicSimulator
  bs.simulate()

}
