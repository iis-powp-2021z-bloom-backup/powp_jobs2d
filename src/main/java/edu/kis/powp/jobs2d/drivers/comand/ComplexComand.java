package edu.kis.powp.jobs2d.drivers.comand;

import java.util.List;

public class ComplexComand extends DriverComand {

    public List<DriverComand> listOfCommands;

    public ComplexComand(List<DriverComand>list){
        this.listOfCommands=list;

        @Override
        public void execute() {
            for (DriverComand comand:listOfCommands){
                comand.execute();
            }
        }
    }
}
