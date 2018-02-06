/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcular;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author entrar
 */
public class Calcular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("Introduzca un número: ");
        BufferedReader in1 =  new BufferedReader(new InputStreamReader(System.in)); 
        int number1=Integer.parseInt(in1.readLine());
        System.out.println("Introduzca otro número: ");
        BufferedReader in2 =  new BufferedReader(new InputStreamReader(System.in)); 
        int number2=Integer.parseInt(in2.readLine());
        System.out.println("La suma de los dos números es: " + add(number1, number2));
        System.out.println("La resta de los dos números es: " + subtraction(number1, number2));
        System.out.println("La multiplicación de los dos números es: " + multiplication(number1, number2));
        System.out.println("La división de los dos números es: " + division(number1, number2));
        
        
    }

    private static int add(int n1, int n2) {
        pack1.Calculadora_Service service = new pack1.Calculadora_Service();
        pack1.Calculadora port = service.getCalculadoraPort();
        return port.add(n1, n2);
    }

    private static int subtraction(int n1, int n2) {
        pack1.Calculadora_Service service = new pack1.Calculadora_Service();
        pack1.Calculadora port = service.getCalculadoraPort();
        return port.subtraction(n1, n2);
    }

    private static int multiplication(int n1, int n2) {
        pack1.Calculadora_Service service = new pack1.Calculadora_Service();
        pack1.Calculadora port = service.getCalculadoraPort();
        return port.multiplication(n1, n2);
    }

    private static int division(int n1, int n2) {
        pack1.Calculadora_Service service = new pack1.Calculadora_Service();
        pack1.Calculadora port = service.getCalculadoraPort();
        return port.division(n1, n2);
    }
    
    
    
}
