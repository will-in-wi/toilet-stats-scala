package ToiletStats.Logic

import ToiletStats.Cards.Card

import scala.collection.mutable.ArrayBuffer

/**
* Game code
*/
class Toilet(init_deck: ArrayBuffer[Card]) {
  var working_deck = ArrayBuffer[Card]()
  var unused_cards = init_deck

  def deck = working_deck

  def round(): Boolean = {
    if (unused_cards.size == 0) {
      return false
    }

    // Add cards until the deck has at least 4.
    do {
      add_card()
    } while (working_deck.size < 4 && unused_cards.size > 0)


    // Play a round.
    var did_stuff = true
    while (did_stuff == true) {
      var same_number = check_same_number()
      var same_suit = check_same_suit()

      did_stuff = (same_suit || same_number)
    }

    return true
  }

  protected def add_card(): Unit = {
    working_deck += unused_cards(0)
    unused_cards.remove(0)
  }

  protected def discard_card(i: Int): Unit = {
    working_deck.remove(i)
  }

  protected def check_same_number(): Boolean = {
    if (working_deck.size < 4) {
      return false
    }

    var last_index = working_deck.size - 1
    var top_card = working_deck(last_index)
    var fourth_card = working_deck(last_index-3)

    // Check for same number four cards back.
    if (top_card.number == fourth_card.number) {
      // Pull the last four cards and discard them.
      discard_card(last_index)
      discard_card(last_index-1)
      discard_card(last_index-2)
      discard_card(last_index-3)

      return true
    }

    return false
  }

  protected def check_same_suit(): Boolean = {
    if (working_deck.size < 4) {
      return false
    }

    var last_index = working_deck.size - 1
    var top_card = working_deck(last_index)
    var fourth_card = working_deck(last_index - 3)

    // Check for the same suit four cards back.
    if (top_card.suit == fourth_card.suit) {
      // Pull the last four cards and discard them.
      discard_card(last_index-1)
      discard_card(last_index-2)
      return true
    }

    return false
  }
}
