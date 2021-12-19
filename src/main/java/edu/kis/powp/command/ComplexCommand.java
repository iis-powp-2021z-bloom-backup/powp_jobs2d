package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ComplexCommand implements DriverCommand {

    private final List<DriverCommand> listOfOperations;

    private ComplexCommand() {
        this.listOfOperations = new ArrayList<>();
    }

    public ComplexCommand(List<DriverCommand> list) {
        this();
        this.addCommands(list);
    }

    public void addCommand(DriverCommand command) {
        if (command != null) {
            listOfOperations.add(command);
        }
    }

    public void addCommands(List<DriverCommand> list) {
        list.stream()
                .filter(Objects::nonNull)
                .forEach(listOfOperations::add);
    }

    @Override
    public void execute(Job2dDriver driver) {
        listOfOperations.forEach(x -> x.execute(driver));
    }

    public static final class Builder {
        private final List<DriverCommand> listOfOperations;

        public Builder() {
            this.listOfOperations = new ArrayList<>();
        }

        public Builder operateTo(int x, int y) {
            this.listOfOperations.add(new OperateToCommand(x, y));
            return this;
        }

        public Builder setPosition(int x, int y) {
            this.listOfOperations.add(new SetPositionCommand(x, y));
            return this;
        }

        public DriverCommand build() {
            return new ComplexCommand(listOfOperations);
        }
    }
}

