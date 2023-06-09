package sample;

public class inherit1 {
    public static void main(String[] args) {

        dog[] dog = new dog[10];
        cat[] cat = new cat[10];
        snake[] snake = new snake[10];

        for (int i = 0; i < 10; i++) {
            dog[i] = new dog();
            cat[i] = new cat();
            snake[i] = new snake();
        }

        animal[] animal = new animal[10];
        animal[0] = new dog();
        animal[1] = new dog();
        animal[2] = new dog();
        animal[3] = new dog();
        animal[4] = new cat();
        animal[5] = new cat();
        animal[6] = new cat();
        animal[7] = new cat();
        animal[8] = new snake();
        animal[9] = new snake();

        for (int i = 0; i < animal.length; i++) {
            animal[i].proc();

            if (animal[i] instanceof dog) {
                dog d = (dog) animal[i];
                d.dogMethod();
            } else if (animal[i] instanceof cat) {
                cat c = (cat) animal[i];
                c.catMethod();
            } else if (animal[i] instanceof snake) {
                snake s = (snake) animal[i];
                s.snakeMethod();
            }
        }
    }

    static class animal {
        int age;
        String name;

        public void method() {
            System.out.println(name + " " + age + "살");
        }

        public void proc() {
            System.out.println("동물 소리를 내는 중...");
        }
    }

    static class dog extends animal {
        public void proc() {
            System.out.println("멍멍멍!!");
        }

        public void dogMethod() {
            System.out.println("dogMethod");
        }
    }

    static class cat extends animal {
        public void proc() {
            System.out.println("야옹야옹~");
        }

        public void catMethod() {
            System.out.println("catMethod");
        }
    }

    static class snake extends animal {
        public void proc() {
            System.out.println("눈눈");
        }

        public void snakeMethod() {
            System.out.println("snakeMethod");
        }
    }
}
