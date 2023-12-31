package aoc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedList;

public abstract class Day {

    private int day;
    private int year;

    public Day(int day, int year){
        this.day = day;
        this.year = year;

        try{
            solution();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public abstract void solution() throws IOException;

    /**
     * Reads the input file based on the day given in the constructor
     * It will look for the file inputs/day<day>.txt
     * @return - a collection of all the lines in the file
     * @throws IOException
     */
    public Collection<String> readInput() throws IOException{
        Collection<String> list = new LinkedList<String>();
        BufferedReader reader = new BufferedReader(
                new FileReader("src/main/resources/" + year + "/day" + day + ".txt"));

        String line;

        while ((line = reader.readLine()) != null){
            list.add(line);
        }
        reader.close();

        return list;
    }

}
