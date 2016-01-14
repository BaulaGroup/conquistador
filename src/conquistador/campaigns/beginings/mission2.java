/*
 * mission2.java
 *
 * Created on 11 February 2010, 18:15
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package conquistador.campaigns.beginings;

import conquistador.buildings.castle;
import conquistador.buildings.warCamp;
import conquistador.state;
import java.util.Random;

/**
 *
 * @author Administrator
 */
public class mission2 {

    Random r = new Random();

    /** Creates a new instance of mission2 */
    public mission2() {
    }

    public boolean missionCompletion(state t) {
        if (t.Barrack.onHold == false && t.Castle.onHold == false) {
            return true;
        } else {
            return false;
        }
    }

    public boolean missionFailure(state s) {
        if (s.Barrack.onHold == false && s.Castle.onHold == false) {
            return true;
        } else {
            return false;
        }
    }

    public void onAttack(warCamp w, castle c) {
        if (w.attackingWithArcher) {
            c.damageToArchers = w.archerEffectiveness / 50;
            c.damageToCrossBowman = w.archerEffectiveness / 100;
            c.damageToKnight = w.archerEffectiveness / 1000;
            c.damageToMuskeeter = w.archerEffectiveness / 300;
            c.damageToPikeman = w.archerEffectiveness / 50;
            c.damageToSwordsman = w.archerEffectiveness / 500;
        }
        if (w.attackingWithCrossBowman) {
            c.damageToArchers = w.crossBowmanEffectiveness / 50;
            c.damageToCrossBowman = w.crossBowmanEffectiveness / 100;
            c.damageToKnight = w.crossBowmanEffectiveness / 1000;
            c.damageToMuskeeter = w.crossBowmanEffectiveness / 300;
            c.damageToPikeman = w.crossBowmanEffectiveness / 50;
            c.damageToSwordsman = w.crossBowmanEffectiveness / 500;
        }
        if (w.attackingWithKnight) {
            c.damageToArchers = w.knightEffectiveness / 50;
            c.damageToCrossBowman = w.knightEffectiveness / 100;
            c.damageToKnight = w.knightEffectiveness / 1000;
            c.damageToMuskeeter = w.knightEffectiveness / 300;
            c.damageToPikeman = w.knightEffectiveness / 50;
            c.damageToSwordsman = w.knightEffectiveness / 500;
        }
        if (w.attackingWithMuskeeter) {
            c.damageToArchers = w.muskeeterEffectiveness / 50;
            c.damageToCrossBowman = w.muskeeterEffectiveness / 100;
            c.damageToKnight = w.muskeeterEffectiveness / 1000;
            c.damageToMuskeeter = w.muskeeterEffectiveness / 300;
            c.damageToPikeman = w.muskeeterEffectiveness / 50;
            c.damageToSwordsman = w.muskeeterEffectiveness / 500;
        }
        if (w.attackingWithPikeman) {
            c.damageToArchers = w.pikemanEffectiveness / 50;
            c.damageToCrossBowman = w.pikemanEffectiveness / 100;
            c.damageToKnight = w.pikemanEffectiveness / 1000;
            c.damageToMuskeeter = w.pikemanEffectiveness / 300;
            c.damageToPikeman = w.pikemanEffectiveness / 50;
            c.damageToSwordsman = w.pikemanEffectiveness / 500;
        }
        if (w.attackingWithSwordsman) {
            c.damageToArchers = w.swordsmanEffectiveness / 50;
            c.damageToCrossBowman = w.swordsmanEffectiveness / 100;
            c.damageToKnight = w.swordsmanEffectiveness / 1000;
            c.damageToMuskeeter = w.swordsmanEffectiveness / 300;
            c.damageToPikeman = w.swordsmanEffectiveness / 50;
            c.damageToSwordsman = w.swordsmanEffectiveness / 500;
        }
    }
}
