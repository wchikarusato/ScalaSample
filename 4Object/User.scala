class User(val id: Long, val firstname: String, val lastname: String) {
  def getFullname() = this.firstname + " " +  this.lastname
}
