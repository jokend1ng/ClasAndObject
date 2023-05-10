
public class Main {
    public static void main(String[] args) {

        Counter counter=new Counter();
        for (int i=0;i<100;i++){
            counter.getHonestAndOdd(i);
        }
        System.out.println("Четные числа: "+ counter.honest);
        System.out.println("Нечетные числа: "+ counter.odd);
    }
}