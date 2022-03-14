package adapter_pattern;

public class AdapterPatternMain {

    public static void main(String[] args) throws InterruptedException {
        IPhone myIphone = new IPhone("my iphone");

        CTypePort cTypeAdapter = new CTypeAdapter(myIphone);
        cTypeAdapter.charge();
    }
}

