package org.michaelahlers

class SHelloWorld {
  def printMessage() = {
    println("Hello from Scala!")
  }
}

object SHelloWorld {
  def main(arguments: Array[String]) = {
    new SHelloWorld().printMessage()
    new JHelloWorld().printMessage()
  }
}