import java.util.Arrays;
import java.util.Scanner;

public class AltUst {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        int ust=list[0];
        int tmp=0;

        System.out.print("Dizi : ");
        System.out.println(Arrays.toString(list));

        Arrays.sort(list);
        Scanner input=new Scanner(System.in);

        System.out.print("Bir sayı gir : ");
        int number=input.nextInt();

        for (int i : list){
            if(i>number){
               ust=i;
               break;
            }
        }
        tmp=Arrays.binarySearch(list,ust);


        System.out.println("Girilen sayıdan küçük en yakın sayı : " + list[tmp-1]);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + ust);

    }
}
