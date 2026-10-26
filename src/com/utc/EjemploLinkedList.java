package com.utc;
import java.util.LinkedList;
public class EjemploLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    LinkedList<String> lista = new LinkedList<>();
    lista.addLast("Nodo B");
    lista.addFirst("Nodo A");
    lista.addLast("Nodo C");
    System.out.println("Lista: " + lista);
    System.out.println("Primero: " + lista.getFirst());
    System.out.println("Ultimo: " + lista.getLast());
    lista.removeFirst();
    System.out.println("Después de removeFirst: " + lista);
	}

}
