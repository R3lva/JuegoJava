import java.util.ArrayList;
public class Enemigo {
private String Nombre;
private int ATK;
private int DEF;
private int HP;
private int VD;
private int Oro;
public Enemigo(String nombre, int aTK, int dEF, int hP,int VD,int Oro) {
    Nombre = nombre;
    ATK = aTK;
    DEF = dEF;
    HP = hP;
    this.VD = VD;
    this.Oro = Oro;

}

public void MostrarPersonajes(ArrayList<Enemigo> personajes){
     System.out.println("ENEMIGOS");
    for (int i = 0; i<personajes.size();i++ ){
    System.out.println(personajes.get(i).toString());
}
}
public void printNombre(ArrayList<Enemigo> personajes,int opcion) {
    System.out.println(personajes.get(opcion).getNombre());
}

public int obtenerDamage(ArrayList<Enemigo> personajes,int opcion) {
   return personajes.get(opcion).getATK();
}

public int obtenerVida(ArrayList<Enemigo> personajes,int opcion) {
   return personajes.get(opcion).getHP();
}

public void setATK(int aTK) {
    ATK = aTK;
}

public void bajarvida(ArrayList<Enemigo> personajes,int opcion,int vida) {
  personajes.get(opcion).setHP(vida);
  System.out.println(  personajes.get(opcion).getNombre() + " -"+vida);
}

public int obtenerOro(ArrayList<Enemigo> personajes,int opcion) {
   return personajes.get(opcion).getOro();
}


public int getOro() {
    return Oro;
}

public int getATK() {
    return ATK;
}

public int getHP() {
    return HP;
}

public void setHP(int hP) {
    this.HP = this.HP - hP;
}

public String getNombre() {
    return Nombre;
}

@Override
public String toString() {
    return "Enemigo [Nombre=" + Nombre + ", ATK=" + ATK + ", DEF=" + DEF + ", HP=" + HP + ", VD=" + VD + ", Oro=" + Oro
            + "]";
}





}
