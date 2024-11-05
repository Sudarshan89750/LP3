

import java.util.Arrays;

class Item {
	int weight ;
	int profit ;
	public Item(int weight, int profit) {
	
		this.weight = weight;
		this.profit = profit;
	}
	
}
class FractionalKS{
	public double GetMax(Item [] items,int capacity ) {
		
		Arrays.sort(items,(a,b)->Double.compare((double)b.profit/b.weight, (double)a.profit/a.weight));
		double totalProfit=0;
		for(Item item:items) {
			if(item.weight<=capacity) {
				totalProfit+=item.profit;
				capacity-=item.weight;
				
			}
			else {
				totalProfit+=item.profit*((double)capacity/item.weight);
				break;
				
			}
		}
		return totalProfit;
		
		
		
		

		
	}
}


public class DAA3 {
	
	public static void main(String[] args) {
	Item [] items= {
			new Item(10, 60),
            new Item(20, 100),
            new Item(30, 120)
	};
	FractionalKS obj =new FractionalKS();
	
	int capacity =50;
	double result=obj.GetMax(items, capacity);
	 System.out.println("Maximum value in Knapsack = " + result);
		
		
	}
}
