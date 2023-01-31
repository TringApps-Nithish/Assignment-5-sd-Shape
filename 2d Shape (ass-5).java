import java.util.*;

class twod {
    public static void main(String args[]) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);
        System.out.printf("\n ----- Two Dimension Point Using Cloning ----- \n\n");
        System.out.printf(" Enter 1st Coordinates : \n");
        System.out.printf("\n Enter X - Coordinate : ");
        int x = sc.nextInt();
        System.out.printf(" Enter Y - Coordinate : ");
        int y = sc.nextInt();
        putpoint obj = new putpoint(x, y);
        putpoint obj1 = (putpoint) obj.clone();
        System.out.printf("\n Members of Cloned Object ->  ");
        obj1.display();
        System.out.printf("\n Enter 2nd Coordinates : \n");
        System.out.printf("\n Enter X - Coordinate : ");
        int x1 = sc.nextInt();
        System.out.printf(" Enter Y - Coordinate : ");
        int y1 = sc.nextInt();
        putpoint obj2 = new putpoint(x1, y1);
        System.out.printf("\n Members of Object - 2 -> ");
        obj2.display();
        boolean ans = obj1.equals(x1, y1);
        if (ans)
            System.out.printf("\nBoth 2d Points are Same ");
        else
            System.out.printf("\nBoth 2d Points are Not Same ");
    }
}

class putpoint implements Cloneable {
    int x1, y1;

    putpoint(int x, int y) {
        x1 = x;
        y1 = y;
    }

    public Object clone() throws CloneNotSupportedException

    {
        System.out.printf("Object has been Cloned Successfully ....\n");
        return super.clone();
    }

    boolean equals(int x, int y) {
        boolean result = ((x1 == x) && (y1 == y)) ? true : false;
        return result;
    }

    void display() {
        System.out.println("  x = " + x1 + "\tY = " + y1);
    }

}
