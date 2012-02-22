/**
 * 
 */
package ims.Controller;

import ims.Model.*;

/**
 * @author Minh, Kumar, Jean
 *
 */
public class  EventHandler {
	
	private static final String UIInformation = null;
	public  EntityBase Result;
	private Event UIEvent;
	
	public EventHandler(Event uiEvent){
		this.UIEvent = uiEvent;
	}
	
	public boolean  HandleEvent(EntityBase data){
		//Handle Events here
		boolean isSuccess = false;
		
		if(UIEvent.equals(Event.EVALUATE_INVENTORY)){
			
			Information information = new Information();
			UIInformation result = (UIInformation) data;
			isSuccess = information.ProcessInformation(result);
			result.IngredientList = information.InformationReport;
			Result = result;			
		} 		
		else if (UIEvent.equals(Event.ESTIMATE_QUANTITY)) {
			Estimation estimation = new Estimation();
			isSuccess = true;
			System.out.println("Reaching the handle Event method");
		} 
		
		return isSuccess;
	}
	
	public void DisplayResult(){
		
		if(UIEvent.equals(Event.EVALUATE_INVENTORY)){
			DisplayInformationResult();
		}
		else if (UIEvent.equals(Event.ESTIMATE_QUANTITY)) {
			DisplayEstimationResult();
		}		
	}

	private void DisplayInformationResult() {
		
		UIInformation result = (UIInformation)Result;
		
		System.out.println("====================Information Report===================");
		System.out.print("Report :" + result.Locality.toString());
		System.out.println("		Month :" + result.Month + "   Year :" + result.Year);
		System.out.println("==========================================================");
		System.out.println("Ingredient Name    Quantity    Unit    TotalCost");
		System.out.println("==========================================================");
		
		for (Ingredient ingredient : result.IngredientList) {
			
			System.out.println(ingredient.getName() + "    "+ ingredient.getQuantity() + "    " + ingredient.getUnitType() + "    "+ ingredient.getCost()); 
			
		}		
	}

	private void DisplayEstimationResult() {
		// TODO Auto-generated method stub
		
	}
	

}
