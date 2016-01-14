/*
 * mission1.java
 *
 * Created on 11 February 2010, 18:07
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package conquistador.campaigns.beginings;

import conquistador.state;

/**
 *
 * @author Administrator
 */
public class mission1 {
    
    /** Creates a new instance of mission1 */
    public mission1() {
    }
    public boolean missionCompletion(state s)
    {
        if(s.Barrack.archerPopulation>=100
        && s.Barrack.crossBowmanPopulation==60
        && s.Barrack.knightPopulation==60
        && s.Barrack.muskeeterPopulation==30
        && s.Barrack.pikemanPopulation==100
        && s.Barrack.swordsmanPopulation==80)
        return true;
        else return false;
        //return true;
    }

}
