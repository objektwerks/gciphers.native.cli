package objektwerks

import upickle.default.ReadWriter as JsonSupport

import scala.collection.mutable

object Texts:
  given Ordering[Texts] = Ordering.by[Texts, Int](t => t.number)

final case class Texts(number: Int, values: mutable.Set[String]) derives CanEqual, JsonSupport