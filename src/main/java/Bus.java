import java.util.Scanner;
import java.util.UUID;

public class Bus {
    private int passengerMax;
    private int passengerCurrent;
    private int fee;
    private String busNumber;
    private int oil;
    private int speed;
    private BusCondition condition;
    private String uuid = UUID.randomUUID().toString();

    public Bus(int oil, int speed, int passengerMax, int passengerCurrent){
        this.passengerMax = passengerMax;
        this.passengerCurrent = passengerCurrent;
        this.fee = 1000;
        this.oil = oil;
        this.speed = speed;
        this.busNumber = uuid;
    }

    public void drive(){
        if(condition == BusCondition.차고지행 || oil < 10){
            condition = BusCondition.차고지행;
            System.out.println("버스는 현재 " + condition + "중이므로 탑승이 불가능합니다.");
            return;
        }
        condition = BusCondition.운행;
        System.out.println("버스는 현재 " + condition + "중 입니다.");
    }

    public void conditionChange(){
        if (oil < 10) {
            condition = BusCondition.차고지행;
            System.out.println("주유가 필요합니다");
            return ;
        }
    }

    public void ride(){
        if (passengerCurrent > passengerMax || oil < 10){
            System.out.println("현재 정원 초과로 탑승이 불가능합니다.");
            return;
        }
        passengerCurrent++;
        System.out.println("현재 탑승객은 " + passengerCurrent + "명 입니다.");
    }

    public void speedChange(){
        if (oil < 10){
            System.out.print("주유량을 확인해 주세요");
            return;
        }
        System.out.println("버스의 현재 속도는 " + speed + "km/h 입니다.");
        Scanner scan = new Scanner(System.in);
        int plusSpeed = scan.nextInt();
        speed += plusSpeed;
        System.out.println("버스의 현재 속도는 " + speed + "km/h 입니다.");
    }
}
