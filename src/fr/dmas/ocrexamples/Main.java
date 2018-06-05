package fr.dmas.ocrexamples;

import fr.dmas.ocrexamples.utils.CurrentTime;
import fr.dmas.ocrexamples.utils.ScanName;

public class Main {
    public static void main(String[] args) {
        String name = ScanName.getName();
        System.out.println("Hi "+name+", it is : "+CurrentTime.getTime()+", Welcome to openClassRooms !");
    }
}
