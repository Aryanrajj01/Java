class Add{
    void run(){
        System.out.println("running");
    }
}
class dog extends Add{
    void bark(){
        System.out.println("bARking");
    }
}
class XX{
    public static void main(String[] args) {
        dog d = new dog();
        d.bark();
        d.run();
    }
}
