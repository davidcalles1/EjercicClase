/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package newpackage;

import Beans.Numeros;
import Pojos.Datos;
import java.util.Scanner;

/**
 *
 * @author Alvaro
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
   {
             var Scan = new Scanner(System.in);

		System.out.print("Escriba primer numero");
		double dato1 = Scan.nextDouble();

                 System.out.print("Escriba Segundo Numero");
                 double dato2 = Scan.nextDouble();

		var num = new Datos(dato1,dato2);

		var R = new Numeros();
		String resultado = R.cn(num.getDato1(), num.getDato2());

		System.out.println(resultado);
    }
    }
}
