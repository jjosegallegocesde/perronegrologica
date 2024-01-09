package org.example;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //Entradas
        Scanner leerDato = new Scanner(System.in);
        String nombreCliente;
        String paisCliente;
        int anoNacimientoCliente;
        int mesNacimientoCliente;
        int diaNacimientoCliente;

        //Pedimos los datos al usuario
        System.out.print("Ingrese su nombre: ");
        nombreCliente=leerDato.nextLine();

        System.out.print("Ingrese su pais de origen: ");
        paisCliente=leerDato.nextLine();

        System.out.print("Ingrese el año en que nacio: ");
        anoNacimientoCliente=leerDato.nextInt();

        System.out.print("Ingrese el mes en que nacio: ");
        mesNacimientoCliente=leerDato.nextInt();

        System.out.print("Ingrese el dia en que nacio: ");
        diaNacimientoCliente=leerDato.nextInt();

        //PROCESANDO LAS ENTRADAS

        //1. ¿Como calcular la edad del cliente?
        //restar el año actual menos el año de nacimiento
        int edadCliente=2024-anoNacimientoCliente;
        System.out.println("su edad es: "+edadCliente);

        //2. Decidir con base en la edad si es cliente es mayor de edad
        if(edadCliente>=18){
            System.out.println("usted es mayor de edad");
            //menu de licores
            System.out.println("MENU");
            System.out.println("1... Botella aguardiante antioqueña ---- $150 COP");
            //botella de guaro--150
            //botella de don julio--600
            //botella de blue label--1500
            //botella de jagger--200
        }else{
            System.out.println("usted es un niño vayasa a mimir");
        }



    }
}