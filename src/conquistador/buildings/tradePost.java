/*
 * stockpile.java
 *
 * Created on 06 January 2010, 18:49
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package conquistador.buildings;

import conquistador.frame;
import conquistador.stock.*;

/**
 *
 * @author Administrator
 */
public class tradePost extends buildings implements Runnable{
    administration Administration;
    public int Food;
    public int Stone;
    public int Iron;
    public int Wood;
    public int Copper;
    
    public int Bow;
    public int CrossBow;
    public int Pike;
    public int SwordNArmour;
    public int Gun;
    
    public int FoodCost;
    public int StoneCost;
    public int IronCost;
    public int WoodCost;
    public int CopperCost;
    
    public int BowCost;
    public int CrossBowCost;
    public int PikeCost;
    public int SwordNArmourCost;
    public int GunCost;
    public int custom;
    public int totalPrice;
    
    public int space;
    public int occupiedSpace;
    
    Thread t;
    /** Creates a new instance of stockpile */
    public tradePost(stockpile Stockpile,frame f,administration Administration) {
        super(f,500,100,100,0,5);
        
        this.f=f;
        this.Administration=Administration;
        
        Food=0;
        Stone=0;
        Iron=0;
        Wood=0;
        Copper=0;
        
        Bow=0;
        CrossBow=0;
        Pike=0;
        SwordNArmour=0;
        Gun=0;
              
        FoodCost=10;
        StoneCost=10;
        IronCost=10;
        WoodCost=10;
        CopperCost=10;
        
        BowCost=0;
        CrossBowCost=0;
        PikeCost=0;
        SwordNArmourCost=0;
        GunCost=0;
        
        space=100;
        occupiedSpace=0;
        
        t=new Thread(this,"TradePost");
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
    synchronized public void addToTrade(boolean add,String good,int n) {        
            if(good=="Food") Food++;
            else if(good=="Wood") Wood++;
            else if(good=="Iron") Iron++;
            else if(good=="Stone") Stone++;
            else if(good=="Bow") Bow++;
            else if(good=="CrossBow") CrossBow++;
            else if(good=="Pike") Pike++;
            else if(good=="SwordNArmour") SwordNArmour++;
            else if(good=="Gun") Gun++;        
    }
    public void upgrade() {
        if(Stockpile.Wood.stock>10 && Administration.Gold.stock>25 && upgradeLevel<maxUpgradeLevel) {
            Stockpile.addToStockpile(false,"Wood",woodRequired);
            Administration.Gold.addToStock(false,goldRequired);
            upgradeLevel++;
            space+=100;
            f.constructionCompletion(true);
        } else f.constructionCompletion(false);
    }
    public void changeCost(boolean increase)
    {
        
    }
    public int returnCalculation(String type,int n)
    {
        totalPrice=Food*FoodCost
                    +Wood*WoodCost+Stone*StoneCost+Iron*IronCost+Copper*CopperCost
                    +Bow*BowCost+CrossBow*CrossBowCost+Pike*PikeCost+SwordNArmour*SwordNArmourCost+Gun*GunCost;
        return totalPrice;
    }
    public void trade(boolean sell)
    {
        try {
            Thread.sleep(1000);
            totalPrice=Food*FoodCost
                    +Wood*WoodCost+Stone*StoneCost+Iron*IronCost+Copper*CopperCost
                    +Bow*BowCost+CrossBow*CrossBowCost+Pike*PikeCost+SwordNArmour*SwordNArmourCost+Gun*GunCost;
            if(sell) Administration.Gold.addToStock(true,totalPrice-200);
            else Administration.Gold.addToStock(false,totalPrice+200);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }        
    }
    public void run() {
    }
}
