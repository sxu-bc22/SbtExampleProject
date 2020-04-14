package example

object Main extends App {
  lazy val ages = Seq(42, 621, 29, 60)
  println(s"The oldest person is ${ages.max}")

  var m = List(1,2,3,4,5,6).map(_*2)
  println(m.toString())

  var f = m.filter(y => (y/2)%2 == 0)
  println(f.toString())

  def foo(x: Int): Unit = { println("foo : "+ x) }
  foo(18+2)

  val t = new Test
  t.age = -5
  println(t.age)


  class Test {
    private var a = 0
    def age: Int = a
    def age_=(n:Int): Unit = {
     // require(n>0)
      a = n
    }
  }
}

