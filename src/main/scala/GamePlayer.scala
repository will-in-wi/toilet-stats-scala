import ToiletStats.Logic.Toilet
import ToiletStats.Cards.Deck
import scala.util.Random
import scala.collection.mutable.ArrayBuffer

object GamePlayer {
  def play_game(decks: Integer = 1): Integer = {
    var deck = new Deck()

    for (i <- 1 to decks) {
      var deck1 = ToiletStats.Cards.Deck.generate
      deck = deck ++ deck1
    }

    // Shuffle deck(s)
    deck = util.Random.shuffle(deck)

    val game = new ToiletStats.Logic.Toilet(deck)

    var playing = true;
    while (playing == true) {
      playing = game.round
    }

    // ToiletStats.Cards.Deck.format(game.deck)

    return game.deck.size
  }

  def main(args: Array[String]): Unit = {
    // val t0 = System.nanoTime()
    for (i <- 0 until 100000) {
      val remaining_cards = play_game(2)
      println(remaining_cards)
    }
    // val t1 = System.nanoTime()
    // println("Elapsed time: " + (t1 - t0) + "ns")
  }
}
