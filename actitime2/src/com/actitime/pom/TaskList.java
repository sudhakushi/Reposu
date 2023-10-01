package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskList {

	@FindBy(xpath="//div[@class='addNewButton']")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomerOption;
	
	@FindBy(xpath=" //input[@placeholder='Enter Customer Name' and @class]")
	private WebElement enterCustNameTbx;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterCustDescriptionTbx;
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustomerDD;
	
	@FindBy(xpath="//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
	private WebElement bigBangCompanyTx;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustomerBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualCustomer;
	
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement newProjectOpn;
	
	@FindBy(xpath="//input[@placeholder='Enter Project Name' and @class]")
	private WebElement enterProjectNameTxt;
	
	@FindBy (xpath="//div[@class='//div[@class='comboboxButton']")
	private WebElement SelectcusttoProject;
	   
	@FindBy(xpath="//div[text()='AXIS_001' and @class='itemRow cpItemRow ']")
	private WebElement Axis_001text;
	
	@FindBy (xpath="//textarea[@placeholder='Add Project Description']")
	private WebElement AddProjectDescptxt;
	
	@FindBy(xpath="//div[text()='Create Project']")
	private WebElement createProjectBtn;
	
	@FindBy(xpath="//div[text()='AXIS Bank' and @class='text']")
	private WebElement actualProject;
	
	@FindBy(xpath="//div[text()='+ New Tasks']")
	private WebElement NewTaskopt;
	
	@FindBy (xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement SSelectCustDropD;
	
	@FindBy (xpath="(//div[text()='AXIS_001' and @class='itemRow cpItemRow '])[2]")
	private WebElement CNAXIS_001xSt;
	
	@FindBy (xpath="//div[text()='- Select Project -']")
	private WebElement SelectProjectDD;
	
	@FindBy (xpath="//div[text()='HDFC Bank'and @class='itemRow cpItemRow selected']")
	private WebElement PNHDFCBanktxt;
	
	@FindBy (xpath="//input[@placeholder='Enter task name']")
	private WebElement EnterTaskNametxt;
	
	public WebElement getEnterTaskNametxt() {
		return EnterTaskNametxt;
	}
	@FindBy (xpath="//div[text()='Create Tasks']")
	private WebElement createTaskbtn;
	
	public WebElement getNewTaskopt() {
		return NewTaskopt;
	}
	
	public WebElement getSSelectCustDropD() {
		return SSelectCustDropD;
	}

	public WebElement getCNAXIS_001xSt() {
		return CNAXIS_001xSt;
	}
	public WebElement getSelectProjectopt() {
		return SelectProjectDD;
	}
	public WebElement getPNHDFCBanktxt() {
		return PNHDFCBanktxt;
	}
	public WebElement getCreateTaskbtn() {
		return createTaskbtn;
	}
	public WebElement getActualProject() {
		return actualProject;
	}
	public WebElement getNewProjectOpn() {
		return newProjectOpn;
	}
	public WebElement getEnterProjectNameTxt() {
		return enterProjectNameTxt;
	}
	public WebElement getSelectcusttoProject() {
		return SelectcusttoProject;
	}
	
	public WebElement getAxis_001text() {
		return Axis_001text;
	}

	public WebElement getSelectProjectDD() {
		return SelectProjectDD;
	}

	public WebElement getAddProjectDescptxt() {
		return AddProjectDescptxt;
	}
	public WebElement getCreateProjectBtn() {
		return createProjectBtn;
	}
	public TaskList(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getAddNewBtn() {
		return addNewBtn;
	}
	public WebElement getNewCustomerOption() {
		return newCustomerOption;
	}
	public WebElement getEnterCustNameTbx() {
		return enterCustNameTbx;
	}
	public WebElement getEnterCustDescriptionTbx() {
		return enterCustDescriptionTbx;
	}
	public WebElement getSelectCustomerDD() {
		return selectCustomerDD;
	}
	public WebElement getBigBangCompanyTx() {
		return bigBangCompanyTx;
	}
	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}
	public WebElement getActualCustomer() {
		return actualCustomer;
	}
	
	
	
}
