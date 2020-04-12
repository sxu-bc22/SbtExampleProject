package example

object Main extends App {
  val ages = Seq(42, 621, 29, 60)
  println(s"The oldest person is ${ages.max}")

  var m = List(1,2,3,4,5,6).map(x =>x*2)
  println(m.toString())

  var f = m.filter(_/2%2 == 0)
  println(f.toString())
}

