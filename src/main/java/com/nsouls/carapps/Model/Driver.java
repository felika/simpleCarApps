package com.nsouls.carapps.Model;

import com.nsouls.carapps.Interface.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: nsouls11
 * Date: 13. 11. 7
 * Time: 오후 6:51
 * To change this template use File | Settings | File Templates.
 */
public class Driver {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("/src/main/java/com.nsouls.carapps/context/expert.xml");
        Tire tire = (Tire)context.getBean("tire");
        Car car = (Car)context.getBean("car");
        car.setTire(tire);

//        Tire tire = new KoreaTire();
//        Car car = new Car(tire);

        System.out.println(car.getTireBrand());
    }
}
