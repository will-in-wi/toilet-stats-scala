import ToiletStats.Cards.Suits
import ToiletStats.Cards.Numbers
import ToiletStats.Cards.Deck
import org.scalatest._

class DeckSpec extends FunSpec with Matchers {
  describe("A Deck") {
    describe(".generate") {
      it("returns 56 cards") {
        var deck = Deck.generate
        assert(deck.size === 56)
      }

      it("has 14 hearts") {
        var deck = Deck.generate
        assert(deck.count(_.suit == Suits.HEARTS) === 14)
      }

      it("has 4 aces") {
        var deck = Deck.generate
        assert(deck.count(_.number == Numbers.ACE) === 4)
      }
    }
  }
}
