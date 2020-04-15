package example

import java.util.Date
import scala.math._


object Main extends App {
  def log(date : Date, message : String) = {
    println(date + " : " + message);
  }

  val date = new Date();
  val newLog = log(date, _ : String)
  newLog("msg 1")
  newLog("msg 2")

  // high order function
  def math(x: Double, y: Double, f: (Double, Double) => Double) : Double= f(x, y)
  println("Math "+math(30.0, 60.0, (x,y)=>sin(x*3.1415926535/180.0)+cos(y*3.1415926535/180.0)))


  def add(x : Int = 20, y : Int = 10) : Int  = x + y

  println(add(5,30))

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

