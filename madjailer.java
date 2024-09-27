public class madjailer {

    int cells = 100;
    char[] cellsopen = new char[cells];

    public void initCode() {
        for (int i = 0; i < cells; i++) {
            cellsopen[i] = 'l'; // This initializes the code and creates the first "time" the guard walks through (everything is set to locked)
        }
    }

    public void aisleWalk() {
        // Initializes the jailer walks down the aisle
        for (int walk = 1; walk <= cells; walk++) { //For as long as walk is below 100, run the following code
            for (int i = walk - 1; i < cells; i += walk) { // Walk will increase by the value of walk, therefore if walk = 5, then it'll do 5 - 1 = 4, then it'll open every 5th cell starting from 4
                if (cellsopen[i] == 'l') {
                    cellsopen[i] = 'u'; // If locked, then unlock
                } else {
                    cellsopen[i] = 'l'; // If unlocked, then lock
                }
            }
            System.out.println("After round " + walk + ": " + new String(cellsopen));
        }
    }

    public void cellOpened() {
        System.out.println("Cells unlocked");
        for (int i = 0; i < cells; i++) {
            if (cellsopen[i] == 'u') {
                System.out.print((i + 1) + " ");

            }

        }
        System.out.println(" ");
        System.out.println("There is a pattern, the pattern is it goes up 2 each time, first starting with 3.");
        System.out.println("For example, 1 + 3 = 4 + 5 = 9 + 7 = 16 + 9, so on and so forth.");
        System.out.println("As you can probably guess, every sum is the unlocked cell number.");
    }

    public static void main(String[] args) {
        madjailer jailer = new madjailer();
        jailer.initCode();
        jailer.aisleWalk();
        jailer.cellOpened();
    }
} // sources used: https://codegym.cc/groups/posts/increment-and-decrement-unary-operators-in-java
// https://www.digitalocean.com/community/tutorials/addition-assignment-operator-in-java
// https://thirdspacelearning.com/gcse-maths/algebra/nth-term/
// https://www.geeksforgeeks.org/find-nth-term-series-136101521/
