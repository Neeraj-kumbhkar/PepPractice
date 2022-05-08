package scala.programs

object ArrayRotation {
  def reverse[A](l:Array[Int]):Array[Int] = l match {
    case Array() => l
    case Array(a) => l
    case _ => reverse(l.tail):+l.head
  }
  def rotateAnArray(a:Array[Int], k:Int):Array[Int]={
    val n=a.length
    val ak=k%n
    val rot=if(ak<0) k+n else ak
    reverse(reverse(a.take(rot))++reverse(a.takeRight(n-rot)))
  }
  def main(args: Array[String]): Unit = {
    rotateAnArray(Array(1,2,3,4,5),-2).foreach(i=>print(i))
  }
}
