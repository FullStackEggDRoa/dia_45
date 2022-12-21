/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_9.Entidades;

/**
 *
 * @author droa
 */
public class Matematica {
    
    // Atributos
    private float num1;
    private float num2;
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    //Consturctores

    public Matematica() {
    }

    public Matematica(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    
    //Métodos
    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }
    
    public int devolverMayor(){
        int bandera=0; // 1 -> Num1 | -1 -> Num2 | 0 -> No validado
        if(num1>num2){
            bandera=1;
        }else{
            bandera=-1;
        }
             
        return bandera;
    }
    
    public void calcularPotencia(){
        int num1_aux=0;
        int num2_aux=0;
        if(devolverMayor()==1){
            num1_aux=Math.round(num1);
            num2_aux=Math.round(num2);
            System.out.println("Potencia del número "+ANSI_RED+num1_aux+ANSI_RESET+" elevado al "+ANSI_GREEN+num2_aux+ANSI_RESET+" es : "+ANSI_CYAN+Math.pow(num1_aux,num2_aux)+ANSI_RESET);
        }else{
            num1_aux=Math.round(num2);
            num2_aux=Math.round(num1);
            System.out.println("Potencia del número "+ANSI_RED+num1_aux+ANSI_RESET+" elevado al "+ANSI_GREEN+num2_aux+ANSI_RESET+" es : "+ANSI_CYAN+Math.pow(num1_aux,num2_aux)+ANSI_RESET);
        }
    }
    public void calcularRaiz(){
        int num2_aux=0;
        if(devolverMayor()==-1){            
            num2_aux=Math.round(num1);
            System.out.println("La Raíz Cuadrada del menor número ("+ANSI_RED+num2_aux+ANSI_RESET+") es: "+ANSI_CYAN+Math.sqrt(Math.abs(num2_aux))+ANSI_RESET);
        }else {
            num2_aux=Math.round(num2);
            System.out.println("La Raíz Cuadrada del menor número ("+ANSI_RED+num2_aux+ANSI_RESET+") es: "+ANSI_CYAN+Math.sqrt(Math.abs(num2_aux))+ANSI_RESET);
        }
    }
    
    
}
