class User(val id: Long, val firstname: String, val lastname: String, val fullname:Fullname = new Fullname) {
  def getFullname() = this.fullname.get(firstname, lastname)
}

class Fullname() {
  def get(firstname: String, lastname: String) = firstname + " " + lastname
}

class FullnameInJapan() extends Fullname {
  override def get(firstname: String, lastname: String) = lastname + " " + firstname
}

object Test {
  def main(args: Array[String]) {
   val user2 = new User(1, "Tarou", "Yamada")
   println(user2.getFullname())
   
   val user1 = new User(2, "花子", "佐藤", new FullnameInJapan)
   println(user1.getFullname())
  }
}
