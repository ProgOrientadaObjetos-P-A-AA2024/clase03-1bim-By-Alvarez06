/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.InstitucionEducativa;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        /*Un objeto de tipo InstitucionEducativa*/
        
        InstitucionEducativa i1 = new InstitucionEducativa();
        String nombre = "Unidad Educativa Calasanz";
        String tipoInstitucion = "Fiscomisional";
        int numeroAlumnos = 2080;
        int numeroDocentes = 50;
        int numeroSedes = 3;
        
        //Asignar los valores al objeto
        i1.establecerNombre(nombre);
        i1.establecerTipoInstitucion(tipoInstitucion);
        i1.establecerNumeroAlumnos(numeroAlumnos);
        i1.establecerNumeroDocentes(numeroDocentes);
        i1.establecerNumeroSedes(numeroSedes);
        
        //Mostrar por pantalla
        System.out.printf("INSTITUCION EDUCATIVA\n\nNombre: %s\n"
                + "Tipo de Institucion: %s\nN° de Alumnos: %d\n"
                + "N° de Docentes: %d\nN° de Sedes: %d\n", i1.obtenerNombre(), 
                i1.obtenerTipoInstitucion(), i1.obtenerNumeroAlumnos(),
                i1.obtenerNumeroDocentes(), i1.obtenerNumeroSedes());
    }
}
