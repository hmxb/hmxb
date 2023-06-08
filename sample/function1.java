package sample;

public class function1 {
    public static void main(String[] args) {
        int arr[] = {11, 22, 33};
        int arrNum[] = arr;
        arrNum[1] = 20;
        System.out.println(arr[1]);

        int num = 123;
        valueFunc(num);
        System.out.println("num = " + num);

        int[] numArr = {11, 22, 33};
        addressFunc(numArr);
        for(int i=0; i<numArr.length; i++){
            System.out.println(numArr[i]);
        }
    }



    static void valueFunc(int num1){
        num1 = 234;
        System.out.println("num1 = " + num1);
    }
    static void addressFunc(int arr[]){
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i] + 10;
        }
    }
}
