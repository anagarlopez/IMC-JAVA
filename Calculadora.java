

public class Calculadora {
    
    public String calculateIMC(Persona persona) {

        double peso = persona.getPeso();
        double estatura = persona.getEstatura();

        double imc = peso / (Math.pow(estatura, 2));
        
        if (imc <16) {
            return " Delgadez severa";
        }        
        if (imc >= 16 && imc < 17) {
        return" Delgadez moderada";
        }        
        if (imc >= 17 && imc < 18.5) {
        return" Delgadez leve";
        }        
        if (imc >= 18.5 && imc < 25) {
            return" Peso normal";
        }        
        if  (imc >= 25 && imc < 30) {
            return" Sobrepeso";
        }        
        if (imc >= 30 && imc < 35) {
            return" Obesidad leve";
        }
        if (imc >= 35 && imc < 40) {
            return" Obesidad moderada";
        }
        else {
            return" Obesidad mórbida";
        }
    }   
}