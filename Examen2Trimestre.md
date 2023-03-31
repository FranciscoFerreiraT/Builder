## ¿Cual es la función de este patrón?

Es un patron de diseño creacional.

La principal función de este patron builder es la de permitir construir multiples objetos de una misma clase con diferentes atributos (muchos si fuera necesario).
Este patrón separa la construccion de un objeto complejo de su representación, pudiendo así contruir diferentes objetos para después devolver el objeto.

Ejemplo:
Tenemos una `Clase Coche` donde especificamos todos los atributos y los metodos getter y setter.

public class Coche {

    /**
     * Atributos.
     */
    
    String marca;
    String color;
    int puertas;
    int potencia;

    /**
     * Constructor
     * @param marca
     * @param color
     * @param puertas
     * @param potencia
     */
    
     public Coche(String marca, String color, int puertas, int potencia) {
        this.marca = marca;
        this.color = color;
        this.puertas = puertas;
        this.potencia = potencia;
    }

    /**
     * Metos getter y setter
     * */

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}

Creamos la clase builder.

public class BuilderCoche {
    //Objeto a construir.Protegido para que solamente sea accesible desde las clases del mismo paquete.
    protected Coche coche;

    //Contructor coche.
    public BuilderCoche(){
        coche = new Coche();
    }

    //Metodo que devuelve coche.
    public Coche build (){
        return this.coche;
    }

    //Metodos para establece los parámetros del objeto.

    public BuilderCoche setMarca(String marca){
        coche.setMarca(marca);
        return this;
    }

    public BuilderCoche setColor (String color){
        coche.setColor(color);
        return this;
    }

    public BuilderCoche setPuertas (int puertas){
        coche.setPuertas(puertas);
        return this;
    }

    public BuilderCoche setPotencia (int potencia){
        coche.setPotencia(potencia);
        return this;
    }

    public class Main {
        public static void main(String[] args) {
            Coche miCoche = new BuilderCoche()
                .setMarca("Suzuki")
                .setColor("Rojo")
                .setPuertas(3)
                .setPotencia(100)
                .build();
        }
    }  

## ¿Como es su Diagrama de clases? Realiza en el readme el diagrama.

![DiagramaPatronBuilderCoche](imagenes/PatronBuilderCoche.jpg)


## ¿Podríamos combinarlo con el patrón Factory?
Sí, se podría combinar. Por ejempolo; si la clase del "builder" en vez de ser una clase concreta, fuese una *interface*, podríamos a através del patron *Factory* utilizar diferentes *builders* para implementar diferentes objetos.

