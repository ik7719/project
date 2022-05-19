import java.util.Scanner;
public class Taxi {
    private int taxiNumber;
    private int fuel;
    private double currentSpeed;
    private String goal;
    private double distance;
    private double goalDistance;
    private int fee;
    private int distanceFee;
    private condition taxiCondition;

    public Taxi(int taxiNumber, int fuel, double currentSpeed, double distance, double goalDistance, int fee, int distanceFee){
        this.taxiNumber = taxiNumber;
        this.fuel = fuel;
        this.currentSpeed = currentSpeed;
        this.goal = "영월";
        this.distance = distance;
        this.goalDistance = goalDistance;
        this.fee = fee;
        this.distanceFee = distanceFee;
        taxiCondition = condition.일반;
    }

    public void drive(){
        if(fuel < 10){
            System.out.println("주유량이 부족해 운행이 불가능합니다.");
            System.exit(0);
        }
    }

    public void ride(){
        if(taxiCondition == condition.일반 ){
            taxiCondition = condition.운행중;
            System.out.println(taxiNumber + "번 운행을 시작합니다.");
        } else {
            System.out.println("탑승 불가");
            System.exit(0);
        }
    }

    public void speedChange(){
        System.out.println("현재 속도는 " + currentSpeed + "km/h 입니다." + "추가하고 싶은 속도를 입력해주세요.");

        Scanner scan = new Scanner(System.in);
        double speedPlus = scan.nextDouble();
        currentSpeed += speedPlus;

        System.out.println("현재 속도는 " + currentSpeed + "km/h 입니다.");
    }

    public void addFee(){
        if(distance < goalDistance){
            fee += distanceFee;
        }
    }

    public void payFee(){
        System.out.println("최종 요금은 " + fee + "원 입니다.");
    }
}
