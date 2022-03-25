object text {

  def main(args: Array[String]): Unit = {
    val a = 1;
    println(a)

    val pe = new personP
    println(pe.name+pe.age)

    val ox = new personPx(x1 = "li",x2 = 13)
    println(ox.name+ox.age)

    for(i<- 1 to 9;j<- 1 to i){
      val m = i*j
      print(j+"*"+i+"="+m+"\t")
      if (i==j){
        println()
      }
    }
  }
}

class personP{
  val name="zs"
  val age="18"
}

class personPx(x1:String,x2:Int){
  val name=x1
  val age=x2
}

