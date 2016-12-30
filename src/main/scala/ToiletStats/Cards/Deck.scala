package ToiletStats.Cards

// import ToiletStats.Cards.Card
import scala.collection.mutable.ArrayBuffer

object Deck {
  def generate(): ArrayBuffer[Card] = {
    val cartesian_product = for (num <- Numbers.numbers; suit <- Suits.suits) yield (new Card(suit, num))

    return cartesian_product.to[ArrayBuffer]
  }

  def format(deck: ArrayBuffer[Card]): Unit = {
    for((card,i) <- deck.zipWithIndex) {
      println(s"$i => ${card.number.symbol} of ${card.suit.symbol}")
    }
  }
}
