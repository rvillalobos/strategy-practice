package com.iteso.strategy2.lifesavers;

import com.iteso.strategy2.Lifesaver;

import com.iteso.strategy.behaviors.impl.Deflatable;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/9/13
 * Time: 12:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class ArmBands extends Lifesaver {
    public ArmBands() {

        iDeflateBehavior = new Deflatable();
        type = "Arm bands";
    }

}
