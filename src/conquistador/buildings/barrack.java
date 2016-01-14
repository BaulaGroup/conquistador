/*
 * barrack.java
 *
 * Created on 10 January 2010, 10:23
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package conquistador.buildings;

import conquistador.army.*;
import conquistador.frame;
import conquistador.peasants;
import java.util.Random;

/**
 *
 * @author Administrator
 */
public class barrack extends buildings implements Runnable{
    public arsenal Arsenal;
    peasants Peasants;
    administration Administration;
    
    public archer[] Archer=new archer[1000];
    public swordsman[] Swordsman=new swordsman[1000];
    public muskeeter[] Muskeeter=new muskeeter[1000];
    public knight[] Knight=new knight[1000];
    public crossBowman[] CrossBowman=new crossBowman[1000];
    public pikeman[] Pikeman=new pikeman[1000];
    
    //public boolean productionHalt;
    public boolean onHold;
    public int monthlySpendings;
    public int maxPopulationSupport;
    
    public int archerPopulation=0;
    public int crossBowmanPopulation=0;
    public int swordsmanPopulation=0;
    public int muskeeterPopulation=0;
    public int knightPopulation=0;
    public int pikemanPopulation=0;

    public int greatestPopulation=archerPopulation;
    public int currentPopulation;
    
    public float archerEffectiveness=0;
    public float armyEffectiveness=0;
    public float buildingEffectiveness=0;
    public float barrackEfficiency;
    
    Thread t;
    Random random=new Random();
    /** Creates a new instance of barrack */
    public barrack(stockpile Stockpile,frame f,administration Administration,arsenal Arsenal,peasants Peasants,int st) {
        super("Barrack",Stockpile,f,900,900,900,5000,5);
        
        this.Administration=Administration;
        this.Peasants=Peasants;
        this.Arsenal=Arsenal;
                
        //this.addArmy(true,"Archer",st);
        onHold=true;
        maxPopulationSupport=500;
        currentPopulation=archer.population+crossBowman.population
                +swordsman.population+muskeeter.population
                +knight.population+pikeman.population;
        
        monthlySpendings=0;
        t=new Thread(this,"Barrack");
        t.start();
    }
    public boolean repair() {
        return true;
    }
    
    public void addArmy(String type,int n) {
        
        //if(!productionHalt){
        if(type=="Archer"){
            for(int i=0;i<n;i++) {
                if(Administration.Gold.stock>archer.wagePerMonthPerUnit
                        && currentPopulation<maxPopulationSupport
                        && Arsenal.Bow.stock>=1
                        && Peasants.jobless>=1) {
                    Archer[archer.population]=new archer(f,Arsenal.Gold);
                    archerPopulation++;
                    currentPopulation++;
                    if(greatestPopulation<archerPopulation)
                        greatestPopulation=archerPopulation;
                    Arsenal.addToArsenal(false,"Bow",1);
                    Peasants.assignJob(true,1);
                }
            }
            f.displayBarrack(this);
            f.armyAdded(true);
        }
        if(type=="CrossBowman"){
            for(int i=0;i<n;i++) {
                if(Gold.stock>crossBowman.wagePerMonthPerUnit
                        && currentPopulation<maxPopulationSupport
                        && Arsenal.CrossBow.stock>=1
                        && Peasants.jobless>=1) {
                    CrossBowman[crossBowman.population]=new crossBowman(f,Arsenal.Gold);
                    crossBowmanPopulation++;
                    currentPopulation++;
                    if(greatestPopulation<crossBowmanPopulation)
                        greatestPopulation=crossBowmanPopulation;
                    Arsenal.addToArsenal(false,"CrossBow",1);
                    Peasants.assignJob(true,1);
                }
            }
            f.armyAdded(true);
        }
        if(type=="Swordsman"){
            for(int i=0;i<n;i++) {
                if(Gold.stock>swordsman.wagePerMonthPerUnit
                        && currentPopulation<maxPopulationSupport
                        && Arsenal.SwordNArmour.stock>=1
                        && Peasants.jobless>=1) {
                    Swordsman[swordsman.population]=new swordsman(f,Arsenal.Gold);
                    swordsmanPopulation++;
                    currentPopulation++;
                    if(greatestPopulation<swordsmanPopulation)
                        greatestPopulation=swordsmanPopulation;
                    Arsenal.addToArsenal(false,"SwordNArmour",1);
                    Peasants.assignJob(true,1);
                }
            }
            f.armyAdded(true);
        }
        if(type=="Pikeman"){
            for(int i=0;i<n;i++) {
                if(Gold.stock>pikeman.wagePerMonthPerUnit
                        && currentPopulation<maxPopulationSupport
                        && Arsenal.Pike.stock>=1
                        && Peasants.jobless>=1) {
                    Pikeman[pikeman.population]=new pikeman(f,Arsenal.Gold);
                    pikemanPopulation++;
                    currentPopulation++;
                    if(greatestPopulation<pikemanPopulation)
                        greatestPopulation=pikemanPopulation;
                    Arsenal.addToArsenal(false,"Pike",1);
                    Peasants.assignJob(true,1);
                }
            }
            f.armyAdded(true);
        }
        if(type=="Knight"){
            for(int i=0;i<n;i++) {
                if(Gold.stock>knight.wagePerMonthPerUnit
                        && currentPopulation<maxPopulationSupport
                        && Arsenal.SwordNArmour.stock>=1
                        && Peasants.jobless>=1) {
                    Knight[knight.population]=new knight(f,Arsenal.Gold);
                    knightPopulation++;
                    currentPopulation++;
                    if(greatestPopulation<knightPopulation)
                        greatestPopulation=knightPopulation;
                    Arsenal.addToArsenal(false,"SwordNArmour",1);
                    Peasants.assignJob(true,1);
                }
            }
            f.armyAdded(true);
        }
        if(type=="Muskeeter"){
            for(int i=0;i<n;i++) {
                if(Gold.stock>muskeeter.wagePerMonthPerUnit
                        && currentPopulation<maxPopulationSupport
                        && Arsenal.Gun.stock>=1
                        && Peasants.jobless>=1) {
                    Muskeeter[muskeeter.population]=new muskeeter(f,Arsenal.Gold);
                    muskeeterPopulation++;
                    currentPopulation++;
                    if(greatestPopulation<muskeeterPopulation)
                        greatestPopulation=muskeeterPopulation;
                    Arsenal.addToArsenal(false,"Gun",1);
                    Peasants.assignJob(true,1);
                }
            }
            f.armyAdded(true);
        }
    }
    public void transferArmyFromBarrack(String type,String area,int n) {
        int auto=0;
        for(int i=0;i<n;i++){
            if(type=="Archer") {
                auto=random.nextInt(archerPopulation);
                while(Archer[auto].areaAssignment!="Barrack")
                    auto=random.nextInt(archerPopulation);
                Archer[auto].areaAssignment=area;
                archerPopulation--;
            } else if(type=="CrossBowman") {
                auto=random.nextInt(crossBowmanPopulation);
                while(CrossBowman[auto].areaAssignment!="Barrack")
                    auto=random.nextInt(archerPopulation);
                CrossBowman[auto].areaAssignment=area;
                crossBowmanPopulation--;
            } else if(type=="Knight") {
                auto=random.nextInt(knightPopulation);
                while(Knight[auto].areaAssignment!="Barrack")
                    auto=random.nextInt(archerPopulation);
                Knight[auto].areaAssignment=area;
                knightPopulation--;
            } else if(type=="Pikeman") {
                auto=random.nextInt(pikemanPopulation);
                while(Pikeman[auto].areaAssignment!="Barrack")
                    auto=random.nextInt(archerPopulation);
                Pikeman[auto].areaAssignment=area;
                pikemanPopulation--;
            } else if(type=="Muskeeter") {
                auto=random.nextInt(muskeeterPopulation);
                while(Muskeeter[auto].areaAssignment!="Barrack")
                    auto=random.nextInt(archerPopulation);
                Muskeeter[auto].areaAssignment=area;
                muskeeterPopulation--;
            } else if(type=="Swordsman") {
                auto=random.nextInt(swordsmanPopulation);
                while(Swordsman[auto].areaAssignment!="Barrack")
                    auto=random.nextInt(archerPopulation);
                Swordsman[auto].areaAssignment=area;
                swordsmanPopulation--;
            }
        }
    }
    public void killArmy(String type,int n) {
        int auto;
        for(int i=0;i<n;i++){
            if(type=="Archer") {
                auto=random.nextInt(archerPopulation);
                while(Archer[auto].areaAssignment!="Barrack")
                    auto=random.nextInt(archerPopulation);
                Archer[i].swap(Archer[archerPopulation]);
                archerPopulation--;
            }
        }
    }
    public void barrackEffectiveness() {
        archerEffectiveness=0;
        for(int i=0;i<archerPopulation;i++) {
            archerEffectiveness+=Archer[i].averageEffectiveness();            
        }
        buildingEffectiveness=upgradeLevel*10+hitPoints;
        barrackEfficiency=archerEffectiveness+buildingEffectiveness;
    }
    public void monthlyTrainingReport() {
        for(int i=0;i<greatestPopulation;i++) {
            if(archerPopulation<i) Archer[i].monthlyTrainingReport(upgradeLevel);
            if(knightPopulation<i) Knight[i].monthlyTrainingReport(upgradeLevel);
            if(muskeeterPopulation<i) Muskeeter[i].monthlyTrainingReport(upgradeLevel);
            if(pikemanPopulation<i) Pikeman[i].monthlyTrainingReport(upgradeLevel);
            if(crossBowmanPopulation<i) CrossBowman[i].monthlyTrainingReport(upgradeLevel);
            if(swordsmanPopulation<i) Swordsman[i].monthlyTrainingReport(upgradeLevel);
        }
    }
    public void calculateWages() {
        monthlySpendings=archerPopulation*archer.wagePerMonthPerUnit
                +crossBowmanPopulation*crossBowman.wagePerMonthPerUnit
                +swordsmanPopulation*swordsman.wagePerMonthPerUnit
                +pikemanPopulation*pikeman.wagePerMonthPerUnit
                +muskeeterPopulation*muskeeter.wagePerMonthPerUnit
                +knightPopulation*knight.wagePerMonthPerUnit;
        Administration.totalSpendingsPerMonthOnArmyWages+=monthlySpendings;
    }
    public void payWages() {
        if(Administration.Gold.stock>monthlySpendings) Administration.Gold.addToStock(false,monthlySpendings);
        else {
            Administration.Gold.stock=0;
            for(int i=0;i<greatestPopulation;i++) {
                if(archerPopulation<i) Archer[i].morale(5);
                if(knightPopulation<i) Knight[i].morale(5);
                if(muskeeterPopulation<i) Muskeeter[i].morale(5);
                if(pikemanPopulation<i) Pikeman[i].morale(5);
                if(crossBowmanPopulation<i) CrossBowman[i].morale(5);
                if(swordsmanPopulation<i) Swordsman[i].morale(5);
            }
        }
    }
    public void run() {
        while(f.running()) {
            try {
                this.calculateWages();
                this.payWages();
                this.barrackEffectiveness();
                Thread.sleep(2000);
                f.displayBarrack(this);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
