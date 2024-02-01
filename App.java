

import java.util.Scanner;

public final class App {
    private App() {
    }

    @Override
    public String toString() {
        return "App []";
    }

    
    
    public static void main(String[] args) {

        Scanner dataEntry = new Scanner(System.in);


        System.out.println("Introduce tu altura en metros: ");
        double estatura1 = dataEntry.nextDouble();

        System.out.println("Introduce tu peso en kilogramos: ");
        double peso1 = dataEntry.nextDouble();


        Persona persona = new Persona(peso1, estatura1);

        Calculadora imcCaculator = new Calculadora();

        String result = imcCaculator.calculateIMC(persona);

        double calculated = persona.getPeso() / Math.pow(persona.getEstatura(), 2);
        
        System.out.println ("Tu IMC es: " + calculated  + result);




        dataEntry.close();
    }

    

}