class profLoss{
    public static void main (String[] args){
       float cp = 129;
       float sp = 191;
       float profit = sp - cp;
       float profitPer = (profit/cp)*100;
       System.out.println("The Cost Price is INR "+ cp +" and Selling Price is INR "+ sp
                          +"\nThe Profit is INR "+ profit +" and the Profit Percentage is "+profitPer+"%");
    }
}
