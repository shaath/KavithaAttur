package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import methods.OrgMaster;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlOps {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		OrgMaster om=new OrgMaster();
		String xlpath="F:\\Kavitha UK Recordings\\Workspace\\SeleniumProject\\src\\testdata\\TestData.xlsx";
		String xlout="F:\\Kavitha UK Recordings\\Workspace\\SeleniumProject\\src\\results\\EmpRes.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("EmpReg");
//		XSSFRow r=ws.getRow(3);
//		XSSFCell c=r.getCell(1);
		
		
//		System.out.println(c.getStringCellValue());
		
		int RCnt=ws.getLastRowNum();
		System.out.println(RCnt);
		
		om.Org_Launch("http://orangehrm.qedgetech.com");
		om.Org_Login("Admin", "Admin");
		
		for (int i = 1; i <= RCnt; i++) 
		{
			XSSFRow r=ws.getRow(i);
			
			r.getLastCellNum();
			
			
			XSSFCell c=r.getCell(0);
			XSSFCell c1=r.getCell(1);
			XSSFCell c2=r.getCell(2);
			
			XSSFCell c3=r.createCell(3);
			
			String f=c.getStringCellValue();
			String l=c1.getStringCellValue();
			String Eid=c2.getStringCellValue();
			
			System.out.println(f+"---"+l+"---"+Eid);
			
			String res=om.Org_Empreg(f, l, Eid);
			
			c3.setCellValue(res);
			
		}
		om.Org_Logout();
		om.Org_Close();
		
		FileOutputStream fo=new FileOutputStream(xlout);
		
		wb.write(fo);
		wb.close();
		
	}

}
