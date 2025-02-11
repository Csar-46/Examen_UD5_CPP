package org.example.concurso_programamelo;

import java.util.ArrayList;

public class Equipo {

    //Declaramos los atributos
    private String nombre_equipo;
    private ArrayList<String> listaMiembros;
    private int problemas_resueltos;
    private int puntuacion;

    public static final int MAX_MIEMBROS = 4;

    public Equipo (String nombre_equipo){

        this.nombre_equipo = nombre_equipo;
        this.listaMiembros = new ArrayList<>();


    }

    //Insertamos los miembros a la lista con un vector nombre.
    public void insertarMiembros(String... nombre){

        //En caso de ser exceder el maximo de miembros no se permite añadirlos.
        if((listaMiembros.size() + nombre.length) > MAX_MIEMBROS){
            System.out.println("No se pueden insertar " + nombre.length + " al equipo '" + getNombre_equipo() + "'. Ya tiene " + listaMiembros.size() + " miembros.");
            return;
        }

        //creamos un contador
        int cont = 0;

        //En caso de intentar introducir un miembro ya exixtente no se permite
        for (int i = 0; i < nombre.length; i++) {
            if(listaMiembros.contains(nombre[i])){

                System.out.println("El equipo ya está incrito.");
                continue;

            }

            //En caso de poder insertarlo actulizamos el contador y lo agregamos
            cont++;
            listaMiembros.add(nombre[i]);

        }

        //En caso de que el contador se haya actualizado imprimiremos el mensaje
        if(cont != 0){
            System.out.println("Insertados nuevos miembros para el equipo '" + getNombre_equipo() + "'.");
        }

    }

    //Calculamos la puntuacion del equipo en base a los problemas resueltos.
    public void calcularPuntuacion(){

        this.puntuacion = (getProblemas_resueltos()*10);
        System.out.println("Puntiacion calculada para el equipo " + getNombre_equipo() + ": " + getPuntuacion());

    }

    //Getters y Setters
    public ArrayList<String> getListaMiembros() {
        return listaMiembros;
    }

    public void setListaMiembros(ArrayList<String> listaMiembros) {
        this.listaMiembros = listaMiembros;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getProblemas_resueltos() {
        return problemas_resueltos;
    }

    public void setProblemas_resueltos(int problemas_resueltos) {
        this.problemas_resueltos = problemas_resueltos;
    }

    public String getNombre_equipo() {
        return nombre_equipo;
    }

    public void setNombre_equipo(String nombre_equipo) {
        this.nombre_equipo = nombre_equipo;
    }

    @Override
    public String toString() {
        return "Equipo[" +
                "Nombre Equipo = '" + nombre_equipo + '\'' +
                ", Lista Miembros = " + listaMiembros +
                ", Problemas Resueltos = " + problemas_resueltos +
                ", Puntuacion = " + puntuacion +
                ']';
    }
}
