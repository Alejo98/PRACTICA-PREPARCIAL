/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import java.util.ArrayList;

/**
 *
 * @author Usuario14
 */
public class Programa {
public String nombre;
public String departamento;
public ArrayList<Curso> cursos;

    public Programa(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.cursos=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }
    public void addCurso(String nombre,int creditos){
        Curso c=new Curso(nombre,creditos);
        this.cursos.add(c);
    }
}
