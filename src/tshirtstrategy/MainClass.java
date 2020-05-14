/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tshirtstrategy;

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
        IPayment cardPayment  = new CardPaymentImpl();
        float price = cardPayment.pay(tShirt.getPrice(), tShirt.getColor(), tShirt.getSize(), tShirt.getFabric());
        System.out.println("price by Card Payment: " + price);
        
        IPayment bankPayment = new BankPaymentImpl();
        price = bankPayment.pay(tShirt.getPrice(), tShirt.getColor(), tShirt.getSize(), tShirt.getFabric());
        System.out.println("price by Bank Payment: " + price);
        
        IPayment cashPayment = new CashPaymentImpl();
        price = cashPayment.pay(tShirt.getPrice(), tShirt.getColor(), tShirt.getSize(), tShirt.getFabric());
        System.out.println("price by Cash Payment: " + price);
        
       
    }
    
}
