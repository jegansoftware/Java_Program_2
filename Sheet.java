package PrOgrAM;

public class Sheet {

	
	public void sheet_print()
	{
		int cash=3500;						int account_payable=3000;
		int account_receivable=500;			int capital_stock=18100;
		
		int supplies=100;
		int land=2000;
		
		int buildings=10000;
		
		int machenes_and_equip=3000;
		int patents=2000;
		int total=cash+account_receivable+supplies+buildings+land+machenes_and_equip+patents;
		int total1=account_payable+capital_stock;
		
		System.out.printf("\nAssets   		  Amount  		Liablities  		Amount ");
		System.out.printf("\n------   		  -------		----------		------ ");

		
		System.out.printf("\nCASH %26d 		Account Payable %14d",cash,account_payable);
		System.out.printf("\nAccount Receivable %12d 	",account_receivable);
		System.out.printf("\nSupplies %22d  		Capital Stock %16d",supplies,capital_stock);
		System.out.printf("\nLand %26d", land);
		System.out.printf("\nBuildings %21d",buildings);
		System.out.printf("\nMachines And Equipment %8d",machenes_and_equip);
		System.out.printf("\nPatents %23d",patents);
		System.out.printf("\n");
		System.out.printf("\n");
		System.out.printf("\nTotal Assets %18d    		Total Liablities  %12d",total,total1);
		
		
		
		
		
		
	}
}
