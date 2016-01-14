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
import conquistador.stock.gold;

/**
 *
 * @author Administrator
 */
public class mineExtractor extends buildings implements Runnable{
    Thread t;
    administration Administration;
    peasants Peasants;
    
    public int currentLabourerNumber;
    public int ironExtractors;
    public int copperExtractors;
    
    int monthlySpendingsPerPeasant;
    public int monthlySpendings;
    
    int extractionRate;
    public int monthlyIronExtraction;
    public int monthlyCopperExtraction;
    
    int maxLabourerSupport;
    /** Creates a new instance of ironExtractor */
    public mineExtractor(administration Administration,stockpile Stockpile,frame f,peasants Peasants) {
        super("MineExtractor",Stockpile,f,20,50,0,0,5);
        
        this.Peasants=Peasants;
        this.Administration=Administration;
        extractionRate=10;
        maxLabourerSupport=20;
        currentLabourerNumber=1;
        monthlySpendingsPerPeasant=5;
        monthlySpendings=0;              
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
            //this.addArmy("Archer",10);
            f.constructionCompletion(true);
            f.displayStockpile(Stockpile); 
            t=new Thread(this,"MineExtractor");
            t.start();
        } else f.constructionCompletion(false);
    }
    public void upgrade() {
        if(Stockpile.Wood.stock>10 && Administration.Gold.stock>50 && upgradeLevel<maxUpgradeLevel) {
            Stockpile.addToStockpile(false,"Wood",woodRequired);
            Administration.Gold.addToStock(false,goldRequired);
            maxLabourerSupport+=20;
            extractionRate+=2;
            upgradeLevel++;
            monthlySpendingsPerPeasant++;
            f.constructionCompletion(true);
        } else f.constructionCompletion(false);
    }
    public void addLabourer(String type,boolean add,int n)
    {
        if(type=="IronExtractors" && Peasants.jobless>n)
        {
            Peasants.assignJob(true,n);
            ironExtractors+=n;
            f.labourerAdded("Mine",true);
        } else if(type=="CopperExtractors" && Peasants.jobless>n)
        {
            Peasants.assignJob(true,n);
            copperExtractors+=n;
            f.labourerAdded("Mine",true);
        }
    }
    public void run() {
        while(f.running()) {
            try {
                monthlySpendings=monthlySpendingsPerPeasant*currentLabourerNumber;
                if(Administration.Gold.stock>monthlySpendings) {
                    Administration.Gold.addToStock(false,monthlySpendings);
                    monthlyIronExtraction=extractionRate*ironExtractors;
                    Stockpile.addToStockpile(true,"Iron",monthlyIronExtraction);
                    monthlyCopperExtraction=extractionRate*copperExtractors;
                    Stockpile.Copper.addToStock(true,monthlyCopperExtraction);
                }
                else f.displayProductionHalt("Iron");
                Thread.sleep(2000);
                f.displayMineExtractor(this);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
