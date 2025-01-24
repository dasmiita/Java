class Hello
{
    public static void main (String args[])
    {
        int num1= 3;
        num1++;
         System.out.println(num1);
        int result =  num1 +=2;
        /*
        int num2 = 4;
        int result = num1 - num2;*/
         
        System.out.println(result);
        //increment decrement differ when values are being fetched 
        int dig=45;
        int post = dig++;
        int pre = ++dig;
        System.out.println(dig);
        
        System.out.println(post);
        System.out.println(pre);
        //consider the ++ = =1 whenevr u write code 

        
    }
}