import animales.IAnimal;

import javax.swing.*;

public class PetShop {
    Animal animal;
    public void setAnimal(){
        /*animal = new Animal();

        String name = JOptionPane.showInputDialog("Ingrese el nombre del animal");

        int age = Integer.parseInt(JOptionPane.showInputDialog("Ingresar edad de animal"));

        String specie = JOptionPane.showInputDialog("Ingresar especie de animal");

        animal.setName(name);
        animal.setSpecie(specie);
        animal.setAge(age);

        boolean isDog = false;
        if("perro".equals(specie)){
            isDog = true;
        }
        if(isDog){
            JOptionPane.showMessageDialog(null, "excelente");
        }*/
       /* String[] names = {"Theo", "Frankie", "Coco", "Tato"};

        List animals = new ArrayList<Animal>();
        String name = "";
        for(int i=0;i<3;i++){

            //System.out.println("mi nombre es "+names[i]);
            name = JOptionPane.showInputDialog("ingrese su nombre");
            JOptionPane.showMessageDialog(null, name);

        }*/

        Gato gato = new Gato();
        Perro perro = new Perro();

        gato.Saludar();

        imprimirSonido(gato);
        imprimirSonido(perro);

    }


    private void imprimirSonido(IAnimal animalRecibido){
        animalRecibido.makeSound();
    }

    public void showAnimalInfo(){
        JOptionPane.showMessageDialog(null, animal.getAge());

    }

    public static void main(String args[]) {
        PetShop petShop = new PetShop();
        petShop.setAnimal();
        //petShop.showAnimalInfo();
    }
}
