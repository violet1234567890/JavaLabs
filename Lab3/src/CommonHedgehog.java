public class CommonHedgehog implements Hedgehogs{
    public CommonHedgehog() {
        name = "";
    }
    public CommonHedgehog(String word) {
        name = word;
    }
    @Override
    public String getName() {
        return name;
    }
    private String name;
}
