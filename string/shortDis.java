package string;
import java.util.Scanner;

// direction for= sqrt of x2+y2

public class shortDis {
    public static float getShortestPath(String path) {
        int x = 0, y =0;
        for (int i = 0; i < path.length(); i++){
            char dir = path.charAt(i);

            // East
            if(dir == 'E'){
                x++;
            }else if(dir == 'W'){
                x--;
            }else if(dir == 'N'){
                y++;
            }else{
                y--;
            }
        }

        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s);
        // getShortestPath(s);
        System.out.println(getShortestPath(s));

    }
}
