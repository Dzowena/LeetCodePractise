package easy.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Path_Crossing {
    public static void main(String[] args) {
        System.out.println(isPathCrossing("NESWW"));
    }
    public static boolean isPathCrossing(String path) {
        int x = 0, y = 0;
        Set<String> points = new HashSet<>();
        points.add(0 + " " + 0);
        for(int i = 0; i < path.length(); i++){
            if(path.charAt(i) == 'N')
                y++;
            else if(path.charAt(i) == 'S')
                y--;
            else if(path.charAt(i) == 'W')
                x--;
            else if(path.charAt(i) == 'E')
                x++;
            if(points.contains(x + " " + y))
                return true;
            points.add(x + " " + y);
        }
        return false;
    }
}
