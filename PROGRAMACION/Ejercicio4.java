import java.util.Random;

import java.util.Arrays;

public class Ejercicio4 {



    public static void main(String[] args) {

       int num;

       int[] primitiva = new int[6];

       Random aleatorio = new Random();

        for (int i = 0; i < 6; i++) {

            do {

                num=aleatorio.nextInt(49)+1;

                

            } while (Comprobador(primitiva, num));

            

            primitiva[i]=num;

        }

        Arrays.sort(primitiva);

        System.out.println("El numero ganador es: "+Arrays.toString(primitiva));

        

    }

    public static boolean Comprobador(int [] array,int num){

        boolean esta = false;

        for (int i = 0; i < array.length && !esta; i++) {

            if (array[i]==num)

                esta = true;

        }

        

        return esta;

    

    System.out.println("Enhorabuena");
System.out.println("Modificacion de rama1 ");



}

}