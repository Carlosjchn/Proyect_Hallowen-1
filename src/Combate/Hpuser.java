package Combate;

import static Combate.Configuracion.*;

import java.util.Scanner;

import java.util.Random;


public class Hpuser {

    public static void Imprimir2(String text){
        int i;
        for(i = 0; i < text.length(); i++){
            System.out.printf("%c", text.charAt(i));
        try{
            Thread.sleep(1000);
        }catch(InterruptedException ex1){
            Thread.currentThread().interrupt();
        }
        }
        }

    public static void Separador(){
        System.out.println(ANSI_PURPLE+"======================================================================================"+ANSI_RESET);
    }

    public static void Imprimir(String text){
        int i;
        for(i = 0; i < text.length(); i++){
            System.out.printf("%c", text.charAt(i));
        try{
            Thread.sleep(0);
        }catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
        }
    }

    public static void Estructura(String mensaje){
        limpiarPantalla();
        Separador();
        Imprimir(mensaje+"\n");
        Separador();
    }
    public static void Estructura2(String mensaje){
        Separador();
        Imprimir(mensaje+"\n");
        Separador();
    }
    
    
    public static void main(String args[]) throws InterruptedException{

        Random aleatorio = new Random();

        String calavera=ANSI_CYAN+"           ______\r\n" + //
                "        .-\"      \"-.\r\n" + //
                "       /            \\\r\n" + //
                "      |              |\r\n" + //
                "      |,  .-.  .-.  ,|\r\n" + //
                "      | )(__/  \\__)( |\r\n" + //
                "      |/     /\\     \\|           "+ANSI_PURPLE+"PUERTA ESQUELETO"+ANSI_CYAN+"\r\n" +//
                "      (_     ^^     _)\r\n" + //
                "       \\__|IIIIII|__/\r\n" + //
                "        | \\IIIIII/ |\r\n" + //
                "        \\          /\r\n" + //
                "         `--------`\r\n"+ANSI_RESET;
        String angel=ANSI_CYAN+"        _ === _\r\n" + //
                "       / \\(_)/ \\\r\n" + //
                "       | /   \\ |\r\n" + //
                "       | \\\\ // |\r\n" + //
                "       \\_/   \\_/                 "+ANSI_PURPLE+"PUERTA ANGEL"+ANSI_CYAN+"\r\n" +  //
                "   .--\" /     \\ `\"-.\r\n" + //
                "  (   ( '.___.'   ,')\r\n" + //
                "   (__,-.       )--'\r\n" + //
                "      '.____)--'\r\n"+ANSI_RESET;
        String estrella=ANSI_CYAN+"         ______\r\n" + //
                "     .-'`  /\\  `'-.\r\n" + //
                "   .'_____/__\\_____`.\r\n" + //
                "  / `._  /    \\  _.` \\\r\n" + //
                " |     `/      \\'     |           "+ANSI_PURPLE+"PUERTA ESTRELLA"+ANSI_CYAN+"\r\n"+ //
                " |     / `-..-' \\     |\r\n" + //
                "  \\   /  .-'`-.  \\   /\r\n" + //
                "   `./.-'      `-.\\.'\r\n" + //
                "     `-..______..-'\r\n"+ANSI_RESET;


        String eleccion=null;
        String eleccion2=null;
        boolean buc=false;
        int vidaUser=0;
        String TXT_BIENVENIDA= "BIENVENIDO AL MINIJUEGO";
        String TXT_EXPLICACION= "EXPLICACIÓN" ;
        Scanner sc=new Scanner(System.in);

        

        Separador();
        System.out.println(ANSI_PURPLE + TXT_BIENVENIDA + "\n" + SUBRAYA.repeat(TXT_BIENVENIDA.length())+ ANSI_RESET);
        
        System.out.println("\n"+ANSI_BLUE + TXT_EXPLICACION + "\n" + SUBRAYA.repeat(TXT_EXPLICACION.length()));
        System.out.println(ANSI_BLUE+"Vas a entrar en una historia interactiva.\n\nDebes elegir las opciones posibles, siempre que elijas otra cosa no valdrá para nada.\n\nPara continuar leyendo simplemente presiona ENTER."+ANSI_RESET);

        Separador();
        continuar(sc);
        
            Estructura(ANSI_BLUE+"Despiertas en una habitación oscura. La escasa luz que puedes ver proviene de unos orificios en las paredes, que parecen ser de piedra antigua, el lugar en el que te encuentras huele a una mezcla entre humedad y moho... \n\nEntre el silencio y la oscuridad crees escuchar unos jadeos sin mucha fuerza, preguntas si hay alguien ahí, pero no recibes respuesta.\n\nTe levantas desorientado, siguiendo la pared con la mano, en busca de alguna puerta o interruptor. Tras darle un par de vueltas a la habitación, por fin consigues tocar lo que parece ser una caja de fusibles. Accionas todos los interruptores que consigues tocar, hasta que logras que se encienda una pequeña bombilla sin lámpara, que cuelga en el centro de la habitación.\n\nBajo la escasa luz que emite la bombilla, una anciana se encuentra luchando por respirar, tiene varios orificios en el torso, del que brota sangre oscura y espesa, utiliza sus pocas fuerzas para señalarte un viejo armario.\nTambién ves un perro de gran tamaño, pero muy desnutrido, encadenado a una gruesa viga de metal. Al otro extremo de la habitación, hay un comedero con comida a rebosar, pero no está al alcance del perro."+ANSI_RESET);
            
            while(!buc){
            if(eleccion2==null){
            System.out.println(ANSI_PURPLE+"¿Donde te diriges?\n \t (A)-Te diriges al comedero \t(B)-Te diriges al armario"+ANSI_RESET);
            eleccion=sc.nextLine().toLowerCase();
            }
                switch(eleccion){
                    case "a","comedero":
                        System.out.println(ANSI_PURPLE+"(A)-Estás muy hambriento, y te comes la comida del perro \t (B)-Coges el comedero y se lo acercas al perro. \t (C)-Decides no hacer nada."+ANSI_RESET);
                        eleccion2=sc.nextLine().toLowerCase();
                        buc=true;
                            switch(eleccion2){
                                case "a","comer":
                                    Estructura(ANSI_BLUE+"Al comer esa basura, sacias un poco tu hambre."+ANSI_RESET);
                                    vidaUser=vidaUser+5;
                                break;
                                case "b","perro":
                                    Estructura(ANSI_BLUE+"El perro muy asustado te muerde. Provocándote una herida en el antebrazo."+ANSI_BLUE+"\nTe ves obligado a estrangular al perro con su propia cadena hasta asfixiarlo"+ANSI_RESET);
                                    vidaUser=vidaUser-15;
                                break;
                                case "c","nada":
                                    Estructura(ANSI_BLUE+"No ocurre absolutamente nada."+ANSI_RESET);
                                break;
                                default:
                                    System.out.println(ANSI_RED+"\t\t\tCREO QUE TE HAS EQUIVOCADO DE OPCION"+ANSI_RESET);
                                    buc=false;
                                
                            }
                        
                    break;
                    case "b","armario":
                        Estructura(ANSI_BLUE+"Abres el armario, encuentras una anciana en muy mal estado... y ves que hay una botella muy antigua con la etiqueta desgastada, no consigues leer lo que pone. Parece una especie de elixir elaborado a mano. \nCuando la anciana te ve con la botella en la mano, se le ilumina la mirada y te hace un gesto con la mano para que se la des."+ANSI_RESET);

                        System.out.println(ANSI_PURPLE+"\n \t(A)-Le das la botella a la anciana \t (B)-Te bebes tú la botella"+ANSI_RESET);
                        eleccion2=sc.nextLine().toLowerCase();
                        buc=true;
                            switch(eleccion2){
                                case "a":
                                    Estructura(ANSI_BLUE+"La anciana la bebe y se muere, era"+ANSI_RED+" veneno..."+ANSI_RESET);
                                    vidaUser=vidaUser+
                                    10;
                                break;
                                case "b":
                                    Estructura(ANSI_BLUE+"Al poco tiempo, empiezas a tener fiebre, vomitas sangre y se te nubla la visión"+ANSI_RESET);
                                    vidaUser=vidaUser-25;
                                break;
                                default:
                                    System.out.println(ANSI_RED+"\t\t\tCREO QUE TE HAS EQUIVOCADO DE OPCION"+ANSI_RESET);
                                    buc=false;
                                
                            }
                    break;
                    default:
                    System.out.println(ANSI_RED+"\t\t\tESE NO ES NINGUN CAMINO, NO PUEDES ATRAVESAR PAREDES"+ANSI_RESET);
                    break;
                }
            
        }
        continuar(sc);
        buc=false;
    
        Estructura(ANSI_BLUE+"La bombilla que luchaba por mantenerse encendida, finalmente se apaga, sumiendo la habitación en la oscuridad más absoluta, y comienzas a escuchar lo que parece ser un gas al otro lado de la pared, y notas que entra por los orificios de la pared de roca."+ANSI_BLUE+"\n\nEmpiezas a marearte, te esfuerzas por no perder el conocimiento... Sin darte cuenta, ya estás en el suelo sumiéndote en un profundo y forzado sueño."+ANSI_RESET);
        continuar(sc);
        Imprimir2(".....\n");
        Estructura(ANSI_BLUE+"Una luz pálida de gran intensidad te obliga a abrir los ojos, estás semiconsciente, lo suficiente para darte cuenta de que estas encadenado en una silla en una sala completamente blanca y vacía, excepto por una mesa que hay al otro extremo.\n\nUna voz a través de un altavoz con un volumen demasiado alto y estridente te habla:\n"+ANSI_RESET+ANSI_YELLOW+"\n·Altavoz: "+RED_BOLD+"<< FRENTE A TI TIENES UNA MESA CON DIFERENTES OBJETOS, 6 EN TOTAL, PUEDES COGER TRES DE ELLOS, ELIGE BIEN LO QUE VAS A ESCOGER, PUES TE SERÁN DE ULTILIDAD MÁS ADELANTE >>"+ANSI_RESET);

        
        System.out.println(ANSI_PURPLE+"El dispositivo con el que estabas encadenado se libera, te levantas y te diriges a la mesa, observas los objetos que hay en ella y te dispones a coger tres de ellos.\n \t(1)-VENDAS \t(2)-PASTILLAS \t(3)-TRAPO HÚMEDO \n\t(4)-CRUCIFIJO PLATEADO \t(5)-LLAVE DE ORO \t(6)-ELIXIR MISTERIOSO"+ANSI_RESET);
        eleccion=sc.nextLine().toLowerCase();
        switch(eleccion){
            case "1","4","6":
                Estructura2(ANSI_BLUE+"\t\t\t(Este objeto te es de valor.)"+ANSI_RESET);
                vidaUser=vidaUser+5;
            break;
            case "2","3","5":
                Estructura2(ANSI_BLUE+"\t\t\t(Este objeto es tan inutil que hasta te molesta...)"+ANSI_RESET);
                vidaUser=vidaUser-5;
            break;
            default:
                Estructura2(ANSI_BLUE+"No has elegido nada, por espabilao...\n"+ANSI_RESET);
        }
        Imprimir(ANSI_BLUE+"Acto seguido, la puerta de la sala se abre ¿quieres salir?\n"+ANSI_RESET);
        System.out.println(ANSI_PURPLE+"\t(A)-Si, salir. \t(B)-No, no salir. \t(C)-Esperar."+ANSI_RESET);

        eleccion=sc.nextLine().toLowerCase();

        if(eleccion.equals("si")||eleccion.equals("a")){
            Estructura(ANSI_BLUE+"Sales con normalidad"+ANSI_RESET);
            continuar(sc);
        }else{
            Estructura(ANSI_BLUE+"Entran dos individuos totalmente tapados con una capa y un capirote blanco, te someten descargas eléctricas y te sacan a la fuerza de la habitación, seguidamente, ellos se quedan dentro de la sala y cierran la puerta\n"+ANSI_RESET);
            continuar(sc);
        }
         Estructura(ANSI_BLUE+"La misma voz que te dio las instrucciones, vuelve a aparecer:\n"+RED_BOLD+"<< Te encuentras en un pasillo, si haces las cosas bien podrás salir de aquí y volver con tus compañeros... Ves tres puertas ¿verdad?, abre la que consideres que es la correcta, tienes treinta segundos para elegir...>>"+ANSI_RESET+ANSI_BLUE+" \nTe acercas a observar cada una de las puertas:"+ANSI_RESET);

        
        System.out.println(calavera+angel+estrella);

        do{
            Estructura2(RED_BOLD+"<< ¿Cual vas a elegir...? ¿'Esqueleto'... 'Angel' o... 'Estrella' >>"+ANSI_RESET);
            eleccion=sc.nextLine().toLowerCase();
            if(eleccion.equals("esqueleto")||eleccion.equals("angel")||eleccion.equals("estrella")){
                Estructura(ANSI_BLUE+"Entras en la habitación de la puerta "+eleccion+", en la que hay un hombre con una soga al cuello, sobre una horca, el hombre te mira fijamente con lágrimas en los ojos, pero no dice ni una sola palabra…\n"+RED_BOLD+"<< Has elegido la opción de salvarle la vida o no, al sujeto que tienes delante, las reglas son muy claras, tienes 3 intentos para adivinar la palabra con las siguientes pistas, la respuesta correcta es una única palabra: >>"+ANSI_RESET);    
            buc=true;
            }else{
            System.out.println(RED_BOLD+"<< Elige una puerta, de una vez... >>"+ANSI_RESET);
            buc=false;
            }
        }while(!buc);
        int i = 0;
        do{
            Estructura2(RED_BOLD+"<< Niños, llanto, cárcel, trauma, abuso >>\n << ¿Cual es la respuesta? >>"+ANSI_RESET);
            eleccion=sc.nextLine().toLowerCase();
            if(eleccion.equals("pederasta")||eleccion.equals("pedofilo")||eleccion.equals("pedófilo")||eleccion.equals("pedrasta")||eleccion.equals("pederastia")||eleccion.equals("pedrastia")){
                Estructura(ANSI_BLUE+"El hombre es liberado, luego entran unos encapuchados y se lo llevan de allí, al hombre solo le da tiempo a decir 'gracias'."+ANSI_RESET);
                vidaUser=vida_user-5;
                i=4;
            }else{
                i++;
                Estructura2(ANSI_RED+"Vuelve a intentarlo... has usado "+i+" intentos..."+ANSI_RESET);
            }
        }while(i<3);
        
        if(i==3){
            Estructura(ANSI_BLUE+"La trampilla de la horca se abre, y el sujeto cae suspendido al vacío, rompiéndose el cuello en el acto por la soga que tenía atada."+ANSI_RESET);
            vidaUser=vidaUser+5;
        }
        continuar(sc);

        Estructura(RED_BOLD+"<< Quedará en tu consciencia si has hecho lo correcto o no con el sujeto; Agustín, 57 años, párroco de la iglesia del Bendito Corazón de Dios, condenado por abuso sexual a menores en 7 casos diferentes. >> \n "+ANSI_RESET+ANSI_BLUE+"Sigues en la habitación, no has recibido ninguna instrucción más y estás demasiado asustado para gritarle a la voz para que te saque de ahí, decides intentar salir por ti mismo:"+ANSI_RESET);
        
        do{
            System.out.println(ANSI_PURPLE+"A) Ir hacia la puerta por la que entraste, pero está bloqueada.\n" + //
                "\n" + //
                "B) Ir hacia la puerta situada detrás de la horca, pero está bloqueada.\n" + //
                "\n" + //
                "C) Ir hacia la estantería vacía que se encuentra al este de la sala e intentar moverla, pero pesa demasiado y no puedes.\n" + //
                "\n" + //
                "D) Te subes a la horca, y ves que abajo hay una trampilla de madera sin cerradura, la abres, y bajas por una escalera de pared por un túnel muy oscuro."+ANSI_RESET);
            eleccion=sc.nextLine().toLowerCase();
            switch (eleccion) {
                case "a","b","c":
                    Estructura2(ANSI_BLUE+"Tristemente, no sirve para nada"+ANSI_RESET);
                    buc=false;
                break;
                case "d":
                    int j=0;
                    while(j<1){
                    Estructura(ANSI_BLUE+"Tras bajar la escalera, te encuentras en un túnel de piedra que se bifurca en dos caminos, el izquierdo, y el derecho."+ANSI_RESET+ANSI_PURPLE+"\n ¿cuál quieres tomar? \n\t(A) Izquierdo \t (B) Derecho");
                    eleccion2=sc.nextLine().toLowerCase();
                    if(eleccion2.equals("a")||eleccion2.equals("izquierdo")){
                        Estructura(ANSI_BLUE+"Recorres el túnel buscando una salida. Desemboca en un portón de madera de gran tamaño con adornos metálicos, el portón está abierto y decides cruzarlo, llegas a una habitación, dentro de la habitación había un hombre sentado en una silla. El hombre tenía la cara pálida y los ojos rojos."+ANSI_RESET);
                        vidaUser=vidaUser-5;
                        j++;
                        continuar(sc);
                    }else if(eleccion2.equals("derecho")||eleccion2.equals("b")){
                        Estructura(ANSI_BLUE+"Recorres el túnel buscando una salida. Desemboca en un portón de madera de gran tamaño con adornos metálicos, el portón está abierto y decides cruzarlo, llegas a una habitación, dentro de la habitación había un hombre sentado en una silla. El hombre tenía la cara pálida y los ojos rojos."+ANSI_RESET);
                        vidaUser=vidaUser+5;
                        j++;
                        continuar(sc);
                    }else{
                        Estructura2(ANSI_RED+"\t\t\t Derecha... o Izquierda..."+ANSI_RESET);
                    }
                }
                buc=true;
                break;
            default:
                System.out.println(ANSI_RED+"\t\t\tIntentalo de nuevo..."+ANSI_RESET);
                continuar(sc);
            }
        }while(!buc);

        do{
            Estructura(ANSI_PURPLE+"En tu cabeza solo ves 2 posibles decisiones... \n\t(A)-Te das media vuelta y empiezas a correr.\t(B)-Con total naturalidad entras y le preguntas que le pasa, ves que se encuentra atado.");
            eleccion=sc.nextLine().toLowerCase();
            switch (eleccion) {
                case "a":
                int r=aleatorio.nextInt(4);
                    switch (r) {
                        case 1:
                            Estructura(ANSI_BLUE+"Recapacitas y decides que no es para tanto, que podrías ayudarle (el hombre de la habitación te captura y te tiene como su rehén quitándote"+ANSI_RESET);
                            vidaUser=vidaUser-10;
                            continuar(sc);
                        break;
                        case 2:
                            Estructura(ANSI_BLUE+"Consigues encontrar unas escaleras pero mientras mas te acercas mas gritos de dolor escuchas (son amigos tuyos viendo una película de miedo a todo volumen, te das cuenta que todo ha sido una alucinación"+ANSI_RESET);
                            vidaUser=vidaUser+10;
                            continuar(sc);
                        break;
                        case 3:
                            Estructura(ANSI_BLUE+"Te tropiezas con la alfombra y te deja inconsciente"+ANSI_RESET);
                            continuar(sc);
                        break;
                    }
                    buc=true;
                break;
                case "b":
                int p=aleatorio.nextInt(4);
                    switch (p) {
                        case 1:
                            Estructura(ANSI_BLUE+"Decides soltarlo...\n Te ayuda a encontrar la salida."+ANSI_RESET);
                            vidaUser=vidaUser+10;
                            continuar(sc);
                        break;
                        case 2:
                            Estructura(ANSI_BLUE+"Le interrogas\nesta tan perturbado que no consigues que diga nada \n pero consigues encontrar lo que parece una salida."+ANSI_RESET);
                            continuar(sc);
                        break;
                        case 3:
                            Estructura(ANSI_BLUE+"Está en muy mal estado y solo dice cosas sin sentido. \n hace tanto ruido que despierta al verdadero asesino que tiene capturado al hombre");
                            vidaUser=vidaUser-10;
                            continuar(sc);
                        break;
                    }
                    buc=true;
                break;
                default:
                    Imprimir(ANSI_BLUE+"\nTienes tanto miedo que no sabes que hacer bien..."+ANSI_RESET);
                    continuar(sc);
                    buc=false;
            }
        }while(!buc);

        Estructura(ANSI_BLUE+"Finalmente consigues salir de esta pesadilla. \n Lo unico que recuerdas claramente es un numero... recuerdalo bien:"+ANSI_RESET+BLUE_BOLD+"\n\t\t\t"+vidaUser);
        continuar(sc);

        TXT_BIENVENIDA="¡GRACIAS POR JUGAR!";
        TXT_EXPLICACION="FINALMENTE";

        Separador();
        System.out.println(ANSI_PURPLE + TXT_BIENVENIDA + "\n" + SUBRAYA.repeat(TXT_BIENVENIDA.length())+ ANSI_RESET);
        System.out.println("\n"+ANSI_BLUE + TXT_EXPLICACION + "\n" + SUBRAYA.repeat(TXT_EXPLICACION.length()));
        System.out.println(ANSI_BLUE+"Aqui acaba la Historia interactiva... \n  una vez mas Recuerda este numero es MUY importante: "+vidaUser+"\n ¡ADIOS!"+ANSI_RESET);
        Separador();

    }
}
