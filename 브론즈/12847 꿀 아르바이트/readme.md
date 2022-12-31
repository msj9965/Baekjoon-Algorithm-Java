
    public static void main(String ar[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n,m;
        st = new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        long []T = new long[n];
        st= new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            T[i]=Integer.parseInt(st.nextToken());
        }
        //먼저 각 날별 일급에 대한 정보를 입력받았다.
        long max = Integer.MIN_VALUE;
        long value=0;
        for(int i=0; i+m-1<n;i++){
            for(int j=0;j<m;j++){
                value=value+T[i+j];
            }
            //value 값을 통해 부분배열의 합을 나타내었다.
            max=Math.max(max,value);
            value =0;
            //m값에 따라 나뉘어진 부분배열의 합들 중 최대값을 구하기 위해서 max 메소드를 활용하였다.
            
        }



        bw.write(String.valueOf(max));
        bw.close();


    }
}

