class ProfitAndLoss{

	public static void main(String args[]){
		
		int costPrice = 129;
		int sellingPrice = 191;
		float profit = sellingPrice - costPrice;
		
		System.out.println("The Cost Price is " + costPrice + " and Selling Price is " + sellingPrice);
		System.out.println("The Profit is " + profit + " and the Profit Percentage is " + (profit / costPrice) * 100);
	}
}
