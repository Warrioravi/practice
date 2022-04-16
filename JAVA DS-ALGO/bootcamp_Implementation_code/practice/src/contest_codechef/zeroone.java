package contest_codechef;

import java.util.Scanner;

public class zeroone {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test = s.nextInt();
        for (int i = 0; i < test; i++) {
            int size = s.nextInt();
            int[] arr = new int[size];
            for (int j = 0; j < size; j++) {
                arr[i] = s.nextInt();
            }
            int steps = 0;
            for (int j = 0; j < size; j++) {
                int L_adj, R_adj;
                if (j == 0) {
                    L_adj = arr[size - 1];
                    R_adj = arr[j + 1];
                } else if (j == size - 1) {
                    R_adj = arr[0];
                    L_adj = arr[j - 1];
                } else {
                    L_adj = arr[j - 1];
                    R_adj = arr[j + 1];

                }

                if (arr[j] == 1) {
                    if (L_adj == 0 && R_adj >= 1) {
                        arr[j] = 0;
                        if (j == size - 1) {
                            arr[0] += 1;
                        } else {
                            arr[j + 1] += 1;
                        }

                        steps++;
                        j = 0;
                    } else if (R_adj == 0 && L_adj >= 1) {
                        arr[j] = 0;
                        if (j == 0) {
                            arr[size - 1] += 1;
                        } else {
                            arr[j + 1] += 1;
                        }

                        steps++;
                        j = 0;

                    }


                }
            }
            System.out.println(steps);
        }
    }


}