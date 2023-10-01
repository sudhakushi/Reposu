package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskList;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class TasksModule extends BaseClass {
	@Test
	public void testcreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		FileLib f=new FileLib();
		String TaskName = f.getExcelData("CreateTask", 1, 1);
		Reporter.log("Create Task",true);
		EnterTimeTrackPage e= new EnterTimeTrackPage(driver);
		e.setTasksTab();
		TaskList t=new TaskList(driver);
		t.getAddNewBtn().click();
		t.getNewTaskopt().click();
		t.getSSelectCustDropD().click();
		t.getCNAXIS_001xSt().click();
		t.getSelectProjectDD().click();
		t.getPNHDFCBanktxt().click();
		t.getEnterTaskNametxt().click();
		Thread.sleep(2000);
	}
}