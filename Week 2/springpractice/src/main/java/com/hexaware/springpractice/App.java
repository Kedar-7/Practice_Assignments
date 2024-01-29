package com.hexaware.springpractice;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.springpractice.config.AppConfig;
import com.hexaware.springpractice.entity.Assets;
import com.hexaware.springpractice.service.AssetsServiceImp;
import com.hexaware.springpractice.service.IAssetsService;

/**
 * Hello world!
 *
 */
public class App 
{
	static Scanner sc = new Scanner(System.in);
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
       
       IAssetsService service = context.getBean(AssetsServiceImp.class);
   		boolean flag = true;
   		while(flag) {
    		System.out.println("****WELCOME to AssetManagement ***");
    		System.out.println("1. INSERT");
    		System.out.println("2. SELECT BY Name");
    		System.out.println("3. SELECT ALL");
    		System.out.println("4. EXIT");
    		
    		int choice = sc.nextInt();
    		sc.nextLine();
    		switch (choice) {
			case 1:
				Assets asset1 = readData();
				boolean isInserted = service.insertAssets(asset1);
				if(isInserted) {
					System.out.println("Record inserted succefully");
				} else {
					System.err.println("Insert fail");
				}
				
				break;
				
			case 2:
				System.out.println("Enter Asset Name: ");
				String asset = sc.nextLine();
				Assets assetFound = service.selectAssetsByName(asset);
				if(assetFound != null) {
					System.out.println(assetFound);
				}else {
					// throw new ProductNotFoundExp();
					System.err.println("Asset Not Found");
				}
				break;
				
			case 3:
				List<Assets> list = service.selectAllAssets();
				for(Assets a: list) {
					System.out.println(a);
				}
			break;
				
			case 4:
					flag = false;
				break;

			default:
				break;
			}
    		
   		}

    }
    public static Assets readData() {
    	Assets asset = new Assets();
    	System.out.println("Enter Asset id: ");
    	asset.setAssetId(sc.nextInt());
    	sc.nextLine();
    	
    	System.out.println("Enter AssentNo: ");
    	asset.setAssetNo(sc.nextLine());
    	
    	System.out.println("Enter AssetName: ");
    	asset.setAssetName(sc.nextLine());
    	
    	System.out.println("Enter Asset Category: ");
    	asset.setAssetCategory(sc.nextLine());
    	
    	System.out.println("Enter Asset Model: ");
    	asset.setAssetModel(sc.nextLine());
    	
    	System.out.println("Enter manufacturing date (yyyy-MM-dd): ");
        String manufacturingDateString = sc.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date manufacturingDate = (Date) dateFormat.parse(manufacturingDateString);
            asset.setManufacturingDate(manufacturingDate);
        } catch (Exception e) {
            System.err.println("Invalid date format. Please enter the date in yyyy-MM-dd format.");
        }

        System.out.println("Enter expiry date (yyyy-MM-dd): ");
        String expiryDateString = sc.nextLine();
        try {
            Date expiryDate = (Date) dateFormat.parse(expiryDateString);
            asset.setExpiryDate(expiryDate);
        } catch (Exception e) {
            System.err.println("Invalid date format. Please enter the date in yyyy-MM-dd format.");
            // You might want to handle this error more gracefully based on your application's needs
        }

        System.out.println("Enter asset value: ");
        asset.setAssetValue(new BigDecimal(sc.nextDouble()));
        
        sc.nextLine();
        System.out.println("Enter status: ");
        asset.setStatus(sc.nextLine());

        sc.close(); 

        return asset;
    	
    }
}
