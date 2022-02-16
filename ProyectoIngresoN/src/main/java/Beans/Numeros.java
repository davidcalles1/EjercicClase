/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import Services.IDatos;

/**
 *
 * @author Alvaro
 */
public class Numeros implements IDatos {
//
   @Override
    public String cn(double dato1, double dato2) {
        String resultado;

        if(dato1 >= 0 && dato2 >= 0){
            resultado = "Ambos numeros son positivos";
        }
        else if(dato1 < 0 && dato2 >= 0){
            resultado = dato1 + "El primer dato es negativo y el segundo " + dato2 + "positivo";
        }
        else if(dato2 < 0 && dato1 >= 0){
            resultado =dato2 + "El segundo dato es negativo y el primero " + dato1 + " positivo";
        }
        else{
            resultado = "Los 2 numeros son negatis";
        }
        return resultado;
    }
}
