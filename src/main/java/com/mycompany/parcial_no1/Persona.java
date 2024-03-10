
package com.mycompany.parcial_no1;


abstract class Persona implements Consultable {
    private int id;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;

    public Persona(int id, String nombre, String apellido, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Método abstracto que debe ser implementado por las subclases
    public abstract void ConsultarPersona();
}
