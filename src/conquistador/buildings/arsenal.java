/*
 * arsenal.java
 *
 * Created on 06 January 2010, 18:53
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
public class arsenal extends buildings{
    public bow Bow;
    public crossBow CrossBow;
    public pike Pike;
    public swordNArmour SwordNArmour;
    public gun Gun;    
    
    public int space;
    /** Creates a new instance of arsenal */
    public arsenal(stockpile Stockpile,frame f,gold Gold,int st) {
        super("Arsenal",Stockpile,Gold,f,50,100,50,0,5);        
        
        Bow=new bow(st);
        CrossBow=new crossBow(st);
        Pike=new pike(st);
        SwordNArmour=new swordNArmour(st);
        Gun=new gun(st);
        
        space=100;
    } 
    public void construct()
    {        
        Stockpile.Wood.addToStock(false,woodRequired);
        Stockpile.Stone.addToStock(false,stoneRequired);
    }
    synchronized public void addToArsenal(boolean add,String good,int n) {
        if(good=="Bow") Bow.addToStock(add,n);
        else if(good=="CrossBow") CrossBow.addToStock(add,n);
        else if(good=="Pike") Pike.addToStock(add,n);
        else if(good=="SwordNArmour") SwordNArmour.addToStock(add,n);
        else if(good=="Gun") Gun.addToStock(add,n);
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
}
