import animales.IAnimal;

public class Perro extends Animal implements IAnimal,IMamifero{

    private String raza;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void correr(){
        System.out.println("Correr");
    }
    @Override
    public void comer() {
      //a,b,c,

    }

    @Override
    public void makeSound(){
        System.out.println("Guau");
    }


}
