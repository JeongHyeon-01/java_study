interface CompareTool {
    public abstract int getMaxNum(int num1, int num2);
}

public class Practice {
    public static void main(String[] args) {
        CompareTool cTool = new CompareTool() {
            @Override
            public int getMaxNum(int num1, int num2) {
                return num1 > num2 ? num1 : num2 ;
            }
        };
        System.out.println(cTool.getMaxNum(1,2));
        System.out.println("===lambda===");
        CompareTool cTool2 = (num1, num2) -> {return num1 > num2 ? num1 : num2;};
        System.out.println(cTool2.getMaxNum(3,4));
    }
}
