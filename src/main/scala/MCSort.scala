object MCSort extends App{


  def mergedsort[T](less: (T, T) => Boolean)(list: List[T]):List[T] = {
    def merge(first: List[T], second: List[T]): List[T] = {
      (first, second) match {
        case (_, Nil) => first;
        case (Nil, _) => second;
        case (f :: fs, s :: sc) => ()
          if (less(f, s)) f :: merge(fs, second)
          else s :: merge(first, sc);
      }
    }

    val n = list.size / 2
    if (n == 0) list
    else {
      val (f2, s2) = list splitAt n
      merge(mergedsort(less)(f2), mergedsort(less)(f2))
    }
  }

 val list:List[Int] = List[Int](7, 5, 1, 51, 4)
  println(list)
  val curred = mergedsort((x:Int, y:Int)=>x<y)_
  println(curred(list))

}
