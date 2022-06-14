package scala.programs

object MultipleArray1stIndex {

  def sFirstIndex(arr:Array[Int], ele:Int,idx:Int):Int= arr match {
    case Array(a) => if (arr(a) == idx )  idx else -1
    case Array() => -1
    case _ =>
      if(idx == arr.length) return -1
      if(arr(idx)==ele) return idx
      sFirstIndex(arr,ele,idx+1)
  }

  def main(args: Array[String]): Unit = {
    val arr = Array[Int](2,5,4,6,7,8,9,3,2,5,5)
    print(sFirstIndex(arr,50,0))
  }
}
