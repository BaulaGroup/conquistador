/*
 * administration.java
 *
 * Created on 10 January 2010, 10:23
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package conquistador.buildings;

import conquistador.frame;
import conquistador.stock.gold;
import java.util.Random;
/**
 *
 * @author Administrator
 */
public class monuments extends buildings implements Runnable{
    administration Administration;

    int fareIncome;
    
    public int popularity;
    public int totalVisitors;
    public gold Gold;
    
    frame f;    
    Thread t;
    
    Random random=new Random();
    /** Creates a new instance of administration */
    /** Creates a new instance of administration */
    public monuments(stockpile Stockpile,frame f,administration Administration) {
        super("Monuments",Stockpile,f,1000,1000,1000,5000,5);
        this.f=f;        
        this.Administration=Administration;       
        
        popularity=100;
        
        t=new Thread(this,"Administration");
        t.start();
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
    public void run() {
        while(f.running()) {
            try {
                totalVisitors=(random.nextInt(10)%5+5)*100;
                fareIncome=totalVisitors*2;
                Administration.Gold.addToStock(true,fareIncome);
                Administration.popularity+=10;
                Thread.sleep(2000);
                //f.displayMonuments(this);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
