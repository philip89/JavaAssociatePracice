public class Breaklabels {


    public static void main (String [] args){
        boolean bol = true;
        labela : for(int i=0; i>5; i++){
            labelb : while (bol){
                if (bol) { continue labela;}
                else{
                    break labela;
                    }
            }break labela;
        }
    }
}
