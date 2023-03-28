package guia;
import java.util.Scanner;
import java.util.UUID;
import java.time.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese ejercicio!");
        Scanner ejer = new Scanner(System.in);
        switch(ejer.nextInt()){
            case 1 -> ejercicio1();
            case 2 -> ejercicio2();
            case 3 -> ejercicio3();
        }
    }
    public static void ejercicio1(){
        //punto a
        Autor aut = new Autor();
        aut.setApellido("Bosch");
        aut.setNombre("Joshua");
        aut.setEmail("joshua@gmail.com");
        aut.setGenero('M');
        System.out.println("***************************************");
        aut.mostrarAutor();
        //Punto b,c,d y e
        Libro aux = new Libro();
        aux.setAut(aut);
        aux.setPrecio(450);
        aux.setTitulo("Effective Java");
        aux.setStock(150);
        aux.mostrarLibro();
        System.out.println("***************************************");

        //punto F
        aux.aumentoCopias(50);
        aux.aumentoLibro(500);
        aux.infoLibro();
        System.out.println("\n***************************************");

        //Punto G
        aux.autorPorTitulo();
        System.out.println("***************************************");

        //Punto H
        aux.agregarAutor();
        System.out.println("***************************************");
        aux.mostrarLibro();
        System.out.println("***************************************");
        aux.autorPorTitulo();
        System.out.println("***************************************");
    }
    public static void ejercicio2(){
        Cliente clientito = new Cliente();
        clientito.setId(UUID.randomUUID());
        clientito.setEmail("RomagnoliRoma@gmail");
        clientito.setNombre("Romagnoli");
        clientito.setPorcen(15);
        clientito.mostrarCliente();
        Factura prueba = new Factura();
        prueba.setCliente(clientito);
        prueba.setId(clientito.getId());
        prueba.setFecha(LocalDate.now());
        prueba.setHora(LocalTime.now());
        prueba.setTotal(500);
        System.out.println("**************************************");
        prueba.muestraFactura();
    }
    public static void ejercicio3(){
        Cliente2 roman = new Cliente2();
        roman.setGenero('M');
        roman.setId(1024);
        roman.setNombre("Roman");
        roman.mostrarCliente();
        System.out.println("*************************************");
        Cuenta cuentaRoman = new Cuenta();
        cuentaRoman.setCli(roman);
        cuentaRoman.setBalance(10000);
        cuentaRoman.setId(1024);
        cuentaRoman.ingresar(5000);
        cuentaRoman.retirar(16000);
        cuentaRoman.mostrarCuenta();
    }
}