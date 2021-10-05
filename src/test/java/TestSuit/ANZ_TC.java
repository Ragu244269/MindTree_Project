/**
 * 
 */
package TestSuit;

import java.util.Map;

import org.testng.Assert;

import Library.library;
import PageElement.HomePage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

/**
 * @author admin
 *
 */
public class ANZ_TC extends BaseTest {

	/*@Test
	public void testGroup() {
		try {
			HomePage.details(driver);
			HomePage.startOver(driver);
		} catch (Exception e) {

		}

	}*/
	@Given("^Living Expenses with details$")
	public static void details(DataTable detailsForLE){
		for(Map<String,String> details :  detailsForLE.asMaps(String.class,String.class)){
			//Application type
			if(details.get("AT").equalsIgnoreCase("Single"))
			library.clickable(driver, HomePage.applicationType,"Application Type selected successfully","Unable to select application type");
			//Number of dependants
			library.dropdown(driver, HomePage.noOfDept,details.get("ND"),"No of Depdentent is selected successfully","Unable to select No.of.depdentent");
			//Property you would like to buy
			if(details.get("AProperty").equalsIgnoreCase("Home to live in"))
			library.clickable(driver, HomePage.borrowTypeHme,"Home to live in is selected sussfully","Unable to select dropdown valuse as Home to live in");
			//Your income (before tax)
			library.sendKeys(driver, HomePage.income, details.get("YI"),"Enter a Your income field successfully","Unable to entered a your income");
			//Your other income Tooltip
			library.sendKeys(driver, HomePage.otherIncome, details.get("YOI"),"Enter a Your Other income field successfully","Unable to entered a your Other income");
			//Living expenses Tooltip
			library.sendKeys(driver, HomePage.expenses, details.get("LE"),"Enter a Living expenses successfully","Unable to entered a Living expenses");
			//Current home loan repayments
			library.sendKeys(driver, HomePage.homeloans, details.get("CHLR"),"Enter a Current home loan repayments successfully","Unable to entered a Current home loan repayments");
			//Other loan repayments Tooltip
			library.sendKeys(driver, HomePage.otherloans, details.get("OLR"),"Enter a Living expenses successfully","Unable to entered a Living expenses");
			//Other commitments Tooltip
			library.sendKeys(driver, HomePage.OtherCommitmentsTooltip, details.get("OC"),"Enter a Other commitments  successfully","Unable to entered a Other commitments");
			//Total credit card limits
			library.sendKeys(driver, HomePage.credit, details.get("TCCL"),"Enter a Total credit card limits successfully","Unable to entered a Total credit card limits");
			
			
			library.clickable(driver, HomePage.btnBorrowCalculater,"click a Borrow Calculaters successfully","Unable to click a Borrow Calculater");
			
			}
		
	}
	@And("^Borrowing estimate as \"(.*)\"$")
	public static void estimate(String value){
		try{
			System.out.println("Value  :"+value);
			if(value.equalsIgnoreCase("Y")){
			String estimation=library.getText(driver, HomePage.borrowResultTextAmount);
			System.out.println("estimation :"+estimation);
			}else if(value.equalsIgnoreCase("N")){
				String estimation=library.getText(driver, HomePage.btnBorrowerrorTest);
				System.out.println("estimation :"+estimation);
				Assert.assertEquals(estimation, "Based on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 035 500.");
			}
					
		}
		catch(Exception e){
			
		}		
	}
	@And("^Start Over$")
	public static void startOver(){
		try{
			library.clickable(driver, HomePage.startOver,"Clicked on Start over button Successfully","Unable to clicked on Start over button");			
		}
		catch(Exception e){
			
		}		
	}


}
