/*
 * weaponIndustry.java
 *
 * Created on 06 January 2010, 18:47
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package conquistador.buildings;

import conquistador.frame;
import conquistador.peasants;
//import conquistador.administration.*;

/**
 *
 * @author Administrator
 */
public class weaponIndustry extends buildings implements Runnable {
    administration Administration;
    peasants Peasants;
    arsenal Arsenal;

    public int bowConstructors;
    public int crossBowConstructors;
    public int swordNArmourConstructors;
    public int pikeConstructors;

    public int bowConstructionRate;
    public int crossBowConstructionRate;
    public int pikeConstructionRate;
    public int swordNArmourConstructionRate;
    public int totalProduction;

    public int maxLabourerSupport = 20;
    public int currentLabourerNumber = 0;
    int monthlySpendingsPerPeasant;
    int monthlySpendings;

    public int monthlyBowProdudtion;
    Thread t;

    /** Creates a new instance of weaponIndustry */
    public weaponIndustry(administration Administration, stockpile Stockpile, frame f, peasants Peasants, arsenal Arsenal) {
        super("WeaponIndustry", Stockpile,f, 50, 10, 0, 0, 5);
        this.Peasants = Peasants;
        this.Arsenal = Arsenal;
        this.Administration=Administration;

        woodRequired = 200;
        goldRequired = 5000;
        stoneRequired = 0;

        currentLabourerNumber = 0;

        bowConstructors = 0;
        crossBowConstructors = 0;
        swordNArmourConstructors = 0;
        pikeConstructors = 0;

        monthlySpendingsPerPeasant = 3;
        monthlySpendings = 0;
    }

    public void construct() {
        if (Administration.Gold.stock > goldRequired
                && Stockpile.Stone.stock > stoneRequired
                && Stockpile.Wood.stock > woodRequired)
        {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            Administration.Gold.addToStock(false, goldRequired);
            Stockpile.Stone.addToStock(false, stoneRequired);
            Stockpile.Wood.addToStock(false, woodRequired);
            //this.addArmy("Archer",10);
            f.constructionCompletion(true);
            f.displayStockpile(Stockpile);
            t = new Thread(this, "WeaponIndustry");
            t.start();
        } else {
            f.constructionCompletion(false);
        }
    }

    public void addLabourer(String type, boolean add, int n) {
        if (add) {
            if (type == "Bow" && Peasants.jobless > n) {
                Peasants.assignJob(true, n);
                bowConstructors += n;
                f.labourerAdded("Weapon",true);
            }
            if (type == "CrossBow" && Peasants.jobless > n) {
                Peasants.assignJob(true, n);
                crossBowConstructors += n;
                f.labourerAdded("Weapon",true);
            }
            if (type == "Pike" && Peasants.jobless > n) {
                Peasants.assignJob(true, n);
                pikeConstructors += n;
                f.labourerAdded("Weapon",true);
            }
            if (type == "SwordNArmour" && Peasants.jobless > n) {
                Peasants.assignJob(true, n);
                swordNArmourConstructors += n;
                f.labourerAdded("Weapon",true);
            }
        } else {
            if (type == "Bow" && Peasants.jobless > n) {
                Peasants.assignJob(false, n);
                bowConstructors -= n;
                f.labourerAdded("Weapon",false);
            }
            if (type == "CrossBow" && Peasants.jobless > n) {
                Peasants.assignJob(false, n);
                crossBowConstructors -= n;
                f.labourerAdded("Weapon",false);
            }
            if (type == "Pike" && Peasants.jobless > n) {
                Peasants.assignJob(false, n);
                pikeConstructors-= n;
                f.labourerAdded("Weapon",false);
            }
            if (type == "SwordNArmour" && Peasants.jobless > n) {
                Peasants.assignJob(false, n);
                swordNArmourConstructors-= n;
                f.labourerAdded("Weapon",false);
            }
        }
    }

    public void run() {
        while(f.running()) {
            try {
                monthlySpendings=monthlySpendingsPerPeasant*currentLabourerNumber;
                if(Administration.Gold.stock>monthlySpendings) {
                    Administration.Gold.addToStock(false,monthlySpendings);
                    totalProduction=10*bowConstructors;
                    Arsenal.Bow.addToStock(true,totalProduction);
                    totalProduction=10*crossBowConstructors;
                    Arsenal.CrossBow.addToStock(true,totalProduction);
                    totalProduction=10*pikeConstructors;
                    Arsenal.Pike.addToStock(true,totalProduction);
                    totalProduction=10*swordNArmourConstructors;
                    Arsenal.SwordNArmour.addToStock(true,totalProduction);
                }
                else f.displayProductionHalt("Weapon Industry");
                Thread.sleep(2000);
                f.displayWeaponIndustry(this);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
