import javax.print.attribute.standard.PrinterMoreInfoManufacturer;

public class Animal {

    protected void Saludar(){}

    public Animal(){
        System.out.println("Construyendo clase Animal");
    }

    public Animal(String tipo){
        System.out.println("Constuyendo Animal de tipo "+ tipo);
    }

    public Animal(String tipo,String edad){
        System.out.println("Constuyendo Animal de tipo "+ tipo + " y tiene "+edad);
    }



    private String name;
    private String specie;
    private String color;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
