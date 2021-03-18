package Tarea1;
import java.util.*;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> lista = new ArrayList<>();
        Integer temp;
        for (int i = 0; i < 20; i++) {
            temp = (int) (Math.random() * 100);
            lista.add(temp);
        }
        System.out.println("Lista con el orden de insercion: ");
        System.out.println(lista);

        EnterosDecrecientes comp = new EnterosDecrecientes();

        Collections.sort(lista, comp);
        System.out.println("Lista en el orden creciente: ");
        System.out.println(lista);
    }
}
class EnterosDecrecientes implements Comparator <Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}

