public class AbstractClassProb extends AbstactClassProb{

    @Override
    void notDisplay() {
        System.out.println("Not Display method implementation FROM TEST ABSTRACT CLASS");
    }
    public static void main(String[] args) {
        AbstactClassProb obj = new AbstractClassProb();
        obj.display();
        obj.notDisplay();
    }
}
