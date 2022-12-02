package liste_collection;

import java.util.*;
public class LinkedListDemo {
public static void main(String args[]) {
// déclaration de linked list
LinkedList ll = new LinkedList();
// remplir les éléments dans linked list
ll.add("C");
ll.add("D");
ll.add("T");
ll.add("V");
ll.addFirst("A");
ll.addLast("Z");
ll.add(1, "B");
System.out.println("Contenu original: " + ll);
// remove elements from the linked list
ll.remove("F");
ll.remove(2);
ll.removeFirst();
System.out.println("Après suppression: "
+ ll);
// modification de la valeur de l'objet à l'indice 0
String first = (String) ll.getFirst();
int index = ll.indexOf(first);
ll.set(index, first + " Nouveau");
System.out.println("Aprés modification: " + ll);
}
}







