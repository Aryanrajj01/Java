class abc {
    int id;
    String name;
    abc(String name,int id){
        this.name = name;
        this.id = id;

    }   
}
class acd{
    public static void main(String[] args){
        abc obj = new abc("akash",12);
        System.out.println(obj.name + obj.id);
    }
}
