package ViewPackage;

import StatePackage.State;

import java.util.Observable;
import java.util.Observer;

public class View implements Observer {
    @Override
    public void update(Observable o, Object arg)
    {
        System.out.println("Tjohej");
    }
}
