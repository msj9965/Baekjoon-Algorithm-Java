import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class First {
    public static void main (String [] ar) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        ArrayList <Integer>result= new ArrayList<Integer>();
        int num1;
        int num2;
        String s;
        while(((s=br.readLine())!=null)&&!s.isEmpty()){

            st= new StringTokenizer(s);

                num1 = Integer.parseInt(st.nextToken());
                num2 = Integer.parseInt(st.nextToken());


                result.add(num1 + num2);



        }

        for(int i=0;i<result.size();i++){
            bw.write(result.get(i)+"\n");
        }
        bw.flush();


        bw.close();
    }
}