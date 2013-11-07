package com.nsouls.carapps.Model;

import com.nsouls.carapps.Interface.*;
/**
 * Created with IntelliJ IDEA.
 * User: nsouls11
 * Date: 13. 11. 7
 * Time: 오후 6:49
 * To change this template use File | Settings | File Templates.
 */
public class Car {
    Tire tire;

    public Car(Tire tire) {
//        tire = new KoreaTire();
        this.tire = tire;
    }

    public String getTireBrand() {
        return "장착된 타이어: " + tire.getBrand();
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public Tire getTire() {
        return tire;
    }
}
