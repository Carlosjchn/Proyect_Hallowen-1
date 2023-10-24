package Combate;


import static Combate.Configuracion.ATAQUE_BUENO_USER01;

import java.util.Scanner;
public class prueba {

    
    
    public static int vida;
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe Resultado prueba 1 : ");
        vida = sc.nextInt();
        int vida_user= vida;
        
        barra_vida_user(vida);
        System.out.println("Vida user " + vida);
        vida_user -= ATAQUE_BUENO_USER01;
        System.out.println("Boss ataca y quita un " + ATAQUE_BUENO_USER01 + "ps");
        barra_vida_user(vida_user);
        sc.close();
    }
    
    public static int barra_vida_user(int a){
        a = (int) (a * 10 / vida);
        System.out.println("User:    [" + "#".repeat(a)  + " ".repeat(10 - a )  + "]");
        return a;
    }
    
}
