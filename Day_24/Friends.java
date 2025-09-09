//Friend.java
public class Friends {
    public static void main(String[] args) {
     Cake obj = new Cake("Babloo","Red velvet",3);
     System.out.println(obj);    }
}
//Cake.java
class Cake {
    String name;
    String flavour;
    int kgs;
    //Constructor
    Cake() {
        name=null;
        flavour="Vanilla";
        kgs=0;
    }
    Cake(String n,String f) {
        name=n;
        flavour=f;
    }
    Cake(String n,int kg) {
        name=n;
        kgs=kg;
        flavour="Vanilla";
    }
    Cake(String n,String f,int kg) {
        name=n;
        flavour=f;
        kgs=kg;
    }
    public String toString() {
        return "name: "+name + " | "+"Flavour: "+flavour+" | "+"Kgs: "+kgs;
    }
}
