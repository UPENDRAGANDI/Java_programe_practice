public class Animal  implements  Cloneable{

    String name;
    int weight;
    int age;


    Animal(String name,int weight,int age)
    {
        this.name=name;
        this.weight=weight;
        this.age=age;
    }




    public static void main(String[] args) throws CloneNotSupportedException {
        Animal animal=new Animal("Lion",49,20);
        Animal copyAnima= (Animal) animal.clone();
        System.out.println(animal.name+" "+animal.age);
      //  copyAnima.age=20;
        System.out.println(copyAnima.name+" "+copyAnima.age);
        System.out.println(animal.name+" "+animal.age);


    }
}
