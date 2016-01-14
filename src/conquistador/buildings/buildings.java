package conquistador.buildings;

import conquistador.frame;
import conquistador.stock.gold;
public class buildings {
    public String name;
    public stockpile Stockpile;
    public gold Gold;
    public frame f;
    public int woodRequired;
    public int goldRequired;
    public int stoneRequired;
    public int hitPoints;
    public int maxUpgradeLevel;
    public int upgradeLevel;
    public buildings() {
    }
    public buildings(String name,stockpile Stockpile,gold Gold,frame f,int wr,int gr,int sr,int hp,int mul) {
        this.name=name;
        this.Gold=Gold;
        this.Stockpile=Stockpile;
        this.f=f;
        
        woodRequired=wr;
        goldRequired=gr;
        stoneRequired=sr;
        hitPoints=hp;
        maxUpgradeLevel=mul;
        upgradeLevel=1;
                
    }
    public buildings(String name,stockpile Stockpile,frame f,int wr,int gr,int sr,int hp,int mul) {
        this.name=name;
        this.Stockpile=Stockpile;
        this.f=f;

        woodRequired=wr;
        goldRequired=gr;
        stoneRequired=sr;
        hitPoints=hp;
        maxUpgradeLevel=mul;
        upgradeLevel=1;

    }
    public buildings(frame f,int wr,int gr,int sr,int hp,int mul) {
        this.f=f;
        woodRequired=wr;
        goldRequired=gr;
        stoneRequired=sr;
        hitPoints=hp;
        maxUpgradeLevel=mul;
        upgradeLevel=1;
    }
}
