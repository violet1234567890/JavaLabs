public class Lynx implements Feline{
    public Lynx() {
        name = "";
    }
    public Lynx(String word) {
        name = word;
    }
    @Override
    public String getName() {
        return name;
    }
    private String name;
}
