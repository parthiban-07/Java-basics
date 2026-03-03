class c12{
    public static void main(String args []){
        int count=0;
        for(int i=1;i<=100;i=i+1)
        {
            if(i%3==0 && i%5==0)
            {
                 count = count+1;
                System.out.println(i);
            }
        }
         System.out.print("total numbers divided by both 3 and 5 is :   "+count);
    }
}