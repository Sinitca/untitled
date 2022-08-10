
    public class Tasks {
        public static void main(String[] args) {
            int a = -1;
            int b = 100;

            int random_number = a + (int) (Math.random() * b);
            System.out.println("случайное число: " + random_number);

            int i = random_number;
            int x = 2;

            int n = (i >> x);
            System.out.println("переменная n в двоичном виде: " + n);

            int[] array_m1 = new int[10];
            int[] array_m2 = new int[10];
            for(int j = i; n <= i; i++ ){
                if((i % n)==0) {
                    System.out.print(array_m1[i] + " ");
                }else if((i % n) !=0){
                    System.out.print(array_m2[i] + " ");

                }
            }



        }



    }

}
