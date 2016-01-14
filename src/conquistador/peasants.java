/*
 * peasants.java
 *
 * Created on 10 January 2010, 10:41
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package conquistador;

/**
 *
 * @author Administrator
 */
public class peasants {

    public int population;
    public int jobless;

    /** Creates a new instance of peasants */
    public peasants(int st) {
        population = st * 100;
        jobless = 50;
    }

    synchronized public void addPeasants(boolean add, int n) {
        if (add) {
            population += n;
            //jobless += n;
        } else if (add = false && population > n) {
            population -= n;
            jobless -= n;
        }
    }

    synchronized public void assignJob(boolean assign, int n) {
        if (assign == true) {
            jobless -= n;
        } else if (assign == true && jobless>n) {
            jobless = 0;
        } else if (!assign) {
            jobless += n;
        }
    }
}
