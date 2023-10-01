package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskList;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class ProjectModule extends BaseClass{
	@Test
	public void testcreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		FileLib f=new FileLib();
		String ProjectName = f.getExcelData("CreateProject", 1, 2);
		String ProjectDesc = f.getExcelData("CreateProject", 1, 3);
		Reporter.log("Create Project",true);
		EnterTimeTrackPage e= new EnterTimeTrackPage(driver);
		e.setTasksTab();
		TaskList t=new TaskList(driver);
		t.getAddNewBtn().click();
		t.getNewProjectOpn().click();
		t.getSelectcusttoProject().click();
		t.getEnterProjectNameTxt().sendKeys(ProjectName);
		t.getAxis_001text().click();
		t.getAddProjectDescptxt().sendKeys(ProjectDesc);
		t.getCreateProjectBtn().click();
		Thread.sleep(5000);
		String actualProjectText = t.getActualProject().getText();
		Assert.assertEquals(actualProjectText, ProjectName);
		
	}
}