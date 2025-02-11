package org.example.concurso_programamelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Concurso {

    Scanner entrada = new Scanner(System.in);

    //Declaramos atributos
    private String sede;
    private LocalDate fecha;
    private ArrayList<Equipo> listaEquipos;
    private int dia;
    private int mes;
    private int anyo;

    public static final String SEDE_DEF = "MUTXAMEL";
    public static final int MAX_EQUIP = 20;

    public Concurso (){

        this.sede = SEDE_DEF;
        pedirFecha();
        this.listaEquipos = new ArrayList<>();

    }

    public void equipoGanador(){

        int aux = 0;

        for (Equipo e : listaEquipos){

            if(e.getPuntuacion() > aux){

                aux = e.getPuntuacion();

            }

            System.out.println("El equipo ganador ha sido '" + e.getNombre_equipo() + "' con " + aux + " puntos.");
            break;

        }
    }

    //Imprimimos los equipos listados
    public void imprimirDatosEquipos(){

        //usamos el formato deseado
        System.out.println("Equipos inscritos " + listaEquipos.size());

        for (Equipo e : listaEquipos) {
            System.out.println("    - " + e.getNombre_equipo() + ". " + e.getListaMiembros());
        }

    }

    //Pedimos las fechas por teclado para el concurso.
    public void pedirFecha() {

        System.out.println("¿Cuando se realizará el concurso?");
        this.dia = pedirDia();
        this.mes = pedirMes();
        this.anyo = pedirAnyo();

        this.fecha = LocalDate.of(anyo, mes, dia);
    }

    //Metodos para pedir las fechas de forma controlada
    public int pedirDia(){

        do {
            System.out.println("Día:");
            try {
                dia = entrada.nextInt();
                if (dia >= 1 && dia <= 31) {
                    break;
                }
                System.out.println("Error, el día no es válido.");
            } catch (Exception e) {
                System.out.println("ERROR. El formato debe ser numérico");
                entrada.nextLine();
            }
        } while (true);
        return dia;

    }

    public int pedirMes(){
        do {
            System.out.println("Mes:");
            try {
                mes = entrada.nextInt();
                if (mes >= 1 && mes <= 12) {
                    break;
                }
                System.out.println("Error, el mes no es válido.");
            } catch (Exception e) {
                System.out.println("ERROR. El formato debe ser numérico");
                entrada.nextLine();

            }
        } while (true);

        return mes;
    }

    public int pedirAnyo(){

        do {
            System.out.println("Año:");
            try {
                anyo = entrada.nextInt();
                if (anyo >= 1900 && anyo <= 2100) {
                    break;
                }
                System.out.println("Error, el año no es válido.");
            } catch (Exception e) {
                System.out.println("ERROR. El formato debe ser numérico");
                entrada.nextLine();

            }
        } while (true);

        return anyo;
    }

    //Inscribimos un equipo al concurso
    public void inscribirEquipo(Equipo equipo){

        //En caso de ser el maximo de equipos no dejra inscribirlo
        if(listaEquipos.size() > MAX_EQUIP){

            System.out.println("No se pueden registrar mas equipos en la competición.");
            return;

        }

        //Si la lista ya contiene el equipo tampoco lo permitira
        if(listaEquipos.contains(equipo)){

            System.out.println("El equipo ya está incrito.");
            return;

        }

        listaEquipos.add(equipo);
        System.out.println("Nuevo equipo " + equipo.getNombre_equipo() + " inscrito.");

    }

    //Getters y Setters
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public ArrayList<Equipo> getListaEquipos() {
        return listaEquipos;
    }

    public void setListaEquipos(ArrayList<Equipo> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }


    @Override
    public String toString() {
        return "Concurso[" +
                "Sede = '" + sede + '\'' +
                ", Fecha = " + fecha +
                ", Lista Equipos = " + listaEquipos +
                ']';
    }
}

