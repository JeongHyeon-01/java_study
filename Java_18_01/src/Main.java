public class Main {
    public static void soultion(int num) {
        int reversNum = 0;
        boolean isMinus = false;
        if (num <0) {
            isMinus = true;
            num *= -1;
        }
        while(num >0){
            int r = num % 10;
            num /= 10;
            reversNum = reversNum *10 + r;
        }
        System.out.println(isMinus ? reversNum* -1 : reversNum);
    }
    public static void main(String[] args) {
        soultion(12345);
        soultion(-12345);
        soultion(100);
        soultion(0);
    }
}