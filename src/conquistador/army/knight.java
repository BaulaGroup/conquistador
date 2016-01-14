package conquistador.army;

import conquistador.frame;
import conquistador.stock.gold;
import java.util.Random;
public class knight extends army{
    public static int population=0;
    public static int wagePerMonthPerUnit=8;
    public static int objectCount;

    public int archerId;

    public int growthFactor;

    Random random=new Random();

    public knight(frame f,gold Gold) {
        super(f,Gold,30,30,60,70);
        archerId=population;
        population++;
        objectCount++;
        Gold.addToStock(false,wagePerMonthPerUnit);

    }
    public void monthlyTrainingReport(int upgradeLevel) {
        if(!this.hero){
            growthFactor=random.nextInt(upgradeLevel);
            attack+=growthFactor;
            defence+=growthFactor;
            range+=growthFactor;
            mobility+=growthFactor;
            morale+=growthFactor;
        }
        else{
            growthFactor=upgradeLevel;
            attack+=growthFactor;
            defence+=growthFactor;
            range+=growthFactor;
            mobility+=growthFactor;
            morale+=growthFactor;
        }
    }
    public void morale(int m) {
        morale-=m;
    }
    public float averageEffectiveness() {
        if(!this.hero) averageEffectiveness=(attack+defence+morale+range+mobility)/5;
        else averageEffectiveness=(attack+defence+morale+range+mobility)/5*3;
        return averageEffectiveness;
    }
    public void swap(archer a)
    {
        attack=a.attack;
        defence=a.defence;
        range=a.range;
        mobility=a.mobility;
        morale=a.morale;
        experience=a.experience;
        hero=a.hero;
        areaAssignment=a.areaAssignment;
    }

}
