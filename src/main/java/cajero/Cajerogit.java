/*
Proyecto Cajero Automático con 3 opciones al Iniciar. Adicionalmente se tiene un saldo inicial de 5000 soles peruanos.
Estas 3 opciones son:
1) Deposite dinero a sus cuentas
2) Retire dinero de sus cuentas
3) Salir
*/

package cajero;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Cajerogit {

    public static void main(String[] args) {
        final int saldo_inicial = 1000;
        int opcion;
        float deposito, retiro, saldoActual;

        opcion = Integer.parseInt(JOptionPane.showInputDialog("Su cajero Automático le da la bienvenida, por favor escoga una opción: \n"
        + "1. Deposite dinero a sus cuentas\n"
        + "2. Retire dinero de sus cuentas\n"
        + "3. Salir"));

        switch(opcion){
        case 1: deposito = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad de dinero que desea ingresar en su cuenta"));
                          saldoActual = saldo_inicial+deposito;
                          JOptionPane.showMessageDialog(null, "El dinero total en su cuenta es: "+saldoActual);
                          break;
        case 2: retiro = Float.parseFloat(JOptionPane.showInputDialog("Digite su monto que desea retirar"));
                        if (retiro > saldo_inicial) {
                            JOptionPane.showMessageDialog(null,"Retiro incorrecto");
                        }
                        else{
                             saldoActual = saldo_inicial - retiro;
                             JOptionPane.showMessageDialog(null,"El dinero que le queda en su cuenta es: "+saldoActual);
                        }     
        case 3: break;
        default: JOptionPane.showMessageDialog(null,"Esta opción no existe");

        }

    }


}
