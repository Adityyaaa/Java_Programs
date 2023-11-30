import java.util.*;

public class Java_ArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numLines = in.nextInt();
        List<List<Integer>> lines = new ArrayList<List<Integer>>();

        for (int i = 0; i < numLines; i++) {
            List<Integer> line = new ArrayList<Integer>();
            int numIntegers = in.nextInt();
            if (numIntegers == 0)
                lines.add(null);
            else {
                for (int j = 0; j < numIntegers; j++) {
                    line.add(in.nextInt());

                }
                lines.add(line);

            }

        }

        int numQueries = in.nextInt();

        for (int i = 0; i < numQueries; i++) {
            int x = in.nextInt() - 1;
            int y = in.nextInt() - 1;
            try {
                System.out.println(lines.get(x).get(y));

            } catch (Exception e) {
                System.out.println("ERROR!");

            }

        }
        in.close();

    }
}
