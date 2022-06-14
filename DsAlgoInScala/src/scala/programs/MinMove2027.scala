package scala.programs

object MinMove2027 {
  def minimumMoves(s: String): Int = {
    var move = 0
    var i=0
    while(i<s.length()){
      if(s.charAt(i)=='X'){
        i=i+3
        move=move+1
      } else{
        i=i+1
      }
    }
    move
  }

  def minimumMoves1(s: String): Int = {
    val it = (s+"00").iterator
    it.foldLeft(0)((acc, cur)=>{
      if(cur == 'X'){it.next();it.next();acc + 1}
      else acc
    })
  }
  def main(args: Array[String]): Unit = {
    println(minimumMoves1("XXOXXX0XXXXX0X0X0X0XXX0X000X0X00XX000X0X0X00X00X00X0"))
    println(minimumMoves1("00000000"))
  }
}
