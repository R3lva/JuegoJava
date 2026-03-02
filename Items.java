import java.util.ArrayList;
public class Items {
private String Nombre;
private int ATK;
private int DEF;
private int Precio;
private int HP;
private Tipo tipo; 
ArrayList<Items> itemlist = new ArrayList<>();
 ArrayList<Items> misItems = new ArrayList<>();
public enum Tipo {
    Curativo,
    Armadura

}

public Items(String nombre, int aTK, int dEF, int hp, int precio, Tipo tipo) {
    Nombre = nombre;
    ATK = aTK;
    this.tipo = tipo;
    DEF = dEF;
    this.HP = hp;
    this.Precio = precio;
}

  



public void añadirItem(Items item){
    boolean existe = false;

    for (Items it : itemlist) {
        if (it.getNombre().equals(item.getNombre())) {
            existe = true;
            break;
        }
    }
    
    if (!existe) {
        itemlist.add(item);
        System.out.println("Agregado item: " + item.getNombre());
    } else {
        System.out.println("El item ya existe: " + item.getNombre());
    }
}

public void printSTATS(Items item){
   System.out.println(item.toString());
}


public void añadirItemAInv(int opcion){
    misItems.add(itemlist.get(opcion));  
}


public void mostrarInventario(){
    System.out.println("INVENTARIO::");
    for (int i = 0; i<misItems.size();i++ ){
    System.out.println(i + ". "+ misItems.get(i).toString());
}
}
public void mostrarItems(){
    System.out.println("ITEMS::");
    for (int i = 0; i<itemlist.size();i++ ){
    System.out.println(itemlist.get(i).toString());
}
}


public void printitem(int opcion){

    System.out.println(itemlist.get(opcion).toString());

}


public Tipo obtenerTipo(int opcion){

    return itemlist.get(opcion).getTipo();

}
public Tipo obtenerTipoinv(int opcion){

    return misItems.get(opcion).getTipo();

}
public int obtenerPrecio(int opcion){

    return itemlist.get(opcion).getPrecio();

}
public int obtenerHeal(int opcion){

    return misItems.get(opcion).getHP();

}

public int getItemsNumber() {
    return itemlist.size();
}




public int getPrecio() {
    return Precio;
}





public Tipo getTipo() {
    return tipo;
}





public void MostrarPersonajes(ArrayList<Personaje> personajes){
    for (int i = 0; i<personajes.size();i++ ){
    System.out.println(personajes.get(i).toString());
}
}



public int getHP() {
    return HP;
}





public int getDEF() {
    return DEF;
}





public String getNombre() {
    return Nombre;
}



@Override
public String toString() {
    return "Items [Nombre=" + Nombre + ", ATK=" + ATK + ", DEF=" + DEF + ", Precio=" + Precio + ", HP=" + HP + "]";
}





}
