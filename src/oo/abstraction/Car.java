package oo.abstraction;

public class Car {
	String brand;
	//屬性
    int cc;
    String name;
    String type; 
    int status;
    int id;
    float milage;
    //屬性
  //區域變數cc name
    public Car(String brand,int cc,String name,String type){
        this.brand=brand;
        this.cc=cc;
        this.name=name;
        this.type=type;
      	//local variable區域變數cc name
    }
    public void maintain(){
    	status = 5;
    	}
    public void setMilage(int m ){
    	
    	milage = m;
    }
    public float addMilage(int m ){
    	milage = milage + m;
    	if(m<0){
    		milage = milage-m;
    	}
    	return milage;
    }
}
