package Combate;

//Importo todas las constantes y funciones
import static Combate.Configuracion.*;



public class Combate {
   public static void main(String[] args) {
    int vida_actualizada_boss = vida_boss;
    int vida_actualizada_user = vida_user;
    
    //Texto para el subrayado
    String txt_Introduccion= "Introducción" ;
    String txt_Explicacion= "Explicación" ;

    System.out.println(ANSI_GREEN + txt_Introduccion + "\n" + SUBRAYA.repeat(txt_Introduccion.length()));
    System.out.println("\n\n¡El Instituto Cesur está en peligro! Hay un asesino que esta matando a"+
                        " instituto y solo tú y tus amigos podéis detenerlo.");
    System.out.println(txt_Explicacion + "\n" + SUBRAYA.repeat(txt_Explicacion.length())+
                        "\n\n¡El Instituto Cesur está en peligro! Hay un asesino que esta matando a instituto" +
                        " y solo tú y tus amigos podéis detenerlo." + ANSI_RESET);
   }
}
