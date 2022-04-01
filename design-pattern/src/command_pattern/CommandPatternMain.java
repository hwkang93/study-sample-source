package command_pattern;

public class CommandPatternMain {
    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();
        Light roomLight = new Light("안방");
        BlueToothSpeaker blueToothSpeaker = new BlueToothSpeaker("거실");

        LightOnCommand lightOnCommand = new LightOnCommand(roomLight);
        LightOffCommand lightOffCommand = new LightOffCommand(roomLight);

        SpeakerOnCommand speakerOnCommand = new SpeakerOnCommand(blueToothSpeaker);
        SpeakerOffCommand speakerOffCommand = new SpeakerOffCommand(blueToothSpeaker);

        control.setCommand(0, lightOnCommand, lightOffCommand);
        control.setCommand(1, lightOnCommand, lightOffCommand);
        control.setCommand(2, lightOnCommand, lightOffCommand);

        control.onButtonClick(0);
        control.onButtonClick(1);
        control.onButtonClick(2);

        control.undoButtonClick();
    }
}
