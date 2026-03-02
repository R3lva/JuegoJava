import java.util.ArrayList;
public class Protagonista {
private String Nombre;
private int ATK;
private int DEF;
private int HP;
private int VD;
private int Oro;
private Items armadura;
private ArrayList Bolsa = new ArrayList<Items>();
public Protagonista(String nombre, int aTK, int dEF, int hP,int VD,int Oro,Items Armadura) {
    Nombre = nombre;
    ATK = aTK;
    DEF = dEF;
    HP = hP;
    this.VD = VD;
    this.armadura = Armadura;
     if (this.armadura.getDEF() > 5){
        DEF = DEF + this.armadura.getDEF();
     }
    this.Oro = Oro;

}

public void MostrarPersonajes(ArrayList<Protagonista> personajes){
    System.out.println("PROTAGONISTAS");
    for (int i = 0; i<personajes.size();i++ ){
    System.out.println(personajes.get(i).toString());
}
}
public void Mostrarnombres(ArrayList<Protagonista> personajes){
    System.out.println("PROTAGONISTAS");
    for (int i = 0; i<personajes.size();i++ ){
    System.out.println(i + ". "+ personajes.get(i).getNombre());
}
}
public void printNombre(ArrayList<Protagonista> personajes,int opcion) {
    System.out.println(personajes.get(opcion).getNombre());
}

public int obtenerDamage(ArrayList<Protagonista> personajes,int opcion) {
   return personajes.get(opcion).getATK();
}

public int obtenerVida(ArrayList<Protagonista> personajes,int opcion) {
   return personajes.get(opcion).getHP();
}

public void CambiarArmadura(ArrayList<Protagonista> personajes,int opcion,Items arma) {
    personajes.get(opcion).cambiarArmadura(arma);
}
public void RestarVida(ArrayList<Protagonista> personajes,int opcion,int res) {
    personajes.get(opcion).resHP(res);
}
public void SumarVida(ArrayList<Protagonista> personajes,int opcion,int res) {
    personajes.get(opcion).sumHP(res);
}
public int obtenerOro(ArrayList<Protagonista> personajes,int opcion) {
   return personajes.get(opcion).getOro();
}


public void cambiarArmadura(Items arma) {
     this.armadura = arma;
}


public Items getArmadura() {
    return armadura;
}

public void CambiarOro(ArrayList<Protagonista> personajes,int opcion,int Orito) {
    personajes.get(opcion).cOro(Orito);
}

public void RestarOro(ArrayList<Protagonista> personajes,int opcion,int Orito) {
    personajes.get(opcion).rOro(Orito);
}

public void rOro(int orito) {
    Oro = Oro - orito;
}
public void cOro(int orito) {
    Oro = Oro + orito;
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

public void resHP(int v) {
    HP = HP -v ;
}
public void sumHP(int v) {
    HP = HP -v ;
}

public void setATK(int aTK) {
    ATK = aTK;
}

public void setHP(int hP) {
    HP = hP;
}

public String getNombre() {
    return Nombre;
}

@Override
public String toString() {
    return "Protagonista [Nombre=" + Nombre + ", ATK=" + ATK + ", DEF=" + DEF + ", HP=" + HP + ", VD=" + VD + ", Oro="
            + Oro + ", armadura=" + armadura + ", Bolsa=" + Bolsa + "]";
}





}
