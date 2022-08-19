package school.mjc.stage0.conditions.task5;

public class RangeNumbersPrinter {
    public void printRange(int number) {
        switch (number >= 1 && number <= 5?1: number >= 6 && number <= 10? 2:3){
            case (1):
                System.out.println("number is between 1 and 5");
                break;
            case (2):
                System.out.println("number is between 6 and 10");
                break;
            default:
                System.out.println("");
                break;

        }
    }
}
