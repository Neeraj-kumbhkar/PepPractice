package scala.programs

import java.util.Scanner
object RotateANum {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    var n = sc.nextInt()
    var k = sc.nextInt()
    val nod = (Math.log10(n)+1).toInt
    k=k%nod
    if(k<0) k=k+nod
    for(i<-0 to k){
      var id = n%10
      n=n/10
      n=n+id*(Math.pow(10,nod-1)).toInt
    }
    println(n)
  }
}
