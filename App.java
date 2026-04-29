import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
//hola2
public class App {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
        ArrayList<Items> TIENDA = new ArrayList<>();
     ArrayList personajes = new ArrayList<>();
   ArrayList<Enemigo> enemigos = new ArrayList<>();
    ArrayList<Protagonista> protagonistas = new ArrayList<>();
 /*
  ///////////////// ITEMS ////////////
 */
     Items Armadura1 = new Items("Armadura de Hierro", 0, 50, 0, 100, Items.Tipo.Armadura);
      Items Armadura2 = new Items("Armadura de Diamante", 0, 50, 0, 500, Items.Tipo.Armadura);
     Items Armadura3= new Items("Armadura de Huesos", 0, 150, 0, 700, Items.Tipo.Armadura);
    Items Armadura4= new Items("Armadura de Metal", 0, 500, 0, 900, Items.Tipo.Armadura);
      Items Armadura5= new Items("Armadura de Magia", 0, 1000, 0, 2000, Items.Tipo.Armadura);
          Items curativo1 = new Items("Pocion Curativa Basica", 0, 0, 100, 100, Items.Tipo.Curativo);
      Items curativo2 = new Items("Pocion intermedia", 0, 0, 250, 500, Items.Tipo.Curativo);
     Items curativo3= new Items("Pocion Santa", 0, 0, 250, 700, Items.Tipo.Curativo);
    Items curativo4= new Items("Pocion Magica", 0, 0, 400, 900, Items.Tipo.Curativo);
      Items curativo5= new Items("Pocion De Eficacia", 0, 0, 1000, 2000, Items.Tipo.Curativo);
    Armadura1.añadirItem(Armadura1);
    Armadura1.añadirItem(Armadura2);
    Armadura1.añadirItem(Armadura3);
    Armadura1.añadirItem(Armadura4);
    Armadura1.añadirItem(Armadura5);
    Armadura1.añadirItem(curativo1);
    Armadura1.añadirItem(curativo2);
    Armadura1.añadirItem(curativo3);
    Armadura1.añadirItem(curativo4);
    Armadura1.añadirItem(curativo5);
     /*
  ///////////////// ITEMS ////////////
 */
     
    
    //Armadura1.mostrarItems();
     Enemigo p1 = new Enemigo("Lannister", 150, 5, 200,1,1000);
    Enemigo p2 = new Enemigo("Leon", 70, 0, 150,1,1000);
     Enemigo p3 = new Enemigo("Wild", 50, 1, 100,1,1000);       
     Protagonista p4 = new Protagonista("Sara", 20, 50, 200,1,100,Armadura1);
     Protagonista p5 = new Protagonista("Fernando", 20, 2, 300,1,200,Armadura1);

/*personajes.add(p1);
personajes.add(p2);
personajes.add(p3);
personajes.add(p4);
personajes.add(p5);
 */
  
enemigos.add(p1);
enemigos.add(p2);
enemigos.add(p3);
protagonistas.add(p4);
protagonistas.add(p5);

Collections.sort(enemigos, Comparator.comparing(Enemigo::getNombre));
Collections.sort(protagonistas, Comparator.comparing(Protagonista::getNombre));

//p1.MostrarPersonajes(enemigos);

//p4.MostrarPersonajes(protagonistas);

/* 
//////////////////////MENU  //////////
*/
boolean salir = false;
while ( salir == false) {
    

System.out.println("*////////////////////////////*");
System.out.println("1.Editar Lista de Personajes");
System.out.println("2.Editar Lista de Objetos");
System.out.println("3.Crear Personaje Custom");
System.out.println("4.Crear Item Custom");
System.out.println("5.Jugar");
System.out.println("6.Salir");
System.out.println("*////////////////////////////*");
/* 
//////////////////////MENU  //////////
*/

try{
int Opcion = sc.nextInt();
switch (Opcion) {
    case 1:
       p4.Mostrarnombres(protagonistas);
       System.out.println("Quieres eliminar algun Protagonista? s/n");
        String conp = sc.nextLine();
        if (conp.equals("s")){
          System.out.println("Cual?");
       int pel = sc.nextInt();
       protagonistas.set(pel, null);
        }
         
        break;
    case 2:
          Armadura1.mostrarItems();
       System.out.println("Quieres eliminar algun Objeto? s/n");
        String conp2 = sc.nextLine();
        if (conp2.equals("s")){
          System.out.println("Cual?");
       int pel2 = sc.nextInt();
       Armadura1.itemlist.set(pel2, null);
        }
        break;
        case 3:
            System.out.println("1. Crear Protagonista");
              System.out.println("2. Crear Enemigo");
           int op1 = sc.nextInt();
            switch (op1) {
                case 1:
                    System.out.println("Nombre");
                    String Nombre = sc.nextLine();
                    System.out.println("Ataque");
                     int Atk = sc.nextInt();
                    System.out.println("Vida");
                     int Vida = sc.nextInt();
                       System.out.println("Defensa");
                     int Defensa = sc.nextInt();
                        System.out.println("Gold");
                     int Gold = sc.nextInt();
                    Items Nada = new Items("Nada", 0, 0, 0, 0, Items.Tipo.Armadura);
                   Protagonista nuevo = new Protagonista(Nombre, Atk, Defensa, Vida, Vida, Gold, Nada);
                   System.out.println("Protagonista Creado");
                    break;
                    case 2:
                    System.out.println("Nombre");
                    String Nombre2 = sc.nextLine();
                    System.out.println("Ataque");
                     int Atk2 = sc.nextInt();
                    System.out.println("Vida");
                     int Vida2 = sc.nextInt();
                       System.out.println("Defensa");
                     int Defensa2 = sc.nextInt();
                        System.out.println("Gold");
                     int Gold2 = sc.nextInt();
                   Enemigo nuevo2 = new Enemigo(Nombre2, Atk2, Defensa2, Vida2, Vida2, Gold2);
                     System.out.println("Enemigo Creado");
                   break;
            
                default:
                    break;
            }


        break;
         case 4:
          System.out.println("Nombre del Item:");
          String name20 = sc.nextLine();
           System.out.println("Ataque del item:");
           int Ataque20 = sc.nextInt();
             System.out.println("Defensa del item:");
           int defensa20 = sc.nextInt();
           System.out.println("Vida del item:");
           int vida20 = sc.nextInt();
           System.out.println("Precio del item:");
           int Precio20 = sc.nextInt();

  System.out.println("Tipo del item:");
    System.out.println("1. Curativo");
      System.out.println("2. Armadura");
           int Tipos = sc.nextInt();
           if (Tipos == 1){
Items NuevoItem = new Items(name20, Ataque20, defensa20, vida20, Precio20, Items.Tipo.Curativo);
           }else  if (Tipos == 2){
            Items NuevoItem = new Items(name20, Ataque20, defensa20, vida20, Precio20, Items.Tipo.Armadura);
           }
        break;
         case 5:
          boolean jugando = true;
            System.out.println("Seleccione un Personaje:");
           p4.Mostrarnombres(protagonistas);
           int opcion = sc.nextInt();
         System.out.print("Personaje Seleccionado: ");
         p4.printNombre(protagonistas, opcion);
            System.out.println("Que dificultad buscas?");
          System.out.println("1. Facil ");
          System.out.println("2. Dificil ");
            int dificultad = sc.nextInt();
            boolean peleando = false;
            int enemigorandom = 0;
            int enemigosderro = 0;
           boolean terminarjuego=true;
           salir = true;
            while (terminarjuego == true) {
              // Seleccionar enemigo al azar
            if (peleando == false){
           enemigorandom = (int)(Math.random() * enemigos.size());
            System.out.println(enemigorandom);
            peleando = true;
            }else {
                System.out.print("Enemigo: ");
               p1.printNombre(enemigos,enemigorandom);
                  System.out.println("¿Que quieres hacer?");
           System.out.println("1.Atacar 2.ITEM 3.Salir");
       
       int elegir = sc.nextInt();
           
           switch (elegir) {
            case 1:
                 System.out.println("Elegiste la Opcion (Atacar)");
                 int damage = p4.obtenerDamage(protagonistas, opcion);
                 p1.bajarvida(enemigos, enemigorandom, damage);
                 System.out.println("Prueba");
                 int vida = p1.obtenerVida(enemigos, enemigorandom);
                 System.out.println("Vida del Enemigo: " + vida);
                if (vida <= 0) {
                  enemigosderro = enemigosderro +1;
                  System.out.print("Enemigo Derrotado : ");
                  p1.printNombre(enemigos,enemigorandom);
                  int oroObte = p1.obtenerOro(enemigos,enemigorandom);
                   System.out.println("Ganaste  " + oroObte + "De Oro");
                 p4.CambiarOro(protagonistas, opcion, oroObte);
                   peleando = false;
                  System.out.println("Tienda: ");
                  int Item1  = 0;
         int Item2  = 0;
         int Item3 = 0;
                    int maxitem = Armadura1.getItemsNumber();
                    boolean conseguido = false;
                    while (conseguido == false) {
          Item1  = (int)(Math.random() * maxitem);
          Item2  = (int)(Math.random() * maxitem);
          Item3  = (int)(Math.random() * maxitem);
          if (Armadura1.obtenerTipo(Item1) == Items.Tipo.Curativo && Armadura1.obtenerTipo(Item2) == Items.Tipo.Armadura && Armadura1.obtenerTipo(Item3) == Items.Tipo.Curativo){
        conseguido = true;
          }
            
          }
           System.out.println(" 1. ");
        Armadura1.printitem(Item1);
         System.out.println(" 2. ");
        Armadura1.printitem(Item2);
         System.out.println(" 3. ");
        Armadura1.printitem(Item3);
          System.out.println(" 4. ");
            System.out.println("No comprar nada");
         int Oro = p4.obtenerOro(protagonistas, opcion);
           System.out.println("Tu Oro : " + Oro);
        System.out.println(" Que quieres comprar? : ");
      
               boolean items1 = false;
               boolean items2 = false;
               boolean items3 = false;
               boolean comprados = true;
                 if (dificultad == 1){ // Facil
              while (comprados) {
                  int compra = sc.nextInt();
                if (compra == 1){
                 int Precio = Armadura1.obtenerPrecio(Item1);
                 if (Precio<= Oro){
                   p4.RestarOro(protagonistas, opcion, Precio);
                   Oro = p4.obtenerOro(protagonistas, opcion);
                    System.out.println("Tu Oro : " + Oro);
                    Armadura1.añadirItemAInv(Item1);
                    
                 }else{
                      System.out.println("No tienes dinero para este Item");
                    }
  

                }else if (compra == 2){
int Precio = Armadura1.obtenerPrecio(Item2);
                 if (Precio<= Oro){
                   p4.RestarOro(protagonistas, opcion, Precio);
                   Oro = p4.obtenerOro(protagonistas, opcion);
                    System.out.println("Tu Oro : " + Oro);
                    Armadura1.añadirItemAInv(Item2);
                    
                 }else{
                      System.out.println("No tienes dinero para este Item");
                    }


                }else if (compra == 3){

                    int Precio = Armadura1.obtenerPrecio(Item3);
                 if (Precio<= Oro){
                   p4.RestarOro(protagonistas, opcion, Precio);
                   Oro = p4.obtenerOro(protagonistas, opcion);
                    System.out.println("Tu Oro : " + Oro);
                    Armadura1.añadirItemAInv(Item3);
                    
                 }else{
                      System.out.println("No tienes dinero para este Item");
                    }

                }else if (compra == 4){
                  comprados = false;
                }
                
                if (items1 && items2 && items3){
                  comprados = false;
                }
                
              }


                 }else { // Dificil
                     int compra = sc.nextInt();
                switch (compra) {
                  case 1:
                     int Precio = Armadura1.obtenerPrecio(Item1);
                 if (Precio<= Oro){
                   p4.RestarOro(protagonistas, opcion, Precio);
                   Oro = p4.obtenerOro(protagonistas, opcion);
                    System.out.println("Tu Oro : " + Oro);
                    Armadura1.añadirItemAInv(Item1);
                    
                 }else{
                      System.out.println("No tienes dinero para este Item");
                    }
                    break;
                      case 2:
                     int Precio2 = Armadura1.obtenerPrecio(Item2);
                 if (Precio2<= Oro){
                   p4.RestarOro(protagonistas, opcion, Precio2);
                   Oro = p4.obtenerOro(protagonistas, opcion);
                    System.out.println("Tu Oro : " + Oro);
                    Armadura1.añadirItemAInv(Item2);
                    
                 }else{
                      System.out.println("No tienes dinero para este Item");
                    }
                    break;
                  case 3:
                     int Precio3 = Armadura1.obtenerPrecio(Item3);
                 if (Precio3<= Oro){
                   p4.RestarOro(protagonistas, opcion, Precio3);
                   Oro = p4.obtenerOro(protagonistas, opcion);
                    System.out.println("Tu Oro : " + Oro);
                    Armadura1.añadirItemAInv(Item3);
                    
                 }else{
                      System.out.println("No tienes dinero para este Item");
                    }
                    break;
                  default:
                    break;
                }
                 }
    
                }else { // Le toca atacar al enemigo
 p1.printNombre(enemigos,enemigorandom); 
 System.out.println("Te Ataca.");
 int vidita =  p4.obtenerVida(protagonistas,opcion);
  int Damage =  p1.obtenerDamage(enemigos,enemigorandom);
  p4.RestarVida(protagonistas, opcion, Damage);
System.out.println("Tu Vida: " + vidita);
if (vidita <=0 ){
  System.out.println("FUISTE DERROTADO!");
   System.out.println("Enemigos Derrotados: " + enemigosderro);
    System.out.println("ITEMS: ");
     Armadura1.mostrarInventario();  
   System.exit(0);
}

 }
           
              break;
                case 2:
                   System.out.println("Elegiste la Opcion (ITEMS)");
                   System.out.println("Tus ITEMS:");
                   if (Armadura1.misItems.size() == 0){
                      System.out.println("Tu Armadura:");
                      Armadura1.printSTATS(p4.getArmadura());
                     System.out.println("No tienes items");
                   }else {
                        System.out.println("Tu Armadura:");
                        Armadura1.printSTATS(p4.getArmadura());
                    Armadura1.mostrarInventario();  
                
                    System.out.println("Quieres usar algun item? s/n");
                    sc.nextLine();String usar = sc.nextLine();
                    if (usar.equals("s") || usar.equals("S")){
                       System.out.println("Que item Usar:");
                       int itemus = sc.nextInt();
   
                        if (Armadura1.obtenerTipoinv(itemus) == Items.Tipo.Curativo ){
                           int vidita =  p4.obtenerVida(protagonistas,opcion);
                           System.out.println("Tu vida es " + vidita);
                            System.out.println("Te tomaste una pocion...");
                            int heal = Armadura1.obtenerHeal(itemus);
                        p4.SumarVida(personajes, opcion, heal);
                        }else {
                           System.out.println("Te Equipaste una armadura");
                          p4.CambiarArmadura(protagonistas, opcion,Armadura1.misItems.get(itemus));
                        } 
    
                    }
                   }
              break;
           
            default:
              break;
           }
    
          
              
           
            }
          


            }

        
        break;
         case 6:
        salir = true;
        break;
    default:
        break;
}


}catch(Exception e){
  System.out.println("Introduce una opcion valida" );
  e.printStackTrace();
  sc.nextLine();
}

}


  



 }
}
