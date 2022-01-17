// 'IterWord' class

public class IterWord {
    String [] str ; int counter;
    public IterWord (String str) {
        if (str == null) {
            throw new IllegalArgumentException("Invalid");
        }

        this.str  = str.split(" ");
        counter = 0;
    }

    public boolean hasNext() {
        return counter < str.length;
    }

    public void restart() {
        counter = 0;
    }

    public void printNext() {
        if (hasNext()) {
            System.out.println(str[counter]);
            counter++;
        }
    }
}

// 'IterWordMain' class
import stringutils.IterWord;

public class MainIterWord {
    public static void main(String[] args) {
        IterWord iw = new IterWord("Hi! My Name is Anees Umer");
        iw.printNext();
        iw.printNext();
        iw.printNext();
        
        iw.restart();

        while (iw.hasNext()) {
            iw.printNext();
        }
    }
}

