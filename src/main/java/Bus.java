import java.util.Scanner;

public class Bus {
    private int passengerMax;
    private int passengerCurrent;
    private int fee;
    private int busNumber;
    private int oil;
    private int speed;
    private BusCondition condition;

    public Bus(){
        this.passengerMax = 20;
        this.passengerCurrent = 0;
        this.fee = 1000;
        this.busNumber = 5530;
        this.oil = 20;
        this.speed = 0;
    }

    public void drive(){
        if(condition == BusCondition.차고지행 || oil < 10){
            return;
        }
        condition = BusCondition.운행;
    }

    public void conditionChange(){
        if (oil < 10) {
            condition = BusCondition.차고지행;
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
