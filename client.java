class Bank{
    void day(){
        System.out.println("Monday");
    }
}
class SBI extends Bank{
    void day(){
        System.out.println("tuesday");
    }
}
class AXIS extends Bank{
    void day(){
        System.out.println("Wednesday");
    }
}
class ICICI extends Bank{
    void day(){
        System.out.println("Thrusday");
    }
}
public class client{
    public static void main(String[] args){
        ICICI a = new ICICI();
        Bank b = new Bank();
        a.day();
        b.day();
    }
}

















