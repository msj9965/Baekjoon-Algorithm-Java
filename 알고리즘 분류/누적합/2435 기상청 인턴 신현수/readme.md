

    public static void main(String ar[])throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N,K;
        st = new StringTokenizer(br.readLine());
        N= Integer.parseInt(st.nextToken());
        K= Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int [] T= new int[N];
        int [][]sum = new int[N][N];
        //입력한 배열을 저장할 배열 T와 배열에 저장된 값의 합을 저장할 2차원 배열 sum을 선언하였다.
        //sum[i][j]는 T[i]부터 T[j]까지의 합을 나타낸다.
        for(int i =0;i<N;i++){
            T[i]= Integer.parseInt(st.nextToken());
            sum[i][i] = T[i];

        }
        for(int i=0;i<N-1;i++){
            for(int j=i+1;j<N;j++) {
                sum[i][j]=sum[i][j-1]+sum[j][j];
            }
        }
        //sum의 값들을 계산하여 대입하였다.
        int max = Integer.MIN_VALUE;
        for(int i=0;i+K<=N;i++){
            max= Math.max(max,sum[i][i+K-1]);
        //자바 메소드 중 Math.max를 이용해서 최댓값을 구하였다.
        }
        bw.write(String.valueOf(max));
        bw.close();


    }
}
