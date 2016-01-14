package conquistador.army;

import conquistador.frame;
import conquistador.peasants;
import conquistador.stock.gold;
import java.util.Random;

public class army {
    gold Gold;
    frame f;
    
    public String name=new String(); 
    
    public int attack;
    public int defence;
    public int range;
    public int mobility;
    public int morale;
    public int age;
    public int warParticipated;
    public int experience;
    public boolean hero=false;
    public float averageEffectiveness;
    
    public String areaAssignment=new String();
    Random random=new Random();
    int r;
    public army() {
    }
    public army(frame f,gold Gold,int att,int def,int rng,int mob) {        
        this.f=f;
        this.Gold=Gold;
        
        r=random.nextInt(10);
        
        attack=att+r;
        defence=def+r;
        range=rng+r;
        mobility=mob+r;
        morale=80+r;
        experience=20+r;
        
        if(r==7) hero=true;
        
        areaAssignment="Barrack";
    }    
}
