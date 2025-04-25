package objektwerks

import upickle.default.ReadWriter as JsonSupport

object Texts:
  val empty: Texts = Texts(0, Set.empty[String])

  given Ordering[Texts] = Ordering.by[Texts, Int](t => t.number)

final case class Texts(number: Int, values: Set[String]) derives CanEqual, JsonSupport:
  def fileProperty: String = s"$number.json"