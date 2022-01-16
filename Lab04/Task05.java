// Create 'stringutils' package and place this class inside it
// IterLetter class

package stringutils;

public class IterLetter {

    String str ; int counter;
    public IterLetter (String str) {
        if (str == null) {
            throw new IllegalArgumentException("Invalid");
        }

        this.str = str;
        counter = 0;
    }

    public boolean hasNext() {
        return counter < str.length();
    }

    public void restart() {
        counter = 0;
    }

    public void printNext() {
        if (hasNext()) {
            System.out.println(str.charAt(counter++));
        }
    }
}

// IterLetterMain Class

import stringutils.IterLetter;
public class MainIter {
    public static void main(String [] args) {
        IterLetter it = new IterLetter("Hello Hy");

        it.printNext();
        it.printNext();
        it.printNext();

        it.restart();

        while (it.hasNext()) {
            it.printNext();
        }
    }
}
