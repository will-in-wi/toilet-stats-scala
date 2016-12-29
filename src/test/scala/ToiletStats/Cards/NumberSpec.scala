import ToiletStats.Cards.Numbers
import org.scalatest._

class NumberSpec extends FunSpec with Matchers {
  describe("Numbers") {
    describe("#numbers") {
      it("contains 13 numbers") {
        assert(Numbers.numbers.size === 14)
      }

      it("has correct order") {
        assert(Numbers.ACE < Numbers.ONE)
        assert(Numbers.ONE < Numbers.TWO)
        assert(Numbers.TWO < Numbers.THREE)
        assert(Numbers.THREE < Numbers.KING)
      }

      it("has aces") {
        var number = Numbers.ACE
        assert(number.name === "Ace")
        assert(number.symbol === "A")
        assert(number.value === 0)
      }

      it("has kings") {
        var number = Numbers.KING
        assert(number.name === "King")
        assert(number.symbol === "K")
        assert(number.value === 13)
      }

      it("has fives") {
        var number = Numbers.FIVE
        assert(number.name === "Five")
        assert(number.symbol === "5")
        assert(number.value === 5)
      }
    }
  }
}
