
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author Kelvin Vasquez
 */
public class Empleado {
    private String nombre;
    private String departamento;
    private int edad;

    public Empleado(String nombre, String departamento, int edad) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.edad = edad;
    }

    public Empleado() {
        nombre = departamento ="";
        edad = 0;
    }
    public static Empleado copiaEmpleado(Empleado empleadoOLD){
         return new Empleado(
                empleadoOLD.getNombre(),
                empleadoOLD.getDepartamento(),
                empleadoOLD.getEdad()
         );
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getTextoImprimir(){
        return "Nombre: "
                +this.nombre 
                + "\nEdad: "
                +getEdadComoTexto()
                + "\nDepartamento: "
                +this.departamento;
                
    }
    public String getEdadComoTexto(){
        String edadTexto = String.valueOf(this.edad);
        return edadTexto;
    }
}
