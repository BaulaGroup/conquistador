/*
 * state.java
 *
 * Created on 10 January 2010, 12:08
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package conquistador;

import conquistador.buildings.*;

/**
 *
 * @author Administrator
 */
public class state {

    String name;
    public boolean player;
    int status;
    public frame f;
    public peasants Peasants;
    public administration Administration;
    public granary Granary;
    public stockpile Stockpile;
    public arsenal Arsenal;
    public mineExtractor MineExtractor;
    public quarry Quarry;
    public farmHouse FarmHouse;
    public barrack Barrack;
    public castle Castle;
    public weaponIndustry WeaponIndustry;
    public monuments Monument;
    public warCamp WarCamp;
    public tradePost TradePost;
    /** Creates a new instance of state */
    public state(String s, int status, boolean player) {
        name = s;
        this.status = status;
        //this.f=f;
        f=new frame();
        Peasants = new peasants(status);
        Administration = new administration(f, Peasants, status);
        Stockpile = new stockpile(f, Administration.Gold, status);
        Granary = new granary(Stockpile, Administration.Gold, f, status);
        Arsenal = new arsenal(Stockpile, f, Administration.Gold, status);
        MineExtractor=new mineExtractor( Administration,Stockpile, f, Peasants);
        Quarry=new quarry( Administration,Stockpile, f, Peasants);
        FarmHouse=new farmHouse(Administration,Stockpile,f,Peasants,Granary);
        Barrack = new barrack(Stockpile, f, Administration, Arsenal, Peasants, status);
        Castle=new castle(Stockpile,f,Administration.Gold,status,Barrack);
        WeaponIndustry=new weaponIndustry(Administration,Stockpile,f,Peasants,Arsenal);
        Monument=new monuments(Stockpile,f,Administration);
        WarCamp=new warCamp(Stockpile,f,Administration.Gold);
        TradePost=new tradePost(Stockpile,f,Administration);
        if(player) {
            f.setVisible(true);
            
            
        }
    }
   
}
