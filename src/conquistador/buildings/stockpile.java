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
public class stockpile extends buildings{
    public stone Stone;
    public iron Iron;
    public wood Wood;
    public copper Copper;
    
    public int space;
    /** Creates a new instance of stockpile */
    public stockpile(frame f,gold Gold,int st) {
        super(f,500,100,100,0,5);
        
        Stone=new stone(st);
        Iron=new iron(st);
        Wood=new wood(st);
        Copper=new copper(st);
        
        this.f=f;
        this.Gold=Gold;
        
        space=5000;        
    }
    synchronized public void addToStockpile(boolean add,String good,int n) {
        if(good=="Stone") Stone.addToStock(add,n);
        else if(good=="Iron") Iron.addToStock(add,n);
        else if(good=="Wood") Wood.addToStock(add,n);
    }
    public void upgrade() {
        if(Wood.stock>10 && Gold.stock>25 && upgradeLevel<maxUpgradeLevel) {
            this.addToStockpile(false,"Wood",woodRequired);
            Gold.addToStock(false,goldRequired);                     
            upgradeLevel++;
            space+=100;
            f.constructionCompletion(true);
        } else f.constructionCompletion(false);
    }
}
