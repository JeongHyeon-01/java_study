public class Main {
    public static void main(String[] args) {
        //1.반복문 - for
        //1-1 기본 사용

        for (int i = 0; i<5; i++) {
            System.out.println("i = " + i);
        }

        for (int i = 0; i<5; i++) {
            for (int j = 0; j < i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i<5; i++) {
            if (i==2) {
                continue;
            }
            for (int j = 0; j < i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i<5; i++) {
            if (i==2) {
                break;
            }
            for (int j = 0; j < i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //1-2 for each
        int[]nums = {1,2,3,4,5};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.println();
        for (int num : nums){
            System.out.println(num);
        }

        //2.반복문 - while
        //2-1 while
        int i = 0;
        while(i < 5) {
            System.out.println(i++);
        }
        System.out.println();
        i =0;
        while(i<5){
            if(i==2){
                i++;
                continue;
            }
            System.out.println(i++);
        }
        System.out.println();
        i =0;
        while(i<5){
            if(i==2){
                i++;
                break;
            }
            System.out.println(i++);
        }
        //2-2 do - while // 무조건 한번은 실행
        boolean knock = false;
        do {
            System.out.println("knock");
        }while(knock);

        //연습문제
        //1 3 5 7 로 증가하면서 * 찍기
        System.out.println();
        for (int j = 0; j < 8; j++) {
            if (j % 2 == 1){
                continue;
            }
            for (int k = 0; k < j+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //반복물을 실행할때마다 물온도를 1도씩 올리고 100도가 되면 종료 10도 마다 온도를 출력
        System.out.println();
        int waterTemperature = 0;
        while (waterTemperature < 100) {
            waterTemperature++;
            if (waterTemperature % 10 == 0) {
                System.out.println("waterTemperature : " + waterTemperature);
            }

        }

    }
}