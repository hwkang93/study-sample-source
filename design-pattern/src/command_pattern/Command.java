package command_pattern;

public interface Command {

    /**
     * 명령을 실행한다.
     */
    void execute();

    /**
     * 이전 명령을 다시 실행한다.
     */
    void undo();
}
