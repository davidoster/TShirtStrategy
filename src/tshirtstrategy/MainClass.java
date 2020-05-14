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
//        Context cardPaymentContext = new Context(new CardPaymentImpl());
//        float price1 = cardPaymentContext.executePayment(tShirt.getPrice(), tShirt.getColor(), tShirt.getSize(), tShirt.getFabric());
//        System.out.println("price by Card Payment: " + price1);
//        
//        Context bankPaymentContext = new Context(new BankPaymentImpl());
//        float price2 = bankPaymentContext.executePayment(tShirt.getPrice(), tShirt.getColor(), tShirt.getSize(), tShirt.getFabric());
//        System.out.println("price by Bank Payment: " + price2);
//        
//        Context cashPaymentContext = new Context(new CashPaymentImpl());
//        float price3 = cashPaymentContext.executePayment(tShirt.getPrice(), tShirt.getColor(), tShirt.getSize(), tShirt.getFabric());
//        System.out.println("price by Cash Payment: " + price3);
        
        System.out.println(" // ----------- //");
        IPayment p[] = new IPayment[] {new CardPaymentImpl(), new BankPaymentImpl(), new CashPaymentImpl()};
        List<IPayment> payments = Arrays.asList(p);   // new ArrayList<>();
        HashMap<String, Float> allPayments = new HashMap<>();
        Context contextAll = new Context(payments);
        allPayments = contextAll.executePayments(tShirt.getPrice(), tShirt.getColor(), tShirt.getSize(), tShirt.getFabric());
        
        allPayments.entrySet().forEach(
            entry->
            {
                System.out.println(entry.getKey() + " Price: " + entry.getValue());  
            });
        
        
        System.out.println(" // ----------- //");
//        float price = 0;
//        IPayment cardPayment  = new CardPaymentImpl();
//        price = cardPayment.pay(tShirt.getPrice(), tShirt.getColor(), tShirt.getSize(), tShirt.getFabric());
//        System.out.println("price by Card Payment: " + price);
//        
//        IPayment bankPayment = new BankPaymentImpl();
//        price = bankPayment.pay(tShirt.getPrice(), tShirt.getColor(), tShirt.getSize(), tShirt.getFabric());
//        System.out.println("price by Bank Payment: " + price);
//        
//        IPayment cashPayment = new CashPaymentImpl();
//        price = cashPayment.pay(tShirt.getPrice(), tShirt.getColor(), tShirt.getSize(), tShirt.getFabric());
//        System.out.println("price by Cash Payment: " + price);
        
       
    }
    
}
