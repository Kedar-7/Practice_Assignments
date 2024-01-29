package com.hexaware.hiibernate;

import java.util.List;
import java.util.Scanner;

import com.hexaware.hiibernate.entity.Assets;
import com.hexaware.hiibernate.service.AssetsService;
import com.hexaware.hiibernate.service.IAssetsService;

/**
 * Hello world!
 *
 */
public class App 
{
	static Scanner sc = new Scanner(System.in);
    public static void main( String[] args )
    {
        IAssetsService service = new AssetsService();
        boolean flag = true;
   		while(flag) {
    		System.out.println("****WELCOME to AssetManagement ***");
    		System.out.println("1. INSERT");
    		System.out.println("2. SELECT BY Name");
    		System.out.println("3. SELECT ALL");
    		System.out.println("4. DELETE BY ID");
    		System.out.println("5. EXIT");
    		
    		int choice = sc.nextInt();
    		sc.nextLine();
    		switch (choice) {
    		case 2:
                System.out.println("Enter Asset ID:");
                int assetId = sc.nextInt();
                sc.nextLine();
                Assets asset = service.getAssetById(assetId);
                if (asset != null) {
                    System.out.println("Asset found: " + asset);
                } else {
                    System.err.println("Asset not found");
                }
                break;
			case 3:
				System.out.println("Assets from Database:");
		        List<Assets>list = service.getAllAssets();
		        for(Assets a:list) {
		        	System.out.println(a);
		        }
				break;
			case 4:
				System.out.println("Enter Asset ID:");
		        int assetId1 = sc.nextInt();
		        sc.nextLine();
		        boolean asset1 = service.deleteAssetById(assetId1);
		        if(asset1) {
					System.out.println("Record deleted successfully...");
				}else {
					System.err.println("Delete fail");
				}
		        
				break;
			case 5:
				flag = false;
		        
				break;

			default:
				break;
			}
   		}
    }
}
