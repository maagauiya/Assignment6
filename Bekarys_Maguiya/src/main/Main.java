package main;
import com.company.subtask1.*;
import com.company.subtask2.*;
import com.company.subtask3.*;
public class Main {

    public static void main(String[] args) {
    	//SUBTASK 1
	Database foo=Database.getInstance();
	foo.query("select *from user1");
		System.out.println("========================");
	Database bar=Database.getInstance();
	bar.query("select *from user1");
	    //SUBTASK 2
          Logistics logistics=new SeaLogistics();//RoadLogistics()
          Transport transport=logistics.createTransport();
          transport.deliver();
		//SUBTASK 3
         House house=new Housebuilder()
                         .buildwalls(4)
                         .builddoors(2)
                         .buildroof(1)
                         .buildwindows(5)
                         .hasGarage(true)
                         .hasGarden(false)
                         .hasStatues(true)
                         .hasSwimpooll(false)
                         .build();
        System.out.println(house);

    }
}

