/*
 * warCamp.java
 *
 * Created on 10 January 2010, 10:20
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package conquistador.buildings;

import conquistador.frame;
import conquistador.peasants;
import conquistador.stock.gold;

/**
 *
 * @author Administrator
 */
public class warCamp extends buildings implements Runnable{
    barrack Barrack;

    public int Archer;
    public int Swordsman;
    public int Muskeeter;
    public int Knight;
    public int CrossBowman;
    public int Pikeman;
    
    public int monthlySpendingsPerArmy;
    public int maxPopulationSupport;
    public int currentPopulation;

    public int archerEffectiveness;
    public int crossBowmanEffectiveness;
    public int knightEffectiveness;
    public int pikemanEffectiveness;
    public int swordsmanEffectiveness;
    public int muskeeterEffectiveness;

    public int buildingEffectiveness;
    public int warCampEfficiency;
    int warCampMorality;

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
    
    Thread t;
    
    peasants Peasants;
    
    int currentLabourerNumber;
    int monthlySpendingsPerPeasant;
    int monthlySpendings;
    int extractionRate;
    int monthlyExtraction;
    int maxLabourerSupport;    
    
    /** Creates a new instance of barrack */
    public warCamp(stockpile Stockpile,frame f,gold Gold) {
        super("WarCamp",Stockpile,Gold,f,1000,1000,1000,5000,5);
        
        maxPopulationSupport=500;
        currentPopulation=Archer+CrossBowman+Swordsman+Muskeeter+Knight+Pikeman;
        monthlySpendings=0;
        monthlySpendingsPerArmy=15;
        t=new Thread(this,"warCamp");
        t.start();        
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
    public boolean repair() {
        return true;
    }
    
    public void mountArmy(String type,boolean mount,int n)
    {
        if(type=="Archer")
        {
            if(Barrack.archerPopulation>n)
                Barrack.transferArmyFromBarrack("Archer", "WarCamp", n);
        }
        else if(type=="Archer")
        {
            if(Barrack.archerPopulation>n)
                Barrack.transferArmyFromBarrack(type, "WarCamp", n);
        }else if(type=="Archer")
        {
            if(Barrack.archerPopulation>n)
                Barrack.transferArmyFromBarrack(type, "WarCamp", n);
        }else if(type=="Archer")
        {
            if(Barrack.archerPopulation>n)
                Barrack.transferArmyFromBarrack(type, "WarCamp", n);
        }
    }
    public void warCampEffectiveness() {
        archerEffectiveness=0;
        for(int i=0;i<Barrack.archerPopulation;i++) {
            {
                if(Barrack.Archer[i].areaAssignment=="WarCamp")archerEffectiveness+=Barrack.Archer[i].averageEffectiveness();
                if(Barrack.CrossBowman[i].areaAssignment=="WarCamp")crossBowmanEffectiveness+=Barrack.CrossBowman[i].averageEffectiveness();
                if(Barrack.Knight[i].areaAssignment=="WarCamp")knightEffectiveness+=Barrack.Knight[i].averageEffectiveness();
                if(Barrack.Swordsman[i].areaAssignment=="WarCamp")swordsmanEffectiveness+=Barrack.Swordsman[i].averageEffectiveness();
                if(Barrack.Muskeeter[i].areaAssignment=="WarCamp")muskeeterEffectiveness+=Barrack.Muskeeter[i].averageEffectiveness();
                if(Barrack.Pikeman[i].areaAssignment=="WarCamp")pikemanEffectiveness+=Barrack.Pikeman[i].averageEffectiveness();
            }
        }
        buildingEffectiveness=upgradeLevel*10+hitPoints;
        warCampEfficiency=archerEffectiveness+buildingEffectiveness+crossBowmanEffectiveness+knightEffectiveness
                        +swordsmanEffectiveness+muskeeterEffectiveness+pikemanEffectiveness;
    }

    public void run() {
        while(f.running()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
