import java.text.SimpleDateFormat
import java.util.Date


object Convertor {
def celToFah (tempInCelsius:Int ):Double = {
  val tempInFahrenheit = ((tempInCelsius * 9/5) + 32)
  tempInFahrenheit
// f = (c * 9 / 5) + 32
}

def dateFormating(dateInString: String):Date ={
  val formater = new SimpleDateFormat("dd/mm/yy")
  var result = formater.parse(dateInString.toLocaleString)

  result
}

def main(args:Array[String]): Unit= {
  println(s"Temp: {celToFah(80)}")

  println("Date:  ${dateFormating("11/01/17")}")
}

}

