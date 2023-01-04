
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st ;
        int N = Integer.parseInt(br.readLine());
        long []num= new long[N];
        //이 문제 같은 경우에는 변수가 가지는 값이 int 범위를 초과하기 때문에 long을 써주었다.
        st= new StringTokenizer(br.readLine());
        for(int i = 0 ; i<N;i++){
            num[i]=Long.parseLong(st.nextToken());
            //문자열을 long 형태로 변환시키는 것이다.

        }
        long [] sum = new long[N];
        for (int i = 1; i < N; i++) {
            sum[i] += sum[i - 1] + num[i];
        }
        // 1 2 3 4
        //1*2 + 1*3 + 1*4 = 1(2+3+4)
        //2*3 + 2*4 = 2(3+4)
        //3*4 = 3(4)
        //다음과 같은 순서쌍의 성질을 이용해서 순서쌍 곱의 합을 구하였다.
        long answer =0;
        for (int i = 0; i < N - 1; i++) {
            answer += (sum[N - 1] - sum[i]) * num[i];
        }



        bw.write(String.valueOf(answer));
        bw.close();
    }
}

