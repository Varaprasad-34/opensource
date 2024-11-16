import java.util.*;

class codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        StringBuilder result = new StringBuilder();

        while (t--> 0) {
            sc.nextLine();
            String dna = sc.nextLine();
            StringBuilder c = new StringBuilder(dna.length());

            for (int j = 0; j < dna.length(); j++) {
                char c = dna.charAt(j);
                switch (c) {
                    case 'A':
                        c.append('T');
                        break;
                    case 'T':
                        c.append('A');
                        break;
                    case 'C':
                        c.append('G');
                        break;
                    case 'G':
                        c.append('C');
                        break;
                }
            }

            result.append(c.toString()).append("\n");
        }

        System.out.print(result);
        sc.close();
    }
}
