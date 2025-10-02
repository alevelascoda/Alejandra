import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //ejercicio 1
        System.out.println("Buenos dias");

        /*
        Ejercicio 2: Escribe un programa que calcule y muestre el área de un cuadrado de lado igual a 5.
         */
        double lado1 = 5;
        double area = lado1 * lado1;
        System.out.println("Lado: " + lado1);
        System.out.println("Area: " + area);

        /*
        Ejercicio 3
         */
        System.out.println("\nEjercicio3");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor del lado del cuadrado");
        double lado2 = sc.nextDouble();

        double area2 = lado2 * lado2;
        System.out.println("Lado: " + lado2);
        System.out.println("Area: " + area2);

        /*
        Ejercicio 4
         */
        sc = new Scanner(System.in);
        //Lee el primero número
        System.out.println("introduce el primer numero");
        double num1 = sc.nextDouble();

        System.out.println("introduce el segundo numero");
        double num2 = sc.nextDouble();

        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num1 / num2;

        System.out.println("La suma es: " + suma);

        /*
        Ejercicio 5
         */



            //longitud radio
            System.out.println();
            double radio, areaCircunferencia,volumen;
            Scanner entrada = new Scanner(System.in);
            System.out.println("ingresa el valor del radio");
            radio = entrada.nextDouble();


            area = Math.PI * radio * radio;
            areaCircunferencia = 2 * Math.PI * radio;
            volumen = (4.0/3.0) * Math.PI * Math.pow(radio, 3);

            System.out.println("el area es" + area);
            System.out.println("la circunferencia es" + areaCircunferencia);
            System.out.println("el volumen es" + volumen);

            /*
                Ejercicio 6
                     */

                //precio articulo


        System.out.println("\n ejercicio 6");
        sc = new Scanner(System.in();

        System.out.println("ingresa el precio Articulo");
        double precioArticulo = sc.nextDouble();
        System.out.println("ingresa el precio Venta");
        double precioVenta = sc.nextDouble();



        double descuento =  precioArticulo - precioVenta;
        System.out.println("ahorro");


        /*
        Ejercicio 7
         */
        System.out.println("\n ejercicio 7");
        sc = new Scanner(System.in();
        System.out.println("Introduce la distancia en millas marinas");
        double distanciaMillas = sc.nextDouble();

        double distanciaMetros = 1852.0 * distanciaMillas;
        System.out.println("La distancia equivalente en metros es: " + distanciaMetros);


        /*
        Ejercicio 8
         */

        System.out.println("\n ejercicio 8");
        sc = new Scanner(System.in();
        System.out.println("Introduce el valor del primer numero");
        num1 = sc.nextDouble();
        System.out.println("El valor del segundo numero");
        double segundo = sc.nextDouble();

        System.out.println("El orden ascendente es: " + Math.min(primero, segundo);
        + "," + Math.max (primero, segundo));


        /*
        Ejercicio 9
         */
        System.out.println("\n ejercicio 9");
        sc = new Scanner(System.in();

        System.out.println("Introduce el valor del primer numero");
        double numero1 = sc.nextDouble();
        System.out.println("Introduce el valor del segundo numero");
        double numero2 = sc.nextDouble();

        /*
        Ejercicio 10
         */
        System.out.println("\n ejercicio 10");
        sc = new Scanner(System.in();

        System.out.println("Introduce el valor del primer numero");
        double n1 = sc.nextDouble();
        System.out.println("Introduce el valor del segundo numero");
        double n2 = sc.nextDouble();
        System.out.println("Introduce el valor del tercer numero");
        double n3 = sc.nextDouble();

        double max = Math.max(Math.max(n1, n2, n3);
        System.out.println("El valor maximo es: " + max);














    }
}