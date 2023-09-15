import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int exit = 0;
        int number;
        ArrayList<Integer> arrayListNumbers = new ArrayList<>();
        int suma;
        int total = 0;
        double media;
        do{
            System.out.println("Introduce un numero diferente de 0(cierra el programa): ");
            number = sc.nextInt();
            arrayListNumbers.add(number);
            suma = totalSumaArray(arrayListNumbers, total);
            media = calculoMedia(arrayListNumbers, suma);

        } while(number != exit);

        System.out.println("La suma total de los numeros introducidos es de: " + suma);
        System.out.println("La media de los numeros introducidos es de: " + media);
        numMasGrandeMedia(arrayListNumbers, media);
        System.out.println("El programa ha finalizado!");
    }

    static int totalSumaArray(ArrayList<Integer> arrayList, int total){
        for (Integer num : arrayList) total += num;
        return total;
    }

    static double calculoMedia(ArrayList<Integer> arrayList, int total){
        return (double) total / arrayList.size();
    }

    static void numMasGrandeMedia(ArrayList<Integer> arrayList, double media){
        System.out.println("Los numeros mayores a la media son:");
        for (Integer num : arrayList) {
            if (num > media) {
                System.out.println(num);
            }
        }
    }
}