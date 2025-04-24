package objektwerks

import java.time.LocalDate
import java.time.temporal.ChronoUnit

object Date:
  type Expression = String
  type Encoding = Int

  def dateDiff(fromLocalDate: LocalDate, toLocalDate: LocalDate): Long = ChronoUnit.DAYS.between(fromLocalDate, toLocalDate)

  def dayOfYear(date: LocalDate): String = date.getDayOfYear().toString

  def remainingDaysInYear(date: LocalDate): String = ( date.lengthOfYear() - date.getDayOfYear() ).toString

  def splitYear(date: LocalDate): Encoding = // mm + dd + yy + yy
    val month = date.getMonthValue()
    val day = date.getDayOfMonth()
    val (leftYear, rightYear) = date.getYear().toString.splitAt(2)
    month + day + leftYear.toInt + rightYear.toInt

  def splitEachYear(date: LocalDate): Encoding = // mm + dd + y + y + y + y
    val month = date.getMonthValue()
    val day = date.getDayOfMonth()
    val years = date.getYear().toString.toCharArray.map(c => c.toString)
    month + day + years.map(s => s.toInt).sum

  def splitEachMonthDayYear(date: LocalDate): Encoding = // m + m + d + d + y + y + y + y
    val months = date.getMonthValue().toString.toCharArray.map(c => c.toString)
    val days = date.getDayOfMonth().toString.toCharArray.map(c => c.toString)
    val years = date.getYear().toString.toCharArray.map(c => c.toString)
    months.map(s => s.toInt).sum + days.map(s => s.toInt).sum + years.map(s => s.toInt).sum

  def splitRightYear(date: LocalDate): Encodinng = // mm + dd + yy - last 2 year digits
    val month = date.getMonthValue()
    val day = date.getDayOfMonth()
    val rightYear = date.getYear().toString.drop(2)
    val expression = s"$month + $day + $rightYear"
    month + day + rightYear.toInt

  def splitEachMonthDayRightYear(date: LocalDate): Encoding = // m + m + d + d + y + y - last 2 year digits
    val months = date.getMonthValue().toString.toCharArray.map(c => c.toString)
    val days = date.getDayOfMonth().toString.toCharArray.map(c => c.toString)
    val years = date.getYear().toString.drop(2).toCharArray.map(c => c.toString)
    months.map(s => s.toInt).sum + days.map(s => s.toInt).sum + years.map(s => s.toInt).sum

  private def toExpression(strings: Array[String]): String =
    if strings.length == 2 then s"${strings(0)} + ${strings(1)}"
    else if strings.length == 1 then s"${strings(0)}"
    else "0"