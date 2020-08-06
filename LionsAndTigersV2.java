import java.util.Random; 

public class First{

    public static void main(String []args){
        Jungle.RunGame();
       
        Jungle.DoCompetition();
        Jungle.ReportOnWinner();
    }
}

class Jungle{
    static Lion[] lions;
    static Tiger[] tigers;
    
    public static int NumberOfLIONWinners = 0;
    public static int NumberOfTigerWinners = 0;
    
    public static void RunGame(){
            lions = new Lion[10];
            tigers = new Tiger[10];

        for (int i=0; i<10; i++){
            // let's store each Feline Reference in an Array
            lions[i] = new Lion();
            tigers[i] = new Tiger();
        }
    }

    public static void DoCompetition(){
        for (int i=0; i<10; i++){
            // let's compare the strength of each set of Felines stored in our Arrays!
            if ( (lions[i]).getStrength()  >   (tigers[i]).getStrength() ){
                Jungle.NumberOfLIONWinners++;
            }
            else {
                Jungle.NumberOfTigerWinners++;
            }
        }
    }

    public static void ReportOnWinner(){
        System.out.println("LIONS: " + Jungle.NumberOfLIONWinners);
        System.out.println("Tigers: " + Jungle.NumberOfTigerWinners);
    }
}

class Feline{
        public float Strength;

        public void setStrength(){
            Random rand = new Random(); 
            this.Strength = rand.nextInt(100); 
        }
         
        public float getStrength(){
        return this.Strength;
    }
}

class Lion extends Feline{
        public Lion(){
            setStrength();
        }
        public void setStrength(){
            Random rand = new Random(); 
            this.Strength = rand.nextInt(100); 
        }
}

class Tiger extends Feline{
    public Tiger(){
        setStrength();
    }
    public void setStrength(){
        Random rand = new Random(); 
        this.Strength = rand.nextInt(100); 
    }
}
