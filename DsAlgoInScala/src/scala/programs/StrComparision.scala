package scala.programs
import scala.collection.mutable

object StrComparision {
  def comparision2(s: String): String = {
    val sb = new mutable.StringBuilder
    sb.append(s.charAt(0))
    var count = 1
    for (i <- 1 until s.length) {
      val c = s.charAt(i)
      val p = s.charAt(i - 1)
      if (p != c) {
        sb.append(if (count >= 1) count else "")
        count = 1
        sb.append(c)
      }
      else count += 1
    }
    sb.append(if (count >= 1) count else "")
    sb.toString
  }

  def main(args: Array[String]): Unit = {
    val s:String = "aaabbbcdd"
    println(comparision2(s))
  }
}
