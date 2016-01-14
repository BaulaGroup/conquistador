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
public class quarry extends buildings implements Runnable{
    Thread t;
    administration Administration;
    peasants Peasants;
    
    public int stoneExtractors;
    int monthlySpendingsPerPeasant;
    int monthlySpendings;
    int extractionRate;
    int monthlyStoneExtraction;
    public int maxLabourerSupport;
    /** Creates a new instance of ironExtractor */
    public quarry(administration Administration,stockpile Stockpile,frame f,peasants Peasants) {
        super("Quarry",Stockpile,f,20,30,0,0,5);
        
        this.Peasants=Peasants;
        this.Administration=Administration;

        extractionRate=15;
        monthlyStoneExtraction=0;
        maxLabourerSupport=20;
        stoneExtractors=1;
        monthlySpendingsPerPeasant=4;
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
            t=new Thread(this,"Quarry");
            t.start();
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
    public void addLabourer(boolean add,int n)
    {
        if(add==true && Peasants.jobless>=n) {
            stoneExtractors+=n;
            Peasants.assignJob(true,n);
            f.labourerAdded("Mine",true);
        } else if(add==false) {
            stoneExtractors-=n;
            Peasants.assignJob(false,n);
            f.labourerAdded("Mine",true);
        }else {
            f.labourerAdded("Mine",false);
        }
    }
    public void run() {
        while(f.running()) {
            try {
                monthlySpendings=monthlySpendingsPerPeasant*stoneExtractors;
                if(Administration.Gold.stock>monthlySpendings) {
                    Administration.Gold.addToStock(false,monthlySpendings);
                    monthlyStoneExtraction=extractionRate*stoneExtractors;
                    Stockpile.addToStockpile(true,"Stone",monthlyStoneExtraction);
                }
                else f.displayProductionHalt("Stone");
                Thread.sleep(2000);
                f.displayQuarry(this);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
