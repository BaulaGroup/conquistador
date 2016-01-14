/*
 * gold.java
 *
 * Created on 12 January 2010, 16:43
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package conquistador.stock;

/**
 *
 * @author Administrator
 */
public class gold {
    public int stock;
    /** Creates a new instance of gold */
    public gold(int st) {
        stock=st*1000;
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
