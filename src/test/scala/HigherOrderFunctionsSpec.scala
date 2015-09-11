import org.specs2.mutable.Specification


class HigherOrderFunctionsSpec extends Specification {


  "curry" >> {
    def add(a: Int)(b: Int) = { a + b }

    val addSecond = add(1)(_)
    val result = addSecond(2)

    result must equalTo(3)
  }

  "functions and methods" >> {

    // function definition
    val f = (x: Int) => x + 1
    f(1) must equalTo(2)

    // method definition
    def m(x:Int) = { x + 1 }
    m(1) must equalTo(2)

    // functions are objects and can be combined using andThen function,
    // in order to combine methods they have to be converted to functions first
    // methods are not objects, so methods can't be called on them

    (f andThen (m _))(2) must equalTo(4)

  }

}
