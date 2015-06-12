package org.stocktrader.api;

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
