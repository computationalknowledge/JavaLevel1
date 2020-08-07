public class EvenOdd{
    static boolean isEven = false;
    static int number = 1;
    public static void main(String [] args){
        recursion();
    }

    static void recursion(){
        if (isEven){
            isEven = false;
        }
        else {
            isEven = true;
        }
        System.out.println(number + " is even: " + isEven  );
        number++;
        if (number < 3000){ recursion(); }
        
    }
}
