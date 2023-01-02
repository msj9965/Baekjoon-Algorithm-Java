
    public static void main (String ar [])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int tc = Integer.parseInt(br.readLine());
        for(int i=0;i<tc;i++){
            int n,m;
            st = new StringTokenizer(br.readLine());
            n =Integer.parseInt(st.nextToken());
            m= Integer.parseInt(st.nextToken());
            boolean [][] list = new boolean[n+1][n+1];
            for(int j=0;j<m;j++){
               st = new StringTokenizer(br.readLine());
               int a= Integer.parseInt(st.nextToken());
               int b= Integer.parseInt(st.nextToken());
               list[a][b] = true;
               list[b][a] = true;
               //만약 입력받은 비행기 스케줄이 국가 전부를 갔다오지 않으면 어짜피 모순이고 
               //이러한 간선을 이용한 최소 간선 갯수를 구하는 것은 항상 최소 간선의 값이 정점-1이 된다.
               //따라서 이 문제에서도 항상 출력되는 값은 n-1이 된다.
               //나는 이중배열을 선언하여 왕복하는 비행기가 있다는 의미로 boolean형 자료형을 통해 나타내었다.
            }
            bw.write(n-1+"\n");

        }
        bw.close();

    }
}

