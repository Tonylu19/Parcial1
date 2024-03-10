package com.mycompany.parcial_no1;

    class Empleado extends Persona {

        private int codigo;
        private String puesto;
        private double salario;

        public Empleado(int id, String nombre, String apellido, String direccion, String telefono,
                int codigo, String puesto, double salario) {
            super(id, nombre, apellido, direccion, telefono);
            this.codigo = codigo;
            this.puesto = puesto;
            this.salario = salario;
        }

        @Override
        public void ConsultarPersona() {
            System.out.println("Información del empleado:");
            System.out.println("Código: " + codigo);
            System.out.println("Nombre: " + getNombre());
            System.out.println("Puesto: " + puesto);
            System.out.println("Salario: $" + salario);
        }

        // Otros métodos específicos para Empleado (guardar, obtenerPersona, etc.)
        // ...
        private String getNombre() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
