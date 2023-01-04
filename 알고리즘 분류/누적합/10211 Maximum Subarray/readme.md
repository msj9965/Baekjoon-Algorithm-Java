import java.io.*;\
import java.util.StringTokenizer\

public class Main {\
    public static void main(String[]ar) throws IOException {\
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));\
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));\
        StringBuilder sb = new StringBuilder();\
        StringTokenizer st;\
        int T= Integer.parseInt(br.readLine());\
        for(int i=0; i<T;i++){\
            int N = Integer.parseInt(br.readLine());\
            int []X= new int[N];\
            int [][]sum = new int[N][N];\
            i~j까지의 합을 나타내는 2차원 배열 sum을 선언하였다.\         
            int max = Integer.MIN_VALUE;\
            //Integer 변수가 가질 수 있는 가장 작은 값을 넣어주었다.\
            st = new StringTokenizer(br.readLine());\

            for(int j=0;j<N;j++){\
                X[j] = Integer.parseInt(st.nextToken());\
                sum[j][j]=X[j];\
                //j~j까지의 합은 X[j]와 동일하기 때문에 그것을 표현해주었다.\
                max= Math.max(max,sum[j][j]);\
                //추후의 Max값을 비교할 때 단일값중에 제일 큰 값과 비교하기 위해 단일 값중 가장 큰 값을 구해놓았다.\
            }\
            for(int j= 0 ; j<N-1;j++){\
                for(int k=j+1; k<N;k++){\
                    sum[j][k]= sum[j][k-1]+sum[k][k];\
                    //단일 값을 제외한 2차원 배열의 부분배열의 합을 구하기 위해 j와 k를 다음과 같이 구성해서 sum의 나머지 값들을 채워넣었다.\
                    max = Math.max(max, sum[j][k]);\
                    //기존 단일 값의 최대값과 새롭게 추가된 sum값들을 비교해서 sum의 최대값을 구했다.\

                }\
            }\
            sb.append(max).append("\n");\



        }\
        bw.write(String.valueOf(sb));\
        bw.close();\



    }\


}
