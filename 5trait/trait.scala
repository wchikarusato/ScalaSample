object CarExtends {
  def main(args: Array[String]){
    var b = new B()
  }
}
trait A{
  val a:Int
  println(a)
}

class B extends {
  val a = 1
} with A

