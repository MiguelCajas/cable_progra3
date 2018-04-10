package Modelo;

public class Estructura {
    import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author alumno
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
 private static void llenarArbol(){

    Nodo A = new Nodo(0);
    Nodo B = new Nodo(7);
    Nodo C = new Nodo(5);
    Nodo D = new Nodo(3);
    Nodo E = new Nodo(8);
    Nodo F = new Nodo(9);
    Nodo G = new Nodo(10);
    Nodo H = new Nodo(2);
    Nodo I = new Nodo(4);
    Nodo J = new Nodo(0);
    Nodo K = new Nodo(0);
    Nodo L = new Nodo(10);
    Nodo M = new Nodo(6);
    Nodo N = new Nodo(10);
    Nodo O = new Nodo(10);

A.setNodoIzquierdo(B);
A.setNodoDerecho(C);

B.setNodoIzquierdo(D);
B.setNodoDerecho(E);

C.setNodoIzquierdo(F);
C.setNodoDerecho(G);

D.setNodoIzquierdo(H);
D.setNodoDerecho(I);

E.setNodoIzquierdo(J);
E.setNodoDerecho(K);

F.setNodoIzquierdo(L);
F.setNodoDerecho(M);

G.setNodoIzquierdo(N);
G.setNodoDerecho(O);

//Resultado en pantalla
System.out.println("\nRecorrido Preorden: ");
preOrden(A);
System.out.println("\nRecorrido Inorden: ");
inorden(A);
System.out.println("\nRecorrido PostOrden: ");
posOrden(A);
}

//Metodo Preorden
private static void preOrden(Nodo raiz) {
if (raiz != null) {
System.out.print(raiz.getValor()+ " - ");
preOrden(raiz.getNodoIzquierdo());
preOrden(raiz.getNodoDerecho());
}
}
//Metodo Inorden
private static void inorden(Nodo raiz) {
if (raiz != null) {
inorden(raiz.getNodoIzquierdo());
System.out.print(raiz.getValor()+ " - ");
inorden(raiz.getNodoDerecho());
}
}
//Metodo PostOrden
private static void posOrden(Nodo raiz) {
if (raiz != null) {
posOrden(raiz.getNodoIzquierdo());
posOrden(raiz.getNodoDerecho());

System.out.print(raiz.getValor() + " - ");
}
}

}
}

public class Nodo {
 

private int valor;
private Nodo izq;
private Nodo der;

    public int getValor() {
        return valor;
    }

    public void setValor(int Valor) {
        this.valor = Valor;
    }


//Constructor
    public Nodo(int valor){
    this.valor = valor;
    }
//Para saber el nodo izquierdo
    public Nodo getNodoIzquierdo(){
    return izq;
    }
//Para saber el nodo derecho
    public Nodo getNodoDerecho(){
    return der;
    }
//Se crea nodo derecho

    public void setNodoDerecho(Nodo nodo){
    der = nodo;
    }
//Se crea nodo Izquierdo
    public void setNodoIzquierdo(Nodo nodo){
    izq = nodo;
    }
   

}



