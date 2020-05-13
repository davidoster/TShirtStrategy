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
import tshirtstrategy.strategy.CardPaymentImpl;
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
        TShirt tShirt = new TShirt("AAA", Color.ORANGE, Size.XL, Fabric.LINEN, 0);
        IPayment payment  = new CardPaymentImpl();
        float price = payment.pay(tShirt.getPrice(), tShirt.getColor(), tShirt.getSize(), tShirt.getFabric());
        System.out.println("price: " + price);
        
       
    }
    
}
