/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tshirtstrategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import tshirtstrategy.models.Color;
import tshirtstrategy.models.Fabric;
import tshirtstrategy.models.Size;
import tshirtstrategy.models.TShirt;
import tshirtstrategy.strategy.BankPaymentImpl;
import tshirtstrategy.strategy.CardPaymentImpl;
import tshirtstrategy.strategy.CashPaymentImpl;
import tshirtstrategy.strategy.IPayment;

/**
 *
 * @author mac
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TShirt tShirt = new TShirt("AAA", Color.ORANGE, Size.XL, Fabric.LINEN,11);
       
        System.out.println(" // ----------- //");
        List<IPayment> payments = Arrays.asList(new IPayment[] {new CardPaymentImpl(), new BankPaymentImpl(), new CashPaymentImpl()});   // new ArrayList<>();
        HashMap<String, Float> allPayments = new HashMap<>();
        Context contextAll = new Context(payments);
        allPayments = contextAll.executePayments(tShirt.getPrice(), 
          tShirt.getColor(), tShirt.getSize(), tShirt.getFabric());
        
        /*
            from HashMap<String, Float> tht is filled from executePayments....
            we ask for a Set which contains a
            Map<String, Float>
            On this Map we call forEach in order to iterate within the Map
            Map.forEach returns an entry within the Map
        
        */
        
        allPayments.entrySet().forEach(
            entry->
            {
                System.out.println(entry.getKey() + " Price: " + entry.getValue());  
            });
        
        
        System.out.println(" // ----------- //");
       
    }
    
}
