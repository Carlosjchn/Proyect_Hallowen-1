package Combate;

import static Combate.Configuracion.*;

import java.util.Scanner;

public class Hpuser {
    public static void Separador(){
        System.out.println(ANSI_PURPLE+"====================================================================="+ANSI_RESET);
    }

    public static void main(String args[]) throws InterruptedException{
        String eleccion;
        boolean buc=false;
        int vidaUser=100;
        String TXT_BIENVENIDA= "BIENVENIDO AL MINIJUEGO";
        String TXT_EXPLICACION= "EXPLICACIÓN" ;
        Scanner sc=new Scanner(System.in);
            Separador();
            System.out.println(ANSI_PURPLE + TXT_BIENVENIDA + "\n" + SUBRAYA.repeat(TXT_BIENVENIDA.length())+ ANSI_RESET);
            
            System.out.println("\n"+ANSI_BLUE + TXT_EXPLICACION + "\n" + SUBRAYA.repeat(TXT_EXPLICACION.length()));
            System.out.println(ANSI_BLUE+"Vas a entrar en una historia interactiva.\nPara continuar leyendo simplemente presiona ENTER.\nDebes elegir las opciones posibles, siempre que elijas otra cosa no valdrá para nada.");
            Separador();
            continuar(sc);
            Separador();
            System.out.println(ANSI_BLUE+"Despiertas en una habitación oscura.\nLa escasa luz que puedes ver proviene de unos orificios en las paredes, que parecen ser de piedra antigua, el lugar en el que te encuentras huele a una mezcla entre humedad y moho..."+ANSI_RESET);
            sc.nextLine();
            System.out.println(ANSI_BLUE+"Entre el silencio y la oscuridad crees escuchar unos jadeos sin mucha fuerza, preguntas si hay alguien ahí, pero no recibes respuesta. \n\nTe levantas desorientado, siguiendo la pared con la mano, en busca de alguna puerta o interruptor. Tras darle un par de vueltas a la habitación, por fin consigues tocar lo que parece ser una caja de fusibles. Accionas todos los interruptores que consigues tocar, hasta que logras que se encienda una pequeña bombilla sin lámpara, que cuelga en el centro de la habitación."+ANSI_RESET);
            sc.nextLine();
            System.out.println(ANSI_BLUE+"Bajo la escasa luz que emite la bombilla, una anciana se encuentra luchando por respirar, tiene varios orificios en el torso, del que brota sangre oscura y espesa, utiliza sus pocas fuerzas para señalarte un viejo armario. \n\nTambién ves un perro de gran tamaño, pero muy desnutrido, encadenado a una gruesa viga de metal. Al otro extremo de la habitación, hay un comedero con comida a rebosar, pero no está al alcance del perro."+ANSI_RESET);
            Separador();
            sc.nextLine();
            
            while(!buc){    
            System.out.println(ANSI_PURPLE+"¿Donde te diriges?"+ANSI_PURPLE+"\n \t (A)-Te diriges al comedero \t(B)-Te diriges al armario"+ANSI_RESET);
            eleccion=sc.nextLine().toLowerCase();
            
            switch(eleccion){
                case "a","comedero":
                    System.out.println(ANSI_PURPLE+"(A)-Estás muy hambriento, y te comes la comida del perro \t (B)-Coges el comedero y se lo acercas al perro. \t (C)-Decides no hacer nada."+ANSI_RESET);
                        eleccion=sc.nextLine().toLowerCase();
                        switch(eleccion){
                            case "a","comer":
                                limpiarPantalla();
                                Separador();
                                System.out.println(ANSI_BLUE+"Al comer esa basura, sacias un poco tu hambre."+ANSI_GREEN+"\n\t\t\t(Recuperas un poco de salud)"+ANSI_RESET);
                                Separador();
                                vidaUser=vidaUser+5;
                            break;
                            case "b","comedero":
                                limpiarPantalla();
                                Separador();
                                System.out.println(ANSI_BLUE+"El perro muy asustado te muerde. Provocándote una herida en el antebrazo."+ANSI_GREEN+"\n\t\t\t(Pierdes puntos salud)"+ANSI_BLUE+"\nTe ves obligado a estrangular al perro con su propia cadena hasta asfixiarlo"+ANSI_RESET);
                                Separador();
                                vidaUser=vidaUser-15;
                            break;
                            case "c","nada":
                                limpiarPantalla();
                                Separador();
                                System.out.println(ANSI_BLUE+"No ocurre absolutamente nada."+ANSI_RESET);
                                Separador();
                            break;
                            default:
                                System.out.println(ANSI_RED+"\t\t\tCREO QUE TE HAS EQUIVOCADO DE OPCION"+ANSI_RESET);
                                System.out.println(ANSI_PURPLE+"(A)-Estás muy hambriento, y te comes la comida del perro \t (B)-Coges el comedero y se lo acercas al perro. \t (C)-Decides no hacer nada."+ANSI_RESET);
                                eleccion=sc.nextLine();
                        }
                    buc=true;
                break;
                case "b","armario":
                    limpiarPantalla();
                    Separador();
                    System.out.println(ANSI_BLUE+"Abres el armario, y ves que hay una botella muy antigua con la etiqueta desgastada, no consigues leer lo que pone. Parece una especie de elixir elaborado a mano. \nCuando la anciana te ve con la botella en la mano, se le ilumina la mirada y te hace un gesto con la mano para que se la des."+ANSI_RESET);
                    Separador();
                    System.out.println(ANSI_PURPLE+"\n \t(A)-Le das la botella a la anciana \t (B)-Te bebes tú la botella"+ANSI_RESET);
                    eleccion=sc.nextLine().toLowerCase();
                        switch(eleccion){
                            case "a":
                                limpiarPantalla();
                                Separador();
                                System.out.println(ANSI_BLUE+"La anciana la bebe y se muere, era"+ANSI_RED+" veneno..."+ANSI_RESET);
                                System.out.println(ANSI_GREEN+"\t\t\t(Tu salud aumenta por la buena decision)"+ANSI_RESET);
                                Separador();
                                vidaUser=vidaUser+10;
                            break;
                            case "b":
                                limpiarPantalla();
                                Separador();
                                System.out.println(ANSI_BLUE+"Al poco tiempo, empiezas a tener fiebre, vomitas sangre y se te nubla la visión"+ANSI_RESET);
                                System.out.println(ANSI_GREEN+"\t\t\t(Tu salud disminuye bastante)"+ANSI_RESET);
                                Separador();
                                vidaUser=vidaUser-25;
                            break;
                            default:

                        }
                    buc=true;
                break;
                default:
                System.out.println(ANSI_RED+"\t\t\tESE NO ES NINGUN CAMINO, NO PUEDES ATRAVESAR PAREDES"+ANSI_RESET);
                break;
            }
        }
        continuar(sc);
        buc=false;
    
        Separador();
        System.out.println(ANSI_BLUE+"La bombilla que luchaba por mantenerse encendida, finalmente se apaga, sumiendo la habitación en la oscuridad más absoluta, y comienzas a escuchar lo que parece ser un gas al otro lado de la pared, y notas que entra por los orificios de la pared de roca."+ANSI_RESET);
        sc.nextLine();
        System.out.println(ANSI_BLUE+"Empiezas a marearte, te esfuerzas por no perder el conocimiento... Sin darte cuenta, ya estás en el suelo sumiéndote en un profundo y forzado sueño."+ANSI_RESET);
        Separador();
        continuar(sc);
        Thread.sleep(1000);
        while(!buc){


        }
            System.out.println(ANSI_BLUE+"");






    }
}
