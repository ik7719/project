public class Bus {
    int passengerMax;
    int passengerCurrent;
    int fee;
    int bus1;
    int oil;
    int speed;
    String condition;

    public void main(){
        passengerMax = 20;
        passengerCurrent = 0;
        fee = 1000;
        bus1 = 5530;
        oil = 0;
        speed = 0;
        condition = "운행";
    }

    public void drive(BusCondition Driving, BusCondition Stop){
        if(condition == BusCondition.Driving.condition){

        }

        System.out.println(BusCondition.Driving.toString());

    }

    public void conditionChange(){

    }

    public void ride(){

    }

    public void speedChange(){

    }
}
