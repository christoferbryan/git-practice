//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("This is a Java file for Git practice.");

        int[] myNum = {10, 20, 30, 40};

        for(int num : myNum){
            System.out.println(num);
        }

        for(int i=0; i<myNum.length; i++) {
            System.out.println(myNum[i] + 15);
        }

        System.out.println(areaRectangle(20,15));
    }

    static int areaRectangle(int length, int width){
        return length * width;
    }
}