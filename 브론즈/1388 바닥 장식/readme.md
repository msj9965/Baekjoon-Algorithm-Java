
    public static void main (String ar [] ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n,m;
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        char[][]X =new char[n+1][m+1];
        int count =0;
        for(int i=0;i<n;i++){
            String s = br.readLine();
            for(int j=0 ; j<m;j++){
                X[i][j]= s.charAt(j);

            }
        }
        //2차원 배열을 선언하였다. 이 배열은 n+1개의 행과 m+1개의 열을 가지고 있다.
        //이 배열 안에 n개의 행과 m개의 열을 가지는 바닥 장식에 관한 정보를 대입하였다.
        for(int i=0;i<n;i++){
            for(int j=0 ; j<m;j++){
                if(X[i][j]=='-'){
                    if(X[i][j+1]!=X[i][j]){
                        count++;
                    }

                }
            }
        }
        //먼저 '-'의 개수를 셋다. 
        //열에 관한 인덱스 값을 하나씩 증가시키면서 다음에 올 값과 비교해서 다르면 count값이 하나 늘어나도록 하였다.
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(X[j][i]=='|'){
                    if(X[j+1][i]!=X[j][i]){
                        count++;
                    }

                }
            }
        }
        //행과 마찬가지로 행값을 하나씩 증가시키면서 다음에 올 값과 비교하였다.
        bw.write(String.valueOf(count));
        bw.close();
    }
}

