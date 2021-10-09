/**
 * Date represent the years,months and days.
 *
 * Date has constructor, accesser, mutator, help method and toString method
 * to make  client class call date class method.
 * 
 *
 * @author Changli Zeng Student
 * @email zengc203@potsdam.edu
 * @course CIS 203 Computer Science II
 * @assignment 0.2
 * @due 02/06/2020
 */		


public class Date {
    private int day;
    private int month;
    private int year;
	 
/** 
 * Creates date.
 * 
 * Creates date with specific years,months and days.
 * 
 * @param newYears the specific years.
 * @param newMonths the specific months.
 * @param newDays the specific days.
 */
    public Date(int newYears,int newMonths,int newDays) {
    	this.year = newYears; 
    	this.month = newMonths;
        this.day = newDays;
	 }
	 
 /** 
   * The default constructor
   * 
   * The default constructor set the years, month and date to default.
   */
    public Date() {
		 this(2003,1,1);
	 }
	 
	 
/** Gets the days of the date.
 * 
 * Get the day with specific day was passing in to constructor.
 * 
 * @return A int value representing the month of date.    
 */
	 public int getDay() {
		 return this.day;
	 }
	
/** Gets the months of the date.
 * 
 * Get the month with specific month was passing in to constructor.
 * 
 * @return A int value representing the month of date.    
 */
	 public int getMonth() {
		 return this.month;
	 }
	 
/** Gets the years of the date.
 * 
 * Get the month with specific month was passing in to constructor.
 * 
 * @return A int value representing the year of date.   
 */
	 public int getYear() {
		 return this.year;
	 }
	 
/** 
 * Sets the Date.
 * 
 * Sets the date with specific year, month and date.
 * 
 * @pre can only be int.
 * @post can only be int.
 * @param year The year of date.
 * @param month The month of date.
 * @param date The day of date.
 */
	 public void setDate(int year, int month, int date) {
		 this.year = year;
	     this.month = month;
	     this.day = date;
	 }
	 
/** 
 * The day move forward.
 * 
 * The day move forward by adding amount of day.
 * 
 * @param day The day can be add to the date.
 */
	 public void addDays(int day) {
		 int daysInMonth = 0;
	     int newDay = 0;
	     if (this.month <= 7 && this.month % 2 == 1){
	         daysInMonth= 31;
	     }else if (this.month >= 8 && this.month % 2 == 0) {
	    	 daysInMonth= 31;
	     }else if (this.month == 2){
	    	 daysInMonth= 28;
	     }else {
	    	 daysInMonth= 30;
	     }
	      
	     if(this.month == 12 && this.day + day > daysInMonth){
	    	 this.day = day-daysInMonth + this.day;
	         month = 1;
	         year ++;
	     }else if(this.month <= 12 && this.day + day <= daysInMonth){
	         this.day += day;
	     }else{
	         this.day = day-daysInMonth + this.day;
	         month ++;
	         year ++;
	     }
	 }

/** 
 * The day move forward.
 *
 * The day move forward by adding amount of week.
 *
 * @param week The week can be add to the date.
 */
	 public void addWeek(int week) {
		  this.day = this.day+week*7;
	 }
	 
/** 
 * report back all fields state.
 *
 * @return all the fields state.
 */
	 public String toString() {
		 return  this.month + "/" + this.day + "/" + this.year;
	 }
 }

