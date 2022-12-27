import java.io.*;\
\
public class First {\
    public static void main (String ar[]) throws IOException {\
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));\
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));\
        int m[]= new int[10];\
        //버섯 10개를 저장하는 배열 m[]을 선언하였다.\
\
        for(int i=0;i<10;i++){\
            do{m[i]= Integer.parseInt(br.readLine());}\
            while(!(m[i]>0&&m[i]<=100));\
        //m[]에 값을 입력받도록 하였고 do while을 통해서 m[]값이 해당하는 범위를 벗어나면 다시 입력되도록 하였다.\
        }\
        int score1=0;\
        가장 최근에 계산한 것을 저장할 변수이다.\
        int score2=0;\
        가장 최근 계산한 것 바로 직전 계산 결과를 저장할 변수이다.\
        int result=0;\
        최종 값을 저장할 변수이다.\
        \
        for(int i=0;i<10;i++){\
            score2=score1;\
            //이전 값의 score1을 저장하였다.\
            score1=score1+m[i];\
            //score1값을 갱신하였다.\
            if(score1>=100){\
            //score1값이 100을 초과할 때의 경우의 수이다.\
                if(score1-100>100-score2){\
                //score1와 100 차이와 score2와 100차이를 비교하였다.\
                    result=score2;\
                }\
                else if(score1-100<100-score2){\
                //score1와 100 차이와 score2와 100차이를 비교하였다.\
\
                    result=score1;\
                }\
                else if(score1-100==100-score2){\
                //score1와 100 차이와 score2와 100차이를 비교하였다.\
\
                result=score1;\
                }\
                break;\
            }\
            if((i==9)&&(score1<100)){\
                result=score1;\
                break;\
                //버섯을 다 더해도 100이 안될때는 score1이 result값이 되도록 하였다.\
            }\
        }\
        bw.write(result+"");\
        bw.close();\
\
    }\
}\
