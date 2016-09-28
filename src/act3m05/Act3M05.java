
package act3m05;

import java.util.Scanner;


public class Act3M05 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int i =10;
        System.out.println("En cuantas UF te vas a matricular?");
         int num1 = sc.nextInt();
         if(num1>=12){
         System.out.println("el preu de la matricula es 380 €");
    }
         if(num1<12 && num1 > 0){
         System.out.println("el preu de la matricula es de " + num1*30+" €");
         }
         if(num1==0 || num1 < 0){
          System.out.println("Per poder calcular el preu de la matricula el numero de UF's ha de ser mes gran o igual a 1");
    }
         
    }
    
}
