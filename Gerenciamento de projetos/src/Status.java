
public class Status implements Command{

    //ArrayList<Command> status = new ArrayList<>();
    Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    @Override
    public void execute(){
        command.execute();
    }
    
}
