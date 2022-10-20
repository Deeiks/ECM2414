import java.util.*;
public class Ugg {
    public enum UggRockSize {
        BIGUN((short) 5),
        QUITEBIGUN((short) 3),
        NOTSOBIGUN((short) 1);
        private short multiplierValue;

        UggRockSize(short multiplierValue) {
            this.multiplierValue = multiplierValue;
        }

        public short getMultiplier() {
            return multiplierValue;
        }

        public String toString() {
            String srs;
            switch (multiplierValue) {
                case 5:
                    return  ("Bigun");
                case 3:
                    return("Quite Bigun");
                case 1:
                    return("Not so Bigun");
                default:
                    return("N/A");

            }
        }
    }
    public enum UggRockType {
        SPECKILY((short) 7),
        OUCHYBLACK((short) 20),
        FLOATY((short) 2),
        HOTHOTHOT((short) 15);
        private short multiplierValue;
        public String toString(){
            String srt;
            switch (multiplierValue) {
                case 7:
                    return("Speckily");
                case 20:
                    return("Ouchy Black");
                case 2:
                    return ("Floaty");
                case 15:
                    return ("Hot Hot Hot");
                default:
                    return  ("N/A") ;


        }
    }
        UggRockType(short multiplierValue) {
            this.multiplierValue = multiplierValue;
        }
        public short getMultiplier() {
            return multiplierValue;
        }
    }
    public static class UggRock{
        private UggRockType type;
        private UggRockSize size;

        public UggRock (UggRockType type, UggRockSize size){
            this.type = type;
            this.size = size;
        }
        public UggRockType getType() {
            return type;
        }
        public UggRockSize getSize() {
            return size;
        }
        public short rockValue(){
            short sizeV = size.getMultiplier();
            short typeV = type.multiplierValue;

            short rockValue = (short) (sizeV * typeV);

            return rockValue;
        }
            }
    public static UggRock drawRock() {
        UggRockSize size;
        UggRockType type;
        Random rNum = new Random();
        double rockSize = rNum.nextDouble();
        double rockType = rNum.nextDouble();
        if(rockSize < (double) 2/3){
            size = UggRockSize.NOTSOBIGUN;
        } else if(rockSize < (double) 8/9){
            size = UggRockSize.QUITEBIGUN;
        } else{
            size = UggRockSize.BIGUN;
        }
        if(rockType < (double) 1/4){
            type = UggRockType.FLOATY;
        } else if(rockType < (double) 1/2){
            type = UggRockType.HOTHOTHOT;
        } else if (rockType < (double) 3/4){
            type = UggRockType.OUCHYBLACK;
        } else {
            type = UggRockType.SPECKILY;
        }
        return new UggRock(type, size);
        //6:2:1
    }
}
