object MergeSort extends App {

  val list = List(7, 5, 1, 51, 4)

  println()

  def msort[T](list: List[T], less: (T, T) => Boolean): List[T] = {

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
      merge(msort(f2, less), msort(s2, less))
    }
  }

}