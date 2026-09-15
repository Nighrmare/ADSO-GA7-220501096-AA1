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
    }
}
