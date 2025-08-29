
@FunctionalInterface
public interface Upendra {

    void printFromUpendra(String name);

    default void print(String name)
    {
       System.out.println(name +"From upendra interface" );
    }
}
@FunctionalInterface
interface Charan extends  Upendra{

    default void print(String name)
    {
        System.out.println(name +"From charan interface" );
    }
}

class  Wipro implements  Charan {

    public static void main(String[] args) {

        Wipro w=new Wipro();
        w.printFromUpendra("vb nm");
    }

    @Override
    public void printFromUpendra(String name) {
        print(name);
        System.out.println("From Implementation clase"+ name);
    }
}
