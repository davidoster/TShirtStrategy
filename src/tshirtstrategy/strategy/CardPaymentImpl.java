/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tshirtstrategy.strategy;

import tshirtstrategy.models.Color;
import tshirtstrategy.models.Fabric;
import tshirtstrategy.models.Size;

/**
 *
 * @author mac
 */
public class CardPaymentImpl implements IPayment {

    @Override
    public float pay(float basePrice, Color color, Size size, Fabric fabric) {
        float result = basePrice;
        // implementation via Cards
        result += color.getColorPrice(color.ordinal());
        result += size.getSizePrice(size.ordinal());
        result += fabric.getFabricPrice(fabric.ordinal());
        result *= 1.1f; // change to 10%
        return result;
    }
    
}
