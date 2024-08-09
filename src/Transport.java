public abstract class Transport implements Drawable {
    private String name;

    public Transport(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
