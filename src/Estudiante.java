import javax.swing.*;

public class Estudiante
{
    String nombre;
    int edad;
    double promedio;

    public void registrar()
    {
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");

        edad = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese la edad del estudiante")
        );

        double nota1 = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese la nota 1")
        );

        double nota2 = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese la nota 2")
        );

        double nota3 = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese la nota 3")
        );

        promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio < 3.0)
        {
            JOptionPane.showMessageDialog(
                    null,
                    "El estudiante " + nombre + " está en riesgo académico"
            );
        }
        else
        {
            JOptionPane.showMessageDialog(
                    null,
                    "El estudiante " + nombre + " no está en riesgo académico"
            );
        }
    }

    static void main()
    {
        Estudiante estudiante = new Estudiante();
        estudiante.registrar();
    }
}