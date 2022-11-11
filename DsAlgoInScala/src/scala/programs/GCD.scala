package scala.programs

import java.util.Scanner

object GCD {
  def main(args: Array[String]): Unit = {
    val scn = new Scanner(System.in)
    var a = scn.nextInt()
    var b = scn.nextInt()
    var oa=a
    var ob = b
    while (b>0){
      var rem = a%b
      a = b
      b = rem
    }
    println(a)
    println(oa*ob/a)
  }
}

