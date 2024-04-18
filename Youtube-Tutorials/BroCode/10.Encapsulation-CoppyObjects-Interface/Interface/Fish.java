public class Fish implements Predator, Prey {

    @Override
    public void hunt() {
        System.out.println("<< This fish hunting smaller fish.. >>");
    }

    @Override
    public void flee() {
        System.out.println("* This fish fleeing from a larger fish.. *");
    }
    
}
