
/// calculamos el (indice masa corporal) imc= p/(t*t)
/// p= peso
/// t= talla o estatura

public class Persona {
  private double peso;
  private double estatura;

  public Persona(double peso, double estatura) {
    this.peso = peso;
    this.estatura = estatura;
  }

    public double getPeso() {
      return peso;
    }

    public void setPeso(double peso) {
      this.peso = peso;
    }

    public double getEstatura() {
      return estatura;
    }

    public void setEstatura(double estatura) {
      this.peso = estatura;
    }
  
}
