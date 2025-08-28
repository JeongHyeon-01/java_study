public class Main {
    public static void solution(int a, int type){
        if (type ==1) {
            type1(a);
        } else if (type==2) {
            type2(a);
        } else if (type==3) {
            type3(a);
        } else if (type ==4) {
            type4(a);
        } else if (type == 5) {
            type5(a);
        }
    }

    public static void type1(int a){
        System.out.println("Main.type1");
        for (int i=0; i< a; i++){
            for (int j=0; j<a; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void type2(int a){
        System.out.println("Main.type2");
        for (int i=0; i < a; i++) {
            for (int j = 0; j < i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void type3(int a){
        System.out.println("Main.type3");
        for (int i=0; i < a; i++) {
            for (int j = 0; j < a; j++){
                if (j < a - i -1) {
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void type4(int a){
        System.out.println("Main.type4");
        for (int i=0; i < a; i++) {
            for (int j = 0; j < a -i -1; j++) {
                System.out.print(" ");
            }
            for (int j =0; j< i*2 +1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void type5(int a){
        System.out.println("Main.type5");
//        상단부
        for (int i = 0; i <= a/2; i++) {
            for (int j = 0; j < a/2 -i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");

            }
            System.out.println();
//      하단부
        }
        for (int i = a/2; i > 0 ; i--) {
            for (int j = 0; j < a/2 + 1 -i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        solution(3 ,1);
        solution(3 ,2);
        solution(3 ,3);
        solution(3 ,4);
        solution(7 ,5);
    }

}