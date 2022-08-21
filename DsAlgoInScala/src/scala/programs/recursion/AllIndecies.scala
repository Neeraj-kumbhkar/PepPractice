package scala.programs.recursion

object AllIndecies {

  def AllIndex(arr:Array[Int],ele:Int,idx:Int,fsf:Int):Array[Int] = arr match {
    case Array() => arr
    case Array(a) => if(a==ele) Array[Int](idx) else Array()
    case _ =>
      var res: Array[Int] = null
      if(idx==arr.length-1) {
        res = Array[Int](fsf)
        return res
      }
      if(ele==arr(idx)){
        res=AllIndex(arr,ele,idx+1,fsf+1)
        res(fsf) = idx
      } else {
        res=AllIndex(arr,ele,idx+1,fsf)
      }
      res
  }
  def main(args: Array[String]): Unit = {
    val r = AllIndex(Array(5,2,5,7),5,0,0)
    println(r)
  }
}
