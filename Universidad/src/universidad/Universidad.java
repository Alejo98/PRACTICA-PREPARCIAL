/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;
import java.util.*;

/**
 *
 * @author Usuario14
 */
public class Universidad {
public String nombre;
public String nit;
public ArrayList<Estudiante> estudiantes;
public ArrayList<Programa>programas;

    public Universidad(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
        this.estudiantes = new ArrayList<Estudiante>();
        this.programas = new ArrayList<Programa>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public ArrayList<Programa> getProgramas() {
        return programas;
    }

    public void setProgramas(ArrayList<Programa> programas) {
        this.programas = programas;
    }


    public void addEstudiante( int edad,String nombre, char genero,
        Date fechaDeNacimiento, int codigo){
        Estudiante e=new Estudiante(edad,nombre,genero,fechaDeNacimiento,codigo);
        this.estudiantes.add(e);
    }
    public void addPrograma(String nombre,String departamento){
        Programa p=new Programa( nombre, departamento);
        this.programas.add(p);
    }



  
 }
    

