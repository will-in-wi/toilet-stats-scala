package ToiletStats.Cards

// import ToiletStats.Cards.Card
import scala.collection.mutable.ArrayBuffer

object Deck {
  def generate(): Deck = {
    val cartesian_product = for (num <- Numbers.numbers; suit <- Suits.suits) yield (Card(suit, num))

    return cartesian_product.asInstanceOf[Deck]
  }
}

class Deck extends ArrayBuffer[Card] {
  def format(): Unit = {
    for((card,i) <- this.zipWithIndex) {
      println(s"$i => ${card.number.symbol} of ${card.suit.symbol}")
    }
  }

  def last_index = this.size - 1
  def top_card = this(last_index)
  def fourth_card = this(last_index-3)
}
