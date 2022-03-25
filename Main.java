import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Main {


    public static void main(String args[]) throws IOException {

        File f = new File("t1.txt");
        File f1 = new File("2.txt");
        FileWriter writer = new FileWriter(f1);
        int[] temparr = {31, 370, 1076, 1159, 1160, 1169, 1638, 1649, 1809, 2051, 2259, 2442, 2491, 2622, 2886, 2999, 3226, 3870, 3906, 4068, 4325, 4356, 4361, 4439, 4574, 4759, 4766, 4809, 4914, 5174, 5252, 5727, 5890, 6225, 6302, 6448, 6697, 6750, 6806, 8386, 8650, 9000, 9264, 9529, 9579, 9581, 9654, 9668, 9684, 9762};
        for (int i = 0; i < 50; i++) {
            Rand.rand(f, temparr[i]);
            writer.append(String.valueOf(temparr[i])).append(",");
            Scanner sc = new Scanner(f);
            String str = sc.nextLine();
            int[] a = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
            //System.out.println(Arrays.toString(a));
            long a1 = System.nanoTime();
            writer.append(String.valueOf(Introsort.sort(a))).append(",");
            writer.append(String.valueOf(System.nanoTime() - a1)).append("\n");
            //System.out.println(Arrays.toString(a));
        }
        writer.close();
    }
}
