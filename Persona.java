//crea Crear la clase “Persona” con los siguientes atributos: DNI,nombre y primer apellido.
//Definir un constructor que permita dar un valor a estos atributos. 
//Crear las funciones necesarias para leer y cambiar estos atributos.

public class Persona {
  String DNI;
  String nombre;
  String primerApellido;
  
  // el constructor: inicializa el objeto Persona
  Persona(String DNI, String nombre, String primerApellido) {
    this.DNI = DNI;
    this.nombre = nombre;
    this.primerApellido = primerApellido;
  }
  
  // funcion
  void cambiarApellido(String nuevoApellido) {
    primerApellido = nuevoApellido;
  }
  
  // funcion obtenerDNI
  String obtenerDNI() {
    return DNI;
  }
  // funcion 
  String  obtenerNombre() {
    return nombre;
  }
  // funcion
  String  obtenerApellido() {
    return primerApellido;
  }
  
  //funcion main
  public static void main(String[] args) {
    Persona Pepe, Juan;
    Pepe = new Persona("45454545P", "Pepe", "Martínez");
    Juan = new Persona("85454547B", "Juan", "López");
    
    System.out.println("el DNI de Pepe es: " + Pepe.obtenerDNI());
    System.out.println("el apellido de Pepe es: " + Pepe.obtenerApellido());
    
    Pepe.cambiarApellido("Barcenas");
    System.out.println("Ahora el apellido de Pepe es: " + Pepe.obtenerApellido());
  }
}
