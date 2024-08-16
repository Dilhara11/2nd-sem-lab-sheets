package Time;

public class Main {
    public static void main(String[] args){
        Time time = new Time();
        System.out.println("Hour: " + time.getHour() + "\nMinute: " + time.getMinute() + "\nSecond: " + time.getSecond());
        System.out.println("\n---------------------------------------------\n");
        Time time2 = new Time(22);
        System.out.println("\n---------------------------------------------\n");
        System.out.println("Hour: "+time2.getHour()+"\nMinute: " + time2.getMinute()+"\nSecond: "+time2.getSecond());
        Time time3 = new Time(16, 30);
        System.out.println("\n---------------------------------------------\n");
        System.out.println("Hour: "+time3.getHour()+"\nMinute: " + time3.getMinute()+"\nSecond: "+time3.getSecond());
        System.out.println("\n---------------------------------------------\n");
        Time time4 = new Time(14, 45, 30);
        System.out.println("\n---------------------------------------------\n");
        System.out.println("Hour: "+time4.getHour()+"\nMinute: " + time4.getMinute()+"\nSecond: "+time4.getSecond());
        System.out.println("\n---------------------------------------------\n");
        Time time5 = new Time(time);
        System.out.println("\n---------------------------------------------\n");
        System.out.println("Hour: "+time5.getHour()+"\nMinute: " + time5.getMinute()+"\nSecond: "+time5.getSecond());
        System.out.println("\n---------------------------------------------\n");



    }
}
