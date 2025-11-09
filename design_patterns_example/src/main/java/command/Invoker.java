package command;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

/**
 *  Created by jahnaariellegoldman on 8/2/16.
 *
 * Invoker Class
 /*
 *
 */
public class Invoker {
    private HashMap<String, Command> commands = new HashMap<String, Command>();

    public void addAndExecute(String name, Command command) {
        commands.put(name, command);
        command.execute();
    }
    public void listCommands() {
        System.out.println("Commands Available: " + commands.keySet().stream().collect(joining(", ")));
        }


}

