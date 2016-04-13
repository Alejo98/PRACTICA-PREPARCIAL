/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import java.util.Date;

/**
 *
 * @author Usuario14
 */
public class Estudiante {
public int edad;
public String nombre;
public char genero;
public Date fechaDeNacimiento;
public int codigo;

    public Estudiante(int edad, String nombre, char genero, Date fechaDeNacimiento, int codigo) {
        this.edad = edad;
        this.nombre = nombre;
        this.genero = genero;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.codigo = codigo;
    }

   

   

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}
