import java.util.concurrent.ThreadLocalRandom;

public class Generate {

    public static String getColour(){
        int colourNum = ThreadLocalRandom.current().nextInt(Lists.colourNamesLength);
        String colourName = Lists.colourNames.get(colourNum);
        String colourCode = Lists.coloursMap.get(colourName);
        return colourName + " \t " + colourCode;
    }
}
