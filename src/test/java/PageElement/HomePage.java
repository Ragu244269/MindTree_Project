/**
 * 
 */
package PageElement;

/**
 * @author admin
 *
 */
public class HomePage {

	public static String applicationType = "//input[@id='application_type_single']/parent::label";
	public static String noOfDept = "//select[@title='Number of dependants']";
	public static String borrowTypeHme = "//input[@id='borrow_type_home']/parent::label";
	public static String income = "(//div[@class='borrow__question']/following::input[@type='text'])[1]";
	public static String otherIncome = "(//div[@class='borrow__question']/following::input[@type='text'])[2]";
	public static String expenses = "//input[@id='expenses']";
	public static String homeloans = "//input[@id='homeloans']";

	public static String otherloans = "//input[@id='otherloans']";
	public static String OtherCommitmentsTooltip = "(//div[@class='borrow__question']/following::input)[10]";
	public static String credit = "//input[@id='credit']";
	
	public static String btnBorrowCalculater = "//button[@id='btnBorrowCalculater']";
	
	public static String borrowResultTextAmount = "//span[@id='borrowResultTextAmount']";
	public static String startOver = "//button[@class='start-over']";
	public static String btnBorrowerrorTest ="//span[@class='borrow__error__text']";
}
