import javax.swing.*;

public class Triangulo
{
    public String determinarTipo(double lado1, double lado2, double lado3)
    {
        if (lado1 == lado2 && lado2 == lado3) {
            return "El triángulo es equilátero";
        }
        else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
            return "El triángulo es escaleno";
        }
        else {
            return "El triángulo es isósceles";
        }
    }

    static void main()
    {
        Triangulo triangulo = new Triangulo();

        double lado1 = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el lado 1")
        );

        double lado2 = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el lado 2")
        );

        double lado3 = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el lado 3")
        );

        JOptionPane.showMessageDialog(
                null,
                triangulo.determinarTipo(lado1, lado2, lado3)
        );
    }
}