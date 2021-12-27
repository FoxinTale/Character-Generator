import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        /*
                Featuring:
                Over 1800 last names.
                Over 4,000 first names.
                Over 100 different colour options for both eyes and hair.

         */
        public static void main(String[] args) {
                Lists.initValues();
               // System.out.println(Generate.getColour());
                GUI.createGUI();
        }

        public static void aaaa(){
                File thing = new File("data" + File.separator +  "male.txt");
                ArrayList<String> list= new ArrayList<String>();

                try {
                        Scanner thingReader = new Scanner(thing);
                        while(thingReader.hasNext()){
                                list.add(thingReader.next());
                        }
                        thingReader.close();
                } catch (FileNotFoundException e) {
                        e.printStackTrace();
                }

                int length = list.size();

                for(int i = 0; i < length; i++){
                        System.out.print("\"" +  list.get(i) + "\",");
                        if(i % 50 == 0){
                                System.out.println();
                        }
                }

        }

}
