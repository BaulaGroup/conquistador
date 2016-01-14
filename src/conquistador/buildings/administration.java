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
import conquistador.peasants;
import conquistador.stock.gold;
import java.util.Random;
/**
 *
 * @author Administrator
 */
public class administration extends buildings implements Runnable{
    public int taxRate;
    
    public int taxIncome;
    public int customIncome;
    public int travelingFareIncome;
    public int tradeIncome;
    public int totalExpectedIncome;
    
    public int totalSpendingsPerMonthOnLabourWages;
    public int totalSpendingsPerMonthOnArmyWages;
    public int additionalSpendings;
    public int totalExpectedSpendings;
    
    public int popularity;
    public int populationGrowthRate;
    
    public peasants Peasants;
    
    public gold Gold;
    frame f;
    Thread t;
    
    Random random=new Random();
    /** Creates a new instance of administration */
    /** Creates a new instance of administration */
    public administration(frame f,peasants Peasants,int st) {
        this.f=f;
        this.Peasants=Peasants;
        
        Gold=new gold(st);
        
        taxRate=0;
        popularity=100;
        populationGrowthRate=10;
        
        t=new Thread(this,"Administration");
        t.start();
    }
    public void run() {
        while(f.running()) {
            try {
                taxIncome=taxRate*Peasants.population;
                Gold.addToStock(true,taxIncome);
                
                if(taxRate>0) popularity-=taxRate;
                
                if(2*Peasants.jobless>=Peasants.population){
                    if(popularity>0) popularity-=1;
                } else {
                    if(popularity<100) popularity+=1;
                }
                if(popularity>=80) {
                    Peasants.addPeasants(true,populationGrowthRate);
                } else if(popularity<50 && Peasants.population>0) {
                    Peasants.addPeasants(false,50-popularity);
                }
                if(popularity<=0) popularity=0;
                customIncome=random.nextInt(10)*20;
                Gold.addToStock(true,customIncome);
                f.displayAdministration(this);
                Thread.sleep(2000);
                totalSpendingsPerMonthOnLabourWages=0;
                totalSpendingsPerMonthOnArmyWages=0;
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
