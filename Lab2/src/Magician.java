import org.jetbrains.annotations.NotNull;

public class Magician {
    @DoNTimes(num = 3)
    public void prediction(@NotNull Integer age, @NotNull MagicType magic) {
        System.out.println("You have " + (100 - age) + " years left" + " Magic is " + magic.type);
    }
    @DoNTimes(num = 3)
    public void coolPrediction(@NotNull Integer age) {
        System.out.println("You will live forever");
    }
    @DoNTimes(num = 1)
    public void tarotDivination(@NotNull Integer age)
    {
        System.out.println("You will find your love soon");
    }
    @DoNTimes(num = 2)
    protected void tarotDivination()
    {
        System.out.println("You will find your love soon");
    }
    @DoNTimes(num = 3)
    protected void lifeLine(@NotNull Double money, @NotNull Integer age, @NotNull Boolean isMarried)
    {
        if(money > 1000000 && age < 50 && isMarried)
        {
            System.out.println("Everything is good");
        }
        else {
            System.out.println("You need to try more");
        }
    }
    @DoNTimes(num = 4)
    private void magicBall(@NotNull String colour, @NotNull Integer age)
    {
        if (colour.equals("blue"))
        {
            System.out.println("You have good future");
        }
        else {
            System.out.println("I can't see your future");
        }
    }
    @DoNTimes(num = 5)
    private void askForMoney()
    {
        System.out.println("Give me money");
    }
}
