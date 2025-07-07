public class CountNumbers {
    public static void main(String[] args) {
        int number=10;
        countNumber(number);
    }
    public static void countNumber(int number){
        int count=0;
        for(int i=0;i<number;i++){
            count++;
        }
        System.out.println(count);
    }

}
