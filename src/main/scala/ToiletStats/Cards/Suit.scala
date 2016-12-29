package ToiletStats.Cards

object Suits {
  sealed abstract class Suit(val name: String, val symbol: String) {
    override def toString = name
  }

  case object HEARTS extends Suit("Hearts", "♥")
  case object DIAMONDS extends Suit("Diamonds", "♦")
  case object SPADES extends Suit("Spades", "♠")
  case object CLUBS extends Suit("Clubs", "♣")

  val suits = Set(HEARTS, DIAMONDS, SPADES, CLUBS)
}
