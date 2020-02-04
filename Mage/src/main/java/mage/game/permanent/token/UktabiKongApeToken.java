
package mage.game.permanent.token;

import mage.MageInt;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 *
 * @author L_J
 */
public final class UktabiKongApeToken extends TokenImpl {

    public UktabiKongApeToken() {
        super("Ape", "1/1 green Ape creature token");
        cardType.add(CardType.CREATURE);
        subtype.add(SubType.APE);
        color.setGreen(true);
        power = new MageInt(1);
        toughness = new MageInt(1);
    }

    public UktabiKongApeToken(final UktabiKongApeToken token) {
        super(token);
    }

    public UktabiKongApeToken copy() {
        return new UktabiKongApeToken(this);
    }
}
