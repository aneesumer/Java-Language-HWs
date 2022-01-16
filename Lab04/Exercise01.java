// Kangaroo Class

public class Kangaroo {
    String name;
    int age;

    public Kangaroo (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display (String country) {
        System.out.println(name + " " + country + " " + ++age);
    }
}

// Kangaroo MainClass
public class KangarooMain {
 public static void main(String [] args) {
     Kangaroo kg = new Kangaroo("Mr.Chahca", 27);

     kg.display("Pakistan");
     kg.display("Hungary");
 }   
}

