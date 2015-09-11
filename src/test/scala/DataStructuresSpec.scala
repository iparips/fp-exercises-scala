import org.specs2.mutable.Specification

class DataStructuresSpec extends Specification {

  "#tail" >> {

    def tail[T](list: Seq[T]): Seq[T] = {

      list match {
        case Seq() => sys.error("UnsupportedOperationException: tail of empty list")
        case Seq(_) => Seq()
        case x :: xs => xs
      }

    }

    "tail of empty list throws error" >> {
      tail[Int](Seq())  must throwA[Exception](message = "UnsupportedOperationException: tail of empty list")
    }

    "tail of list with one element is an empty list" >> {
      tail[Int](Seq(1)) must equalTo(Seq())
    }

    "tail of list with more than one element is all elements but the first" >> {
      tail[Int](Seq(1, 2)) must equalTo(Seq(2))
    }

  }

}
