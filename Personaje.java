import java.util.ArrayList;
public class Personaje {
private String Nombre;
private int ATK;
private int DEF;
private int HP;

public Personaje(String nombre, int aTK, int dEF, int hP) {
    Nombre = nombre;
    ATK = aTK;
    DEF = dEF;
    HP = hP;
}

public void MostrarPersonajes(ArrayList<Personaje> personajes){
    for (int i = 0; i<personajes.size();i++ ){
    System.out.println(personajes.get(i).toString());
}
}



public String getNombre() {
    return Nombre;
}

@Override
public String toString() {
    return "Personaje [Nombre=" + Nombre + ", ATK=" + ATK + ", DEF=" + DEF + ", HP=" + HP + "]";
}




}
