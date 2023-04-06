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
public class Constructores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Persona persona1 = new Persona();
        Persona Persona2  =new Persona("Martin",19);
        imprimir(persona1.getTextoImprimir());
        imprimir(Persona2.getTextoImprimir());*/
        Empleado empleado = new Empleado("Marco","Finanzas",33);
        Empleado empleadoCopia = Empleado.copiaEmpleado(empleado);
        empleadoCopia.setDepartamento("Ventas");
        imprimir(empleado.getTextoImprimir());
        imprimir(empleadoCopia.getTextoImprimir());



    }
      public static void imprimir(String texto){
        System.out.println(texto);
    }
    public static String convertirATexto(int entero){
        return String.valueOf(entero);
    }
}
