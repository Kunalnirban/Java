package conditional;

public class loops {
    public static void main(String[] args) {
        //for
        for (int i = 0; i < 6; i++) {
            System.out.println(i);
        }

        //while
        int i = 0;
        while (i < 10){
            System.out.println(i);
            i++;
        }

        //doWhile
        i=0;
        do{
            System.out.println(i);
            i+=2;
        }while (i<10);

        //forEach
        int arr[] = new int[]{2, 4, 5, 10};
        for(int a:arr){
            System.out.println(arr);
        }

    }
}
