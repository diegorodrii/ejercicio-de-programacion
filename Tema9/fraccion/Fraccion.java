
/**Crea la clase Fracción. Los atributos serán numerador y denominador. Y algunos de los
métodos pueden ser invierte, simplifica, multiplica, divide, etc.  */

package fraccion;

public class Fraccion {
    private int numerador = 1;
    private int denominador = 1;
  
  
    
  
  
    public Fraccion(int numerador, int denominador) {
      this.numerador = numerador;
      this.denominador = denominador;
    }
  
  
    public Fraccion invierte(){
      return new Fraccion(this.denominador, this.numerador);
    }
  
  
  
    public Fraccion invertida(Fraccion fraccionEntrada){
      Fraccion aux = new Fraccion(fraccionEntrada.denominador, fraccionEntrada.numerador);
      return aux;
    }

    public void simplifica() {

    }

    public void multiplica() {

    }

    public void divide() {

    }


    @Override /*Le ponemos override para que no use el toString de la clase object || NOTACIÓN || Para que mire si hay un metodo igual en una superclase*/
    public String toString() {
      return numerador + "/" + denominador;
    }
    

}
