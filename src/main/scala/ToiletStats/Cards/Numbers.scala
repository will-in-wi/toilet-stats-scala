package ToiletStats.Cards

object Numbers {
  sealed abstract class Number(
    val value  : Int,
    val name   : String,
    val symbol : String) extends Ordered[Number] {
      def compare(that: Number) = this.value - that.value
      override def toString = name
  }

  case object ACE   extends Number(0, "Ace", "A")
  case object ONE   extends Number(1, "One", "1")
  case object TWO   extends Number(2, "Two", "2")
  case object THREE extends Number(3, "Three", "3")
  case object FOUR  extends Number(4, "Four", "4")
  case object FIVE  extends Number(5, "Five", "5")
  case object SIX   extends Number(6, "Six", "6")
  case object SEVEN extends Number(7, "Seven", "7")
  case object EIGHT extends Number(8, "Eight", "8")
  case object NINE  extends Number(9, "Nine", "9")
  case object TEN   extends Number(10, "Ten", "10")
  case object JACK  extends Number(11, "Jack", "J")
  case object QUEEN extends Number(12, "Queen", "Q")
  case object KING  extends Number(13, "King", "K")

  val numbers = Set(ACE, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING)
}
