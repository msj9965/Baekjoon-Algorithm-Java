    public static boolean []value;
    public static int n,m;
    public static int [][]reach;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st= new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        reach = new int[n+1][n+1];
        for(int i =0 ; i<m;i++){
            st= new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            reach[num1][num2]=1;
            reach[num2][num1]=1;
        }
        value = new boolean[n+1];
        int cnt=0;
        for(int i=1;i<=n;i++){
            if(value[i]==false){
                dfs(i);
                cnt++;
            }
        }
        //방문하지 않은 정점이 남아있어서 dfs가 발생할때마다 연결 요소가 증가하도록 하였다.
        bw.write(String.valueOf(cnt));
        bw.close();
    }
    public static void dfs(int v){
        value[v]=true;
        for(int i=1; i<=n;i++){
            if(reach[v][i]==1&&value[i]==false){
                dfs(i);

            }
        }
    }
