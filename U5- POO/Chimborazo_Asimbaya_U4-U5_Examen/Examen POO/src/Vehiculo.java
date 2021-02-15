public class Vehiculo {
    private String matricula;
    private double carga_max;
    private int conductor;
    private int numero_tiendas;

    Vehiculo(String matricula){

        carga_max = 58.000;
        this.matricula = matricula;


    }

    void vehiculoCargar(double nuevaCarga_maxima) {

        carga_max = nuevaCarga_maxima;
    }



}
