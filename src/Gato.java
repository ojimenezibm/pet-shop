import animales.IAnimal;

public class Gato extends Animal implements IAnimal {

    public Gato(){
        super("gato");
        System.out.println("Construyendo clase gato");
    }

    public Gato(String edad){
        super("gato",edad);
        System.out.println("Construyendo clase gato");
    }

    @Override
    public void comer() {
        //x,y,z
    }

    @Override
    public void correr(){
        System.out.println("Correr");
    }

    @Override
    public void makeSound(){
        System.out.println("Miau");
    }

    public void makeMiau(){
        System.out.println("Miau");
    }
}
