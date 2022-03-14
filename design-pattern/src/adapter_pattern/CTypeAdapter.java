package adapter_pattern;

public class CTypeAdapter implements CTypePort {

    private final Pin8Port pin8Port;

    public CTypeAdapter(Pin8Port pin8Port) {
        this.pin8Port = pin8Port;
    }

    @Override
    public void charge() throws InterruptedException {
        pin8Port.chargeIPhone();
    }
}
