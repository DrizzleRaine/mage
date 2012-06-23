/*
 *  Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 *
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 *
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */
package mage.sets.fifthedition;

import java.util.UUID;
import mage.Constants;
import mage.Constants.CardType;
import mage.Constants.Rarity;
import mage.cards.CardImpl;
import mage.abilities.Ability;
import mage.abilities.common.SimpleActivatedAbility;
import mage.Constants.Zone;
import mage.abilities.costs.common.TapSourceCost;
import mage.abilities.costs.mana.GenericManaCost;
import mage.target.TargetPlayer;
import mage.abilities.effects.OneShotEffect;
import mage.players.Player;
import mage.cards.Card;
import mage.game.Game;

/**
 *
 * @author jeffwadsworth
 */
public class Millstone extends CardImpl<Millstone> {

    public Millstone(UUID ownerId) {
        super(ownerId, 390, "Millstone", Rarity.RARE, new CardType[]{CardType.ARTIFACT}, "{2}");
        this.expansionSetCode = "5ED";

        // {2}, {tap}: Target player puts the top two cards of his or her library into his or her graveyard.
        Ability ability = new SimpleActivatedAbility(Zone.BATTLEFIELD, new MillstoneEffect(2), new GenericManaCost(2));
        ability.addCost(new TapSourceCost());
        ability.addTarget(new TargetPlayer());
        this.addAbility(ability);
    }

    public Millstone(final Millstone card) {
        super(card);
    }

    @Override
    public Millstone copy() {
        return new Millstone(this);
    }
}

class MillstoneEffect extends OneShotEffect<MillstoneEffect> {

    int count = 0;

    public MillstoneEffect(final MillstoneEffect effect) {
        super(effect);
        this.count = effect.count;
    }

    public MillstoneEffect(final int count) {
        super(Constants.Outcome.Detriment);
        this.count = count;
        this.staticText = "Target player puts the top " + count + " cards of his or her library into his or her graveyard";
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player targetPlayer = game.getPlayer(source.getFirstTarget());
        if (targetPlayer != null) {
            for (int i = 0; i<count ; i++) {
                if (!targetPlayer.getLibrary().getCardList().isEmpty()) {
                    Card card = targetPlayer.getLibrary().removeFromTop(game);
                    if (card != null) {
                        card.moveToZone(Zone.GRAVEYARD, source.getId(), game, false);
                    }  
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public MillstoneEffect copy() {
        return new MillstoneEffect(this);
    }
}
