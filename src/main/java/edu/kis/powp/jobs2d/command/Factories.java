package edu.kis.powp.jobs2d.command;



import java.util.ArrayList;
import java.util.List;

public class Factories {


    public static List<DriverCommand> Square(){
        ArrayList<DriverCommand> commands = new ArrayList<>();
        commands.add(new SetPositionCommand(0,0));
        commands.add(new OperateToCommand(0,50));
        commands.add(new OperateToCommand(50,50));
        commands.add(new OperateToCommand(50,0));
        commands.add(new OperateToCommand(0,0));
        return commands;

    }

    public static List<DriverCommand> Rectangle(){
        ArrayList<DriverCommand> commands = new ArrayList<>();
        commands.add(new SetPositionCommand(0,0));
        commands.add(new OperateToCommand(0,50));
        commands.add(new OperateToCommand(100,50));
        commands.add(new OperateToCommand(100,0));
        commands.add(new OperateToCommand(0,0));
        return commands;
    }

    public static List<DriverCommand> Triangle(){
        ArrayList<DriverCommand> commands = new ArrayList<>();
        commands.add(new SetPositionCommand(0,0));
        commands.add(new OperateToCommand(0,50));
        commands.add(new OperateToCommand(100,50));
        commands.add(new OperateToCommand(0,0));
        return commands;
    }
}
