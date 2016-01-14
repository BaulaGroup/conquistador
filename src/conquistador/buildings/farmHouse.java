/*
 * ironExtractor.java
 *
 * Created on 10 January 2010, 10:22
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package conquistador.buildings;

import conquistador.frame;
import conquistador.peasants;


/**
 *
 * @author Administrator
 */
public class farmHouse extends buildings implements Runnable{
    public granary Granary;
    administration Administration;

    Thread t;
    
    peasants Peasants;
    
    int maxLabourerSupport;
    public int farmers;
    public int woodcutters;

    int monthlySpendingsPerPeasant;
    int monthlySpendings;
    int extractionRate;
    int monthlyFoodExtraction;
    int monthlyWoodExtraction;
    /** Creates a new instance of ironExtractor */
    public farmHouse(administration Administration,stockpile Stockpile,frame f,peasants Peasants,granary Granary) {
        super("FarmHouse",Stockpile,f,50,10,0,0,5);
        
        this.Peasants=Peasants;
        this.Granary=Granary;
        this.Administration=Administration;

        extractionRate=50;
        monthlyFoodExtraction=0;
        monthlyWoodExtraction=0;
        
        maxLabourerSupport=20;
        farmers=0;
        woodcutters=0;

        monthlySpendingsPerPeasant=3;
        monthlySpendings=0;
              
        t=new Thread(this,"FarmHouse");
        t.start();
    }
    public void construct() {
        if(Administration.Gold.stock>goldRequired
                && Stockpile.Stone.stock>stoneRequired
                &&Stockpile.Wood.stock>woodRequired)
        {            
            try {
                Thread.sleep(5000);
                } catch (InterruptedException ex) {
                ex.printStackTrace();
            }   
            Administration.Gold.addToStock(false,goldRequired);
            Stockpile.Stone.addToStock(false,stoneRequired);
            Stockpile.Wood.addToStock(false,woodRequired);
            
            f.constructionCompletion(true);
            f.displayStockpile(Stockpile); 
            t=new Thread(this,"FarmHouse");
        } else f.constructionCompletion(false);
    }
    public void upgrade() {
        if(Stockpile.Wood.stock>10 && Administration.Gold.stock>25 && upgradeLevel<maxUpgradeLevel) {
            Stockpile.addToStockpile(false,"Wood",woodRequired);
            Administration.Gold.addToStock(false,goldRequired);
            maxLabourerSupport+=20;
            extractionRate+=3;
            upgradeLevel++;
            monthlySpendingsPerPeasant++;
            f.constructionCompletion(true);
        } else f.constructionCompletion(false);
    }
    public void addLabourer(String type,boolean add,int n) {
        if(type=="Farmer" && Peasants.jobless>n)
        {
            Peasants.assignJob(true,n);
            farmers+=n;
            f.labourerAdded("Farmer",true);
        } else if(type=="" +
                "Woodcutter" && Peasants.jobless>n)
        {
            Peasants.assignJob(true,n);
            woodcutters+=n;
            f.labourerAdded("Woodcutter",true);
        }
    }
    public void run() {
        while(f.running()) {
            try {
                monthlySpendings=monthlySpendingsPerPeasant*(farmers+woodcutters);
                if(Administration.Gold.stock>monthlySpendings) {
                    Administration.Gold.addToStock(false,monthlySpendings);
                    monthlyFoodExtraction=extractionRate*farmers;
                    Granary.Food.addToStock(true,monthlyFoodExtraction);
                    monthlyWoodExtraction=extractionRate*farmers;
                    Stockpile.Wood.addToStock(true,monthlyWoodExtraction);
                } else f.displayProductionHalt("Farm House");
                Thread.sleep(2000);
                f.displayFarmHouse(this);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
