/*
 * castle.java
 *
 * Created on 06 January 2010, 18:59
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package conquistador.buildings;

import conquistador.frame;
import conquistador.stock.gold;

/**
 *
 * @author Administrator
 */
public class castle extends buildings {
    barrack Barrack;

    public static int total = 0;
    public int castleId;

    public int maxPopulationSupport;
    
    public boolean onHold;

    public int archerEffectiveness;
    public int crossBowmanEffectiveness;
    public int knightEffectiveness;
    public int pikemanEffectiveness;
    public int swordsmanEffectiveness;
    public int muskeeterEffectiveness;

    public int archerPopulation;
    private int buildingEffectiveness;
    public int castleEfficiency;

    public int damageToArchers;
    public int damageToCrossBowman;
    public int damageToKnight;
    public int damageToPikeman;
    public int damageToSwordsman;
    public int damageToMuskeeter;

    public boolean attackingWithArcher;
    public boolean attackingWithCrossBowman;
    public boolean attackingWithPikeman;
    public boolean attackingWithSwordsman;
    public boolean attackingWithMuskeeter;
    public boolean attackingWithKnight;

    
    /** Creates a new instance of barrack */
    public castle(stockpile Stockpile, frame f, gold Gold, int st,barrack Barrack) {
        super("Castle", Stockpile, Gold, f, 900, 900, 900, 5000, 5);
        this.Barrack=Barrack;

        onHold = true;
        maxPopulationSupport = 80;        
    }

    public void construct() {
        if (Gold.stock > goldRequired 
                && Stockpile.Stone.stock > stoneRequired
                && Stockpile.Wood.stock > woodRequired) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            Gold.addToStock(false, goldRequired);
            Stockpile.Stone.addToStock(false, stoneRequired);
            Stockpile.Wood.addToStock(false, woodRequired);
            //this.addArmy("Archer",10);
            f.constructionCompletion(true);
            f.displayStockpile(Stockpile);
        }
    }
    public void mountArmy(String type,boolean mount,int n)
    {
        if(type=="Archer")
        {
            if(Barrack.archerPopulation>n)
                Barrack.transferArmyFromBarrack("Archer", "Castle", n);
        }
        else if(type=="Archer")
        {
            if(Barrack.archerPopulation>n)
                Barrack.transferArmyFromBarrack(type, "Castle", n);
        }else if(type=="Archer")
        {
            if(Barrack.archerPopulation>n)
                Barrack.transferArmyFromBarrack(type, "Castle", n);
        }else if(type=="Archer")
        {
            if(Barrack.archerPopulation>n)
                Barrack.transferArmyFromBarrack(type, "Castle", n);
        }
    }
    public boolean repair() {
        return true;
    }

    public void upgrade() {
        if (Stockpile.Wood.stock > 800 && Gold.stock > 800 && Stockpile.Stone.stock > 800 && upgradeLevel < maxUpgradeLevel) {
            Stockpile.addToStockpile(false, "Wood", woodRequired);
            Stockpile.addToStockpile(false, "Stone", stoneRequired);
            Gold.addToStock(false, goldRequired);
            upgradeLevel++;
            maxPopulationSupport += 500;
            hitPoints += 1000;
        } else {
            f.constructionCompletion(false);
        }
    }

    public void degrade() {
        upgradeLevel--;
        maxPopulationSupport -= 500;
        hitPoints += 1000;
        f.constructionCompletion(false);
    }

    public void castleEffectiveness() {
        archerEffectiveness=0;
        for(int i=0;i<Barrack.archerPopulation;i++) {
            if(Barrack.Archer[i].areaAssignment=="Castle")archerEffectiveness+=Barrack.Archer[i].averageEffectiveness();
            if(Barrack.CrossBowman[i].areaAssignment=="Castle")crossBowmanEffectiveness+=Barrack.CrossBowman[i].averageEffectiveness();
            if(Barrack.Knight[i].areaAssignment=="Castle")knightEffectiveness+=Barrack.Knight[i].averageEffectiveness();
            if(Barrack.Swordsman[i].areaAssignment=="Castle")swordsmanEffectiveness+=Barrack.Swordsman[i].averageEffectiveness();
            if(Barrack.Muskeeter[i].areaAssignment=="Castle")muskeeterEffectiveness+=Barrack.Muskeeter[i].averageEffectiveness();
            if(Barrack.Pikeman[i].areaAssignment=="Castle")pikemanEffectiveness+=Barrack.Pikeman[i].averageEffectiveness();
        }
        buildingEffectiveness=upgradeLevel*10+hitPoints;
        castleEfficiency=archerEffectiveness+buildingEffectiveness+crossBowmanEffectiveness+knightEffectiveness
                        +swordsmanEffectiveness+muskeeterEffectiveness+pikemanEffectiveness;
    }
}
