package org.example.concurso_programamelo;

public class ProgramaMeLo {

    public static void main (String[] args){

        //Creamos u concurso.
        Concurso iesmutxamel = new Concurso();
        System.out.println(iesmutxamel);

        //Creamos un equipo
        Equipo maquinitas = new Equipo("Los maquinitas");
        System.out.println(maquinitas);
        System.out.println();

        //Inscribimos un equipo
        iesmutxamel.inscribirEquipo(maquinitas);
        System.out.println(iesmutxamel);
        System.out.println();

        //Añadimos miembros a un equipo
        maquinitas.insertarMiembros("Daniel","Lucas");
        System.out.println(maquinitas);
        System.out.println();

        //Nos pasamos del maximo de miembros permitidos para comprobar que no permite añadir mas
        maquinitas.insertarMiembros("Carla","Eros","Lucía");
        System.out.println(maquinitas);
        System.out.println();

        //Creamos otro equipo y le añadimos miembros
        Equipo triunfitos = new Equipo("Los triunfitos");
        iesmutxamel.inscribirEquipo(triunfitos);
        triunfitos.insertarMiembros("Juan","Patri","Alexia");
        System.out.println(triunfitos);
        System.out.println();

        //Le asignamos un total de problemas y calculamos su puntuación
        maquinitas.setProblemas_resueltos(2);
        maquinitas.calcularPuntuacion();
        triunfitos.setProblemas_resueltos(3);
        triunfitos.calcularPuntuacion();
        System.out.println();
//        //a)
        //Imprimimos la informacion de los equipos.
        iesmutxamel.imprimirDatosEquipos();
//        //b)
        //Buscamo y mostramos el ganador
        iesmutxamel.equipoGanador();
    }
}
