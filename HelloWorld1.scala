object HelloWorld{
  def main(args: Array[String]){
    if(args.size == 0) {
      val strs = Array("Hello", "World")
      output(strs)
    } else {
      printf("Invalid args.")
    }
  }

  def output(strs: Array[String]){
    strs.foreach(printf("%s ", _))
  }
}
