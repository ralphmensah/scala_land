::#!
@echo off
call scala %0 %*
goto :eof
::!#

object Helloworld  {
    def main(args : Array[String]){
        println("helloWorld")
    }

}