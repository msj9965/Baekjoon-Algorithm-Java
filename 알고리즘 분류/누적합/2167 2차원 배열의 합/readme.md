import java.io.*;\
import java.util.StringTokenizer;\
\
public class Main {
    public static void main(String[] ar) throws IOException {\
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));\
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));\
        String size=br.readLine();\
        StringTokenizer st1=new StringTokenizer(size);/
        int N= Integer.parseInt(st1.nextToken());\
        int M= Integer.parseInt(st1.nextToken());\
        //2차원 배열의 크기를 입력받은 후 단어 단위로 구분해서 N과 M에 대입하였다.\
\
\
        int [][] value = new int[N][M];\
        //2차원 배열의 값을 계산해서 대입하기 위해 value를 선언하였다.\
        for(int i=0;i<N;i++){/
\
            st1= new StringTokenizer(br.readLine());\
            //각 행마다 입력할 대입할 값들을 입력받았다.\
            for(int j=0;j<M;j++){\
                value[i][j]=Integer.parseInt(st1.nextToken());\
                // value 값들을 대입하였다.\
            }\
        }\
        int K = Integer.parseInt(br.readLine());/
        for(int w=0;w<K;w++){/
        //i, j, x, y에 들어갈 값들을 입력받았다.\
            int i,j,x,y;\
\
            st1= new StringTokenizer(br.readLine());\
            i=Integer.parseInt(st1.nextToken());\
            j=Integer.parseInt(st1.nextToken());\
            x=Integer.parseInt(st1.nextToken());\
            y=Integer.parseInt(st1.nextToken());\
            int result=0;
            //계산한 값들을 대입할 변수를 선언하였다.\
            for(int a=i;a<=x;a++){\
                for(int b= j;b<=y;b++){\
                    result= result+value[a-1][b-1];\
                    //행과 열은 1부터 시작하지만 배열의 인덱스값은 0부터 시작하기 때문에 행과 열 값에서 1씩 감소시켰다.\

                }
            }
            bw.write(result+"\n");
        }


       bw.close();
    }

}


