package com.company.subtask3;

public class Housebuilder {
    int wall;
    int door;
    int window;
    int roof;
    boolean garagee;
    boolean swimpooll;
    boolean statues;
    boolean gardenn;
    public Housebuilder buildwalls(int walls){
        this.wall =walls;
        return this;
    }
    public Housebuilder builddoors(int doors){
        this.door =doors;
        return this;
    }
    public Housebuilder buildwindows(int windows){
        this.window =windows;
        return this;
    }
    public Housebuilder buildroof(int roof){
        this.roof=roof;
        return this;
    }
    public Housebuilder hasGarage(boolean garage){
        this.garagee=garage;
        return this;
    }
    public Housebuilder hasStatues(boolean statues){
        this.statues=statues;
        return this;
    }
    public Housebuilder hasGarden(boolean garden){
        this.gardenn =garden;
        return this;
    }
    public Housebuilder hasSwimpooll(boolean swimpooll){
        this.swimpooll =swimpooll;
        return this;
    }
    public House build(){
        House house=new House();
        house.setWalls(wall);
        house.setDoors(door);
        house.setWindows(window);
        house.setRoof(roof);
        house.setGarage(garagee);
        house.setSwimpool(swimpooll);
        house.setStatues(statues);
        house.setGarden(gardenn);
        return house;
     }
}

