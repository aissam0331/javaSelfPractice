package day11_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Owner {
    public String owner;
    public String location;
    public int numOfStars;
    public ArrayList<Server> servers = new ArrayList<> (Arrays.asList ( ));
    public ArrayList<Chef>chefs = new ArrayList<> ( Arrays.asList () );

    public Owner(String owner, String location, int numOfStars, ArrayList<Server> servers, ArrayList<Chef> chefs) {
        this.owner = owner;
        this.location = location;
        this.numOfStars = numOfStars;
        this.servers = servers;
        this.chefs = chefs;
    }
}



