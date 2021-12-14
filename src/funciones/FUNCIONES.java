package funciones;

import java.util.Scanner;

public class FUNCIONES {
/*
    public static int suma(int a, int b){
        int resultado =0;
        resultado = a + b;
        return resultado;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el primer número para la suma");
        int v1 = sc.nextInt();
        System.out.println("Ingrese el segundo número para la suma");
        int v2 = sc.nextInt();
        suma(v1,v2);
        System.out.println("El resultado de la suma es: "+suma(v1,v2));
    }
    
*/    
    public static int facturacion(int estrato, int tarifa){
        int resultado =0;
        if (estrato == 1){
            tarifa = 10000;
            resultado = tarifa;
        }else if (estrato == 2){
            tarifa = 15000;
            resultado = tarifa;
        }else if (estrato == 3){
            tarifa = 20000;
            resultado = tarifa;
        }else if (estrato == 4){
            tarifa = 25000;
            resultado = tarifa;
        }else if (estrato == 5){
            tarifa = 30000;
            resultado = tarifa;
        }else{
            tarifa = 0;
            resultado = tarifa;
        }
        
        return resultado;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int tar = 0;
        System.out.println("Ingrese el número de personas");
        int personas = sc.nextInt();
        for (int i = 1; i <= personas; i++){
            System.out.println("Ingrese la cedula de la  persona número: "+i);
            int cedula = sc.nextInt();
            System.out.println("Ingrese el estrato de la persona número: "+i);
            int est = sc.nextInt();
            System.out.println("La facturación de la persona "+i+" es: "+facturacion(est, tar));
        }
        
        
    }
}