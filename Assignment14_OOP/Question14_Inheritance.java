package assignments.assignment14_OOP;

import java.util.ArrayList;
import java.util.List;

public class Question14_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Item{
	//private instance variables    
	private String name;    
	private int catalogNumber;    
	private int quantity;    
	private double price;    
	
	/** public constructor with: 
	* @param name     
	* @param quantity     
	* @param catalogNumber     
	* @param price     
	*     
	* assigns to values to instance variables     */    
	public Item(String name, int quantity, int catalogNumber, double price) {
		this.name = name;
		this.catalogNumber = catalogNumber;
		this.quantity = quantity;
		this.price = price;
	}

	/** setter for name instance variable     
	* @param name     */
	public void setName(String name){
		this.name = name;
	}   
	
	/** getter for name     
	* @return     */    
	public String getName(){
	    return name;    
	}

	/** setter for private price     
	* @param price     */    
	public void setPrice(double price) {
		this.price=price;
	}    

	/** getter for price     
	* @return     */    
	public double getPrice() {        
		return price;
	}    

	public int getQuantity(){        
		return quantity;   
	}    

	public void setQuantity(int quantity){
	    this.quantity = quantity;   
	}    

	public int getCatalogNumber(){      
		return this.catalogNumber;   
	}    

	public void setCatalogNumber(int catalogNumber) {
		this.catalogNumber = catalogNumber;
	}    

	/** Override toString:     
	* @returns Object description in this format:     
	* "Regular Item{name='Item name', catalogNumber=1234, quantity=5, price=9.99}"     */    
	@Override    
	public String toString() {        
		return "Regular Item{name=" + name + ", catalogNumber=" + catalogNumber + ", quantity="+quantity+ ", price=" + price + "}";
	}

}

class OnSaleItem extends Item{
	/** private instance variable, used for discount percentage */    
	private double discount;    

	/** public constructor for OnSaleItem     
	* @param name     
	* @param quantity     
	* @param catalogNumber     
	* @param price     
	* @param discount     
	*     
	* - Calls Super class constructor by passing name, quantity, catalogNumber, price
	* - it will assign the price after deducting(minus) discount from the price     
	* - assigns discount  */    
	
	
	public OnSaleItem(String name,int quantity,int catalogNumber,double price, double discount) { 
		super(name, quantity, catalogNumber, price-discount);
		this.discount = discount; 
	}    
	
	/** getter for discount     
	* @return     */    
	public double getDiscount() {      
		return this.discount;    
	}    

	/** setter for discount     
	* @param discount */    
	public void setDiscount(double discount) {   
		this.discount = discount;
	}    

	/** overrides toString from Item:     
	* @returns Object description in this format:     
	* "OnSaleItem{discount=20.0%, name=ItemName, price=100.45}"  */    
	@Override    
	public String toString() {        
	return "OnSaleItem{discount=" + discount + "% , name=" + getName() + ", price=" + getPrice() + "}";    
	}

}

class TJMaxx {
	/** Private lists to hold regular Item objects     
	 * and OnSaleItem objects that represent items that sell in TJMaxx     */ 
	private List<Item> regularItems;    
	private List<OnSaleItem> onSaleItems;    
	
	/** Public no-args constructor - Instantiates regularItems and onSaleItems lists  
	 *  as new ArrayList     */    
	public TJMaxx() { 
		this.regularItems = new ArrayList<>(); 
		this.onSaleItems = new ArrayList<>();
	}
		
	
	/** adds an item object to regularItems list     
	 *  @param item     */    
	public void addRegularItem(Item item) {    
		regularItems.add(item);
	}    
	
	/** adds OnSaleItem object to onSaleItems list     
	 *  @param item     */    
	public void addOnSaleItem(OnSaleItem item) {    
		onSaleItems.add(item);
	}    
	
	/** getter for regularItems     
	 *  @return     */    
	public List<Item> getRegularItems() {        
		return regularItems;    
	}    
	
	/** getter for onSaleItems     
	*   @return     */    
	public List<OnSaleItem> getOnSaleItems() {        
        return onSaleItems;    
    }    
	
	/** return count of regularItem object     
	 * @return     */    
	public int regularItemsCount() {            
		return regularItems.size();    
	}    
	
	/** returns count of onSaleItems in TJ Maxx
	 * @return     */    
	public int onSaleItemsCount() {        
		return onSaleItems.size();    
	}    
	
	/** returns the name of each item in TJ Maxx starting
		from regular item then onSaleItems     
	* @return     */    
	public List<String> getAllItemNames() {       
		List<String> newList = new ArrayList<>();
		for(int i=0; i<regularItems.size(); i++) {
			newList.add(regularItems.get(i).getName());
		}
		for(int i=0; i<onSaleItems.size(); i++) {
			newList.add(onSaleItems.get(i).getName());
		}
		return newList;
	}    
	
	/** gets catalog number and returns price for the item     
        it will search for the item both regularItems and onsaleonSaleItems 
        @param catalogNumber     
        @returns 0.0 if product cannot be found with that catalognumber     */    
	public double getItemPrice(int catalogNumber)    {        
		for(Item regularItem : regularItems) {
			if(regularItem.getCatalogNumber()==catalogNumber)	{
				return regularItem.getPrice();
			}
		}
		for(OnSaleItem onSale : onSaleItems) {
			if(onSale.getCatalogNumber()==catalogNumber)	{
				return onSale.getPrice();
			}
		}
		return 0.0;    
	}    
	
	/** accepts a name then searches among onSaleItems. Once it finds, the method
	 *  will return that OnSaleItem object     
	 *  @param name     
	 *  @return     */    
	public OnSaleItem getOnSaleItem(String name)    {        
		for(OnSaleItem onSale : onSaleItems) {
			if(onSale.getName()==name)	{
				return onSale;
			}
		} 
		return null;
	}
    /** removes the item with matching catalogNumber from both regularItems and
     *  onSaleItems. Does nothing if not found     
     *  @param catalogNumber     */    
	public void removeItem(int catalogNumber) { 
		for(Item regularItem : regularItems) {
			if(regularItem.getCatalogNumber()==catalogNumber)	{
				regularItems.remove(regularItem);
			}
		}
		for(OnSaleItem onSale : onSaleItems) {
			if(onSale.getCatalogNumber()==catalogNumber)	{
				onSaleItems.remove(onSale);
			}
		}		
	}    
	
	/** - it accepts a catalog number and finds that item among regularItems 
	 * and onSaleItems. 
	 * 	if it finds the item:
	 *    -decrease the count of the Item by 1     
	 *    - if count reaches 0 after decrementing then remove the 
	 *    product(call removeItem method)     
	 *    * @param catalogNumber     */    
	public void buyItem(int catalogNumber) {   
		
		for(Item regularItem : regularItems) {
			if(regularItem.getCatalogNumber()==catalogNumber)	{
				regularItem.setQuantity(regularItem.getQuantity()-1);
			}
			if(regularItem.getQuantity()==0) {
				regularItems.remove(regularItem);				
			}
		}
		for(OnSaleItem onSale : onSaleItems) {
			if(onSale.getCatalogNumber()==catalogNumber)	{
				onSale.setQuantity(onSale.getQuantity()-1);
			}
			if(onSale.getQuantity()==0) {
				regularItems.remove(onSale);				
			}
		}	
		
		
	}
}

