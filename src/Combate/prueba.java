package Combate;


import static Combate.Configuracion.ATAQUE_BUENO_USER01;
public class prueba {

    public static int barra_vida_user(int a){
        a = (int) (a * 20 / VIDA_USER);
        System.out.println("User:    [" + "#".repeat(a)  + " ".repeat(20 - a )  + "]");
        return a;
    }
    public static int barra_vida_boss(int a){
        a = (int) (a * 20 / VIDA_BOSS);
        System.out.println("User:    [" + "#".repeat(a)  + " ".repeat(20 - a )  + "]");
        return a;
    }

    public static final int VIDA_USER = 100; //constante de vida
    public static final int VIDA_BOSS = 100; //constante de vida
    
    public static void main(String[] args) {
        int vida_user = VIDA_USER;
        System.out.println("Vida de usuario : " + VIDA_USER);
        System.out.println(ATAQUE_BUENO_USER01);
        barra_vida_user(vida_user);

        vida_user -= ATAQUE_BUENO_USER01;
        System.out.println("El boss a atacado... 💥");
        barra_vida_user(vida_user);
    }

}
