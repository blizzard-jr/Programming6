package org.example.island.commands;


import org.example.commandsManager.ExecuteManager;
import org.example.island.details.exceptions.NoSuchCommandException;

public class Clear extends Command{
    public Clear(){
        super("clear", "Очистить коллекцию");
    }
    @Override
    public void execute(ExecuteManager manage){
        manage.executeCLear();
    }

    @Override
    public Command clientExecute(String[] args) throws NoSuchCommandException {
        checkArgs(args);
        return this;
    }
}