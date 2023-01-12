public class fizz {
    public static void main(String[] args) {
        int i = 15;
        if(i%3==0 )
        System.out.println("Fizz");
        else if(i%5==0 )
        {
            System.out.println("Buzz");
        }
        else if(i%3==0 && i%5==0){
            System.out.println("FizzBuzz");
        }

    }
    
}
