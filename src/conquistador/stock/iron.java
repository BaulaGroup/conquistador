/*
 * granary.java
 *
 * Created on 10 January 2010, 10:39
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package conquistador.stock;

/**
 *
 * @author Administrator
 */
public class iron {
    public int stock;    
    /** Creates a new instance of granary */
    public iron(int st) {
        stock=st*100;
    }
    synchronized public boolean addToStock(boolean add,int s) {
        if(add) {
            stock+=s;
            return true;
        }        
        else if(add==false && stock>s) {
            stock-=s;
            return true;
        }
        else return false;
    }
}
