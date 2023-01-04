
    public static void main(String ar[])throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int [] x = new int[n];
        int [] sum = new int[n];
        //배열 x에 x의 원소들을 입력받았다.
        //sum에 배열 x의 합을 한 값을 대입하였다.
        st= new StringTokenizer(br.readLine());

        for(int i = 0;i<n;i++){
            x[i]=Integer.parseInt(st.nextToken());

        }
        sum[0]=x[0];
        for(int i=0;i<n-1;i++){
            sum[i+1]= sum[i]+x[i+1];
        }
        long value =0;
        for(int i=0;i<n-1;i++){
                value=value+x[i]*(sum[n-1]-sum[i]);

        }
        //3
        //1 2 3
        //1*(2+3)+2*3
        //위 성질을 이용하여 곱의 합들을 나타내었다.
        bw.write(String.valueOf(value));
        bw.close();
    }


