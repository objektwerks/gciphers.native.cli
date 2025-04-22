package objektwerks

import mainargs.{main, arg, ParserForMethods}

object App:
  val store = Store()

  def main(args: Array[String]): Unit =
    if args.isEmpty then commands()
    else ParserForMethods(this).runOrExit(args)

  private def commands(): Unit =
    println("Commands:")
    println("1. list --filter all | completed | incomplete")
    println("2. add --todo")
    println("3. complete --id")
    println("4. help")