 public static int m,n,k;
    public static int[][]arr;
    public static boolean [][]value;
    public static class location{
        public int x, y;
        public location(){

        }
        public location(int x, int y){
            this.x =x;
            this.y =y;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int t= Integer.parseInt(br.readLine());
        for(int i =0;i<t;i++){
            st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            arr = new int[m][n];
            value = new boolean[m][n];
            ArrayList<location> where = new ArrayList<>();
            for(int j=0;j<k;j++){
                st = new StringTokenizer(br.readLine());
                int num1 =Integer.parseInt(st.nextToken());
                int num2 =Integer.parseInt(st.nextToken());
                arr[num1][num2]=1;
                where.add(new location(num1,num2));

            }
            int count =0;
            for(int j=0;j<where.size();j++){
               if(value[where.get(j).x][where.get(j).y]==false) {
                   bfs(where.get(j));
               count++;
               }
            }
            sb.append(count).append("\n");
        }
        bw.write(String.valueOf(sb));
        bw.close();
    }
    //배추의 있는 곳을 x,y좌표로 표현하여 나타내었다.
    //x,y 좌표 표현은 location이라는 class를  만들어서 하였다.
    //bfs를 통해 각 정점이 이웃하는지 파악하고 이웃하는 것끼리 묶은 후 묶은 것의 갯수를 확인하였다.
    public static void bfs(location start){
        Queue<location> q = new LinkedList<>();
        q.offer(start);
        value[start.x][start.y]= true;
        while (!q.isEmpty()){
        location ex =q.poll();
        if(ex.x+1<m){
            if(arr[ex.x+1][ex.y]==1&&value[ex.x+1][ex.y]==false){
                q.offer(new location(ex.x+1,ex.y));
                value[ex.x+1][ex.y]=true;

            }
        }
            if(ex.x-1>=0){
                if(arr[ex.x-1][ex.y]==1&&value[ex.x-1][ex.y]==false){
                    q.offer(new location(ex.x-1,ex.y));
                    value[ex.x-1][ex.y]=true;


                }
            }
            if(ex.y+1<n){
                if(arr[ex.x][ex.y+1]==1&&value[ex.x][ex.y+1]==false){
                    q.offer(new location(ex.x,ex.y+1));
                    value[ex.x][ex.y+1]=true;


                }
            }
            if(ex.y-1>=0){
                if(arr[ex.x][ex.y-1]==1&&value[ex.x][ex.y-1]==false){
                    q.offer(new location(ex.x,ex.y-1));
                    value[ex.x][ex.y-1]=true;


                }
            }


        }
    }
