package com.company.subtask2;

public class SeaLogistics implements Logistics {
      public Transport createTransport (){
          return new Ship();
      }
}
