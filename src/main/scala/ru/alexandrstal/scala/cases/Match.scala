package ru.alexandrstal.scala.cases


class NameOrt extends Ordering[Person]{
  override def compare(x: Person, y: Person): Int = x.age - y.age
}

class Match {}


object Match extends App{

  val personA = Person("Вася", 33)
  val personB = Person("Петя", 15)
  val personC = Person("Коля", 101)
  val personD = Person("Сеня", 38)

  val merson = Merson("Обама", 88)

  val list = List[Person](personA, personB, personC, personD)


  val list2 = list.sortBy(r=>r.age)

scala.util.Sorting.quickSort(list.toArray)(new NameOrt)

  val ss = scala.collection.mutable.Set[Person]()++list



  println(ss)

  list.foreach(hr)

  def hr(person:Any): Unit = person match {
    case Person(name, age) if age < 18 => println("здравствуй " + name + " ты моложе чем надо")
    case Person(name, age) if age > 100 => println("ну здравствуй " + name + " " + age +" солидный возраст")
    case Person(name, age @ 33) => println("Возраст Христа - " + age)
    case Person(name, age) => println("здравствуй " + name + " возраст " + age + " то что надо")
    case Person(name, age) => println("и еще раз здравствуй")
  //  case _ => println("ой, все!")
  }


  val arr = list.toArray
   scala.util.Sorting.quickSort(arr)(new NameOrt)
  println(arr.toList)

}
