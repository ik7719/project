import java.util.Scanner;

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

    public void stop(){

    }

    public void drive(){
        if(condition == BusCondition.Stop.condition){
            System.out.println("차고지행 상태입니다.");
            return;
        }

    }

    public void conditionChange(){
        if (oil < 10) {
            System.out.println("주유가 필요합니다");
            return ;
        }

    }

    public void ride(){
        if (passengerCurrent > passengerMax){
            return;
        }
        passengerCurrent++;
    }

    public void speedChange(){
        if (oil < 10){
            System.out.print("주유량을 확인해 주세요");
            return;
        }
        Scanner scan = new Scanner(System.in);
        int plusSpeed = scan.nextInt();
        speed += plusSpeed;
    }
}
