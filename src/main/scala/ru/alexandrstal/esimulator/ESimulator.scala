package ru.alexandrstal.esimulator


class ESimulator {

  type Action = ()=>Unit

  case class Job(time:Int, action:Action){}

  private var curtime=0
  var agenda:List[Job] = List()

  def currentTime = curtime


  def afterDelay(delay:Int)(block: =>Unit): Unit ={

    println("afterDelay agenda count "+ agenda.length)
    val job = Job(curtime+delay, ()=>block)
    agenda = insert(agenda, job)
  }

  private def insert(jobs:List[Job], job:Job):List[Job]={
    if (jobs.isEmpty ||job.time<jobs.head.time){
      job::jobs
    }else
      jobs.head::insert(jobs.tail,job)
  }

  private def next(): Unit = {
    println("next!! " + curtime )
    (agenda: @unchecked) match{
      case job::rest => agenda = rest; {
        curtime = job.time
        job.action()
      }
    }
  }

  def run(): Unit ={
    println("run agenda count "+ agenda.length)
    // afterDelay(0)  {println("agenda count "+ agenda.length)}
    while (agenda.nonEmpty) next()
  }
}

object  ESimulatorLaunch extends App{
  val simulator=new ESimulator()

  simulator.afterDelay(0){
    println(" it works")
  }


  simulator.afterDelay(10){
    println(" it works 10")
  }
  simulator.afterDelay(5){
    println(" it works 5")
  }

  simulator.run()
}