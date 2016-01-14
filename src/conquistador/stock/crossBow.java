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
public class crossBow {
    public int stock;    
    /** Creates a new instance of granary */
    public crossBow(int st) {
        stock=st;
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
