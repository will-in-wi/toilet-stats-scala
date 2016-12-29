// import ToiletStats.Cards.Deck
import ToiletStats.Logic.Toilet
import scala.util.Random
import scala.collection.mutable.ArrayBuffer

object GamePlayer {
  def play_game(decks: Integer = 1): Integer = {
    var deck = ArrayBuffer[ToiletStats.Cards.Card]()

    for (i <- 1 to decks) {
      var deck1 = ToiletStats.Cards.Deck.generate()
      deck = deck ++ deck1
    }

    // Shuffle deck(s)
    deck = util.Random.shuffle(deck)

    var game = new ToiletStats.Logic.Toilet(deck)

    var playing = true;
    while (playing == true) {
      playing = game.round()

      // ToiletStats.Cards.Deck.format(game.deck)
    }

    return game.deck.size
  }

  def main(args: Array[String]): Unit = {
    for (i <- 0 until 100000) {
      var remaining_cards = play_game()
      println(s"$remaining_cards")
    }
  }
}
