public class Counter {
    int honest;
    int odd;
    void getHonestAndOdd(int number){
        if (number%2==0) {
            honest++;
        }else{
            odd++;
        }
    }
}
