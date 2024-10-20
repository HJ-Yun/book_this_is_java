package chapter_06;

import CarExample.TypeA.*;
import CarExample.TypeC.Engine;
import CarExample.TypeB.*;
import CarExample.TypeA.Tire;

public class _19_Car {
    Engine myEngine = new Engine();
    SnowTire mySnowTire = new SnowTire();
    BigTire myBigTire = new BigTire();

    //Tire myTire1 = new Tire(); //Error TypeA? or TypeB?
    //Tire myTire2 = new Tire(); //Error TypeA? or TypeB?

    //Method
    Tire myTire1 = new Tire(); //import CarExample.TypeA.Tire;
    CarExample.TypeB.Tire myTire2 = new CarExample.TypeB.Tire(); //Exact Path

}
