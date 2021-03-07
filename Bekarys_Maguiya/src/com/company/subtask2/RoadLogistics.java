package com.company.subtask2;

public class RoadLogistics implements Logistics {
       public Transport createTransport(){
           return new Truck();
       }
}
