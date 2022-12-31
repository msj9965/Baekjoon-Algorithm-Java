    public static void main(String []ar) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb =new StringBuilder();
        StringTokenizer st;
        st= new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int Q=Integer.parseInt(st.nextToken());
        int []a= new int[N];
        st= new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            a[i]= Integer.parseInt(st.nextToken());
        }
        int i =0;
        int r=0;
        int value=0;
        int num=0;
        for(int j=0; j<Q;j++) {
        //변화량을 알아보고 싶은 구간을 나타내주는 i와 r을 입력받았다.
            st = new StringTokenizer(br.readLine());
            i = Integer.parseInt(st.nextToken());
            r = Integer.parseInt(st.nextToken());
           if(r-1<i) {
               sb.append(0).append("\n");
               //조건에 따라 i가 r-1보다 큰 경우에는 0이 값으로 입력되게 하였다.
           }else {

               for (int k = i-1; k < r-1; k++) {
                  num=a[k+1]-a[k];
                  value = value + change(num);
                  //절대값으로 만들어주는 함수 change를 만들어서 change로 변화량 값을 반환하여 value에 누적합 하였다. 
                  //value에는 구간 안에 있는 간격 하나당 변화량이 누적되어 합해진다.
                


               }
               sb.append(value).append("\n");
               value =0;
           }
           }
        bw.write(String.valueOf(sb));
        bw.close();

        }
        public static int change(int num){


        if(num<0){
            num=num*(-1);
            return num;

        }
        else {
            return num;
        }

    }
}


