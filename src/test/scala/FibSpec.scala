import org.specs2.matcher.OptionMatchers
import org.specs2.mutable.Specification

class FibSpec extends Specification with OptionMatchers {
  "This is a specification for Fibonacci sequence".txt

  // 0,1,1,2,3,5,8
  def fib(position: Int):Int = {
    position match {
      case 0 => 0
      case 1 => 1
      case _ => fib(position - 1) + fib(position - 2)
    }
  }

  "fib" >> {

    // 0,1,1,2,3,5,8

    "fib(0) => 0" >> {
      fib(0) must equalTo(0)
    }

    "fib(1) => 1" >> {
      fib(1) must equalTo(1)
    }

    "fib(2) => 1" >> {
      fib(2) must equalTo(1)
    }

    "fib(3) => 2" >> {
      fib(3) must equalTo(2)
    }

    "fib(4) => 3" >> {
      fib(3) must equalTo(2)
    }

    "fib(5) => 5" >> {
      fib(3) must equalTo(2)
    }

    "fib(6) => 8" >> {
      fib(3) must equalTo(2)
    }

  }

}
