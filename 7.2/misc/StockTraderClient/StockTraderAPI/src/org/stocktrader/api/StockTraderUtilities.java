/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.stocktrader.api;

/**
 *
 * @author gail
 */
public class StockTraderUtilities {
    private static SampleTableModel stm = null;
    
    public static SampleTableModel getSampleTableModel() {
        if (stm == null){
            return stm = new SampleTableModel();
        } else {
            return stm;
        }
    }
    
}
