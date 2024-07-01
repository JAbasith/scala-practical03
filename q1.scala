import scala.io.StdIn.readLine

object Input{
	def reverseOrder(name: String,len: Int): String={
		if(len > 0){
			name(len-1) + reverseOrder(name,len-1)
		}
		else{
			""
		}
	}

	def main(args: Array[String]): Unit={
		println("Enter your name: ")
		val name = readLine()
		val len = name.length
		println(s"Hello $name! $len")
		val reversedString = reverseOrder(name,len)
		println(s"Reversed order is: $reversedString")
	}
}

