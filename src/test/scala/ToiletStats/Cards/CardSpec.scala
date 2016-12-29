import ToiletStats.Cards.Card
import ToiletStats.Cards.Suits
import ToiletStats.Cards.Numbers
import org.scalatest._

class CardSpec extends FunSpec with Matchers {
  describe("A Card") {
    describe("#suit") {
      it("works") {
        var card = new Card(Suits.SPADES, Numbers.ONE)
        assert(card.suit === Suits.SPADES)
      }
    }

    describe("#number") {
      it("works") {
        var card = new Card(Suits.SPADES, Numbers.KING)
        assert(card.number === Numbers.KING)
      }
    }
  }
}
