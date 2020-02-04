

package mage.game.permanent.token;
import mage.MageInt;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 *
 * @author spjspj
 */
public final class MinorDemonToken extends TokenImpl {

    public MinorDemonToken() {
        super("Minor Demon", "1/1 black and red Demon creature token named Minor Demon");
        cardType.add(CardType.CREATURE);
        color.setBlack(true);
        color.setRed(true);
        subtype.add(SubType.DEMON);
        power = new MageInt(1);
        toughness = new MageInt(1);
    }

    public MinorDemonToken(final MinorDemonToken token) {
        super(token);
    }

    public MinorDemonToken copy() {
        return new MinorDemonToken(this);
    }
}
