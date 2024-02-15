public class Manul implements Feline{
    public Manul() {
        name = "";
    }
    public Manul(String word) {
        name = word;
    }
    @Override
    public String getName() {
        return name;
    }
    private String name;
}
