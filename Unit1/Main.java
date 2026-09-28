public class Main
{
    public static void main(String[] args){
        Tshirt tracer = new Tshirt();
        int initial = 10;
        int outcome = tracer.process(initial);
        tracer.displayResult(outcome);
    }
}

