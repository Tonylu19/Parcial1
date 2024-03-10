
package com.mycompany.parcial_no1;


// Clase Cliente (hereda de Persona)
class Cliente extends Persona {
    private int codigo;
    private double saldo;

    public Cliente(int id, String nombre, String apellido, String direccion, String telefono,
                   int codigo, double saldo) {
        super(id, nombre, apellido, direccion, telefono);
        this.codigo = codigo;
        this.saldo = saldo;
    }

    @Override
    public void ConsultarPersona() {
        System.out.println("Información del cliente:");
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + getNombre());
        System.out.println("Saldo: $" + saldo);
    }

    // Otros métodos específicos para Cliente (ConsultarCliente, etc.)
    // ...

    private String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
