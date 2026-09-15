import javax.swing.*;
import java.awt.*;

public class Calculadora
{
    public int sumar(int num1, int num2)
    {
        return num1 + num2;
    }

    public int restar(int num1, int num2)
    {
        return num1 - num2;
    }

    public int multiplicar(int num1, int num2)
    {
        return num1 * num2;
    }

    public double dividir(double num1, double num2)
    {
        return num1 / num2;
    }

    public String esMayor(int num1, int num2)
    {
        if (num1 > num2) {
            return num1 + " es mayor que " + num2;
        } else if (num2 > num1) {
            return num2 + " es mayor que " + num1;
        } else {
            return "Ambos números son iguales";
        }
    }

    public boolean primo(int num1)
    {
        if (num1 <= 1) {
            return false;
        }

        for (int i = 2; i <= num1 / 2; i++) {
            if (num1 % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void main()
    {
        Calculadora calculadora = new Calculadora();
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del numero 1"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del numero 2"));

        System.out.println( "el resultado de la suma es: "+calculadora.sumar(num1,num2));

        JOptionPane.showMessageDialog(null,"El resultado de la suma es: "+calculadora.sumar(num1,num2));
        JOptionPane.showMessageDialog(null,"El resultado de la resta es: "+calculadora.restar(num1,num2));
        JOptionPane.showMessageDialog(null,"El resultado de la multiplicacion es: "+calculadora.multiplicar(num1,num2));
        JOptionPane.showMessageDialog(null,"El resultado de la division es: "+calculadora.dividir(num1,num2));
        JOptionPane.showMessageDialog(null, calculadora.esMayor(num1, num2));

        if (calculadora.primo(num1)) {
            JOptionPane.showMessageDialog(null, num1 + " SÍ es un número primo");
        } else {
            JOptionPane.showMessageDialog(null, num1 + " NO es un número primo");
        }
    }
}
