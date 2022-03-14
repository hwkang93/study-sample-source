package adapter_pattern;

public class IPhone implements Pin8Port {

    private String name;

    public IPhone(String name) {
        this.name = name;
    }

    @Override
    public void chargeIPhone() throws InterruptedException {
        System.out.println("charging iphone...");
        Thread.sleep(1000);

        System.out.println( this.name + " is charged.");
    }
}
