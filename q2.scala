import scala.io.StdIn.readLine

object Newstring{

	def filterString(strings: List[String]): List[String]={
		strings.filter(_.length > 5)
	}


	def main(args: Array[String]): Unit={
		println("Enter stings: ")
		
		var strings = List[String]()
		var input = readLine() 
		
		while(input.nonEmpty){
			strings = strings :+ input
			input = readLine()
		}
		
		println("You entered the following strings: ")
		val filtered = filterString(strings)
		println(filtered)
	}
}
