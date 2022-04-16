import java.io.*;


public class bufferedreadertemplate {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int num = Integer.parseInt(br.readLine());
            int[] arr= new int[num];
            String s= br.readLine();
            String[] s1 = s.split(" ");
            for(int i=0;i<num;i++)
            {
                    arr[i]=Integer.parseInt(s1[i]);
            }

        }
    }

    }

