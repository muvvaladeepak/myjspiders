class sq{
    public static void main(String[]args) {
        int n=127;
        int a;
        int z;
        if(n%4==0){
            int b=n/4;
            for(int i=0;i<4;i++){
            System.out.println(b);}
        }else{
            for(int j=0;j<4;j++){
            a=n+1;
            if(a%4==0){
                int c=a/4;
                System.out.println(c);
            }
        }
    }
    }
}