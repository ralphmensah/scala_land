#!/bin/sh
exec scala -savecompiled "$0" "$@"
!#

object Helloworld  {
    def main(args : Array[String]){
        println("helloWorld from Unix")
    }

}
Helloworld.main(args)