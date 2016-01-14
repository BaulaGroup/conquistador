/*
 * granary.java
 *
 * Created on 06 January 2010, 18:54
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
public class granary extends buildings implements Runnable{
    public food Food;
    
    public int space;

    public int consumptionRate;
    Thread t;
    /** Creates a new instance of granary */
    public granary(stockpile Stockpile,gold Gold,frame f,int st) {
        super(f,500,10,0,0,5);
        this.Gold=Gold;
        this.Stockpile=Stockpile;
        
        Food=new food(st);
        
        space=100;
        t=new Thread(this,"Granary");
        t.start();
        }        
    synchronized public void addToStockpile(boolean add,int n) {
        Food.addToStock(add,n);        
    }
    public void upgrade() {
        if(Stockpile.Wood.stock>10 && Gold.stock>25 && upgradeLevel<maxUpgradeLevel) {
            Stockpile.addToStockpile(false,"Wood",woodRequired);
            Gold.addToStock(false,goldRequired);                     
            upgradeLevel++;
            space+=100;
            f.constructionCompletion(true);
        } else f.constructionCompletion(false);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            
        } catch (InterruptedException ex) {            
        }
    }
}
