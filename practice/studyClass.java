package sample;

public class studyClass {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5};
        String[] name = {"ㄱ","ㄴ","ㄷ","ㄹ","ㅁ"};
        int[] age = {21,22,23,24,25};
        int[] math = {90,95,94,92,93};
        int[] eng = {84,57,83,63,95};

        for(int i=0; i<number.length; i++){
            System.out.println(number[i] + ":" +name[i]+":총점 :"+(math[i]+eng[i]) );
        }

        Student[] stu = new Student[5];     // 객체화 하면 코드가 간편해진다
        stu[0] = new Student(1,"ㄱ",21,90,84);
        stu[1] = new Student(2,"ㄴ",22,95,57);
        stu[2] = new Student(3,"ㄷ",23,94,83);
        stu[3] = new Student(4,"ㄹ",24,92,63);
        stu[4] = new Student(5,"ㅁ",25,93,95);

        for(int i=0; i<stu.length; i++){
            stu[i].info();
        }
        int num = stu[0].getNumber();
        System.out.println(num);

    }
}
// private(개인적인), public(대중적인)


class Student{
    private int number;
    private String name;
    private int age;
    private int math;
    private int eng;

    public Student(){
    }

    public Student(int number, String name, int age, int math, int eng){
        this.number = number;
        this.name = name;
        this.age = age;
        this.math = math;
        this.eng = eng;
    }

    public void info(){
        System.out.println(name + ": 총점 :" + (math+eng) );
    }

    public int getNumber(){
        return number;
    }
}