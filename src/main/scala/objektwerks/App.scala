package objektwerks

import mainargs.{main, arg, ParserForMethods}

object App:
  val store = Store()

  @main
  def help(): Unit =
    commands()

  @main
  def w( @arg word: String ): Unit = ???

  @main
  def n( @arg number: Int ): Unit = ???

  def main(args: Array[String]): Unit =
    if args.isEmpty then commands()
    else ParserForMethods(this).runOrExit(args)

  private def commands(): Unit =
    println("Commands:")
    println("1. w")
    println("2. n")
    println("3. d")
    println("4. nmapw")