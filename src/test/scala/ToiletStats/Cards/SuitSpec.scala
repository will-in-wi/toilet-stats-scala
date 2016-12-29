import ToiletStats.Cards.Suits
import org.scalatest._

class SuitSpec extends FunSpec with Matchers {
  describe("Suits") {
    describe("#suits") {
      it("contains four suits") {
        var suits = Suits.suits
        assert(suits.size === 4)
      }

      it("has hearts") {
        var suit = Suits.HEARTS
        assert(suit.name === "Hearts")
        assert(suit.symbol === "♥")
      }
    }
  }
}
