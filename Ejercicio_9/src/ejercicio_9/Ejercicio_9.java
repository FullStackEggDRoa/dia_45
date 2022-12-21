/*
    EJERCICIO 9:
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */

package ejercicio_9;

import ejercicio_9.Entidades.Matematica;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Creación de un Objeto Matemática:");
              
        Matematica mat1=new Matematica();
        
        System.out.println("Instanciando Atributos con Números Aleatorios ... ");
        
        mat1.setNum1((float)(Math.random()*20)-10);
        mat1.setNum2((float)(Math.random()*20)-10);
        
        System.out.println("Validación de número Mayor .... ");
        switch (mat1.devolverMayor()) {
            case 1 -> System.out.println("Numero 1: "+Matematica.ANSI_PURPLE+mat1.getNum1()+Matematica.ANSI_RESET+" es mayor que Número 2: "+Matematica.ANSI_PURPLE+mat1.getNum2()+Matematica.ANSI_RESET);
            case -1 -> System.out.println("Numero 2: "+Matematica.ANSI_PURPLE+mat1.getNum2()+Matematica.ANSI_RESET+" es mayor que Número 1: "+Matematica.ANSI_PURPLE+mat1.getNum1()+Matematica.ANSI_RESET);
            default -> System.out.println("Números no se encuentran Inicializados");
        }
        
        System.out.println("Cálculo de Potencia (Número Mayor elevado al Número Menor): ");
        mat1.calcularPotencia();
        
        System.out.println("Cálculo de Raiz Cuadrada (Número Menor)");
        mat1.calcularRaiz();
        
    }
    
}
