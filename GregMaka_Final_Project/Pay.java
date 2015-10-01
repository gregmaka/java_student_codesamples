/* Greg Maka
   CIS163AA - Java Programming: Level I - Class # 14239
   MEID: GRE2150350
*/

import java.util.Scanner;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Pay
	{
		//fields to calculate pay
		public static int skillLevel;
		public static double hoursWorked;
		public static final double LEVEL1_PAY = 17.00;
		public static final double LEVEL2_PAY = 20.00;
		public static final double LEVEL3_PAY = 22.00;
		public static final double INVALID = 0;
      
		//fields to display hours worked and calculate pay
		public static double overtimeHours;
		public static double regularHours;
		public static double regularPayRate;
		public static double overtimePayRate;
		public static double regularPay;
		public static double grossPay;
		public static double overtimePay;
		public static Scanner enter = new Scanner(System.in);
		public static int insuranceSelections;
		public static double medical;
		public static double dental;
		public static double disability;
		public static double retirement;
		public static double retirementPremium;
		public static final double MEDICAL_PAY = 32.50;
		public static final double DENTAL_PAY = 20.00;
		public static final double DISABILITY_PAY = 10.00;
		public static final double RETIREMENT_RATE = 0.03;
		public static double insurancePremiums;
		public static double netPay;
      
      
		public static void main(String[] args)
			{
				setPayRates();
				calculateHoursWorked();
				calculatePay();
				setInsuranceSelections();
				calculateNetPay();
				displayDetail();
			}
		//method to associate skillLevel and set pay rate
		public static void setPayRates()
			{
				System.out.println("What is your skill level?");
				System.out.println("-----------------");
				System.out.println("1 - Level 1");
				System.out.println("2 - Level 2");
				System.out.println("3 - Level 3");
				System.out.println("-----------------");
            
				skillLevel = enter.nextInt();
            
            do{
            switch (skillLevel)
					{
						case 1:
							regularPayRate = LEVEL1_PAY;
							break;
						case 2:
							regularPayRate = LEVEL2_PAY;
							break;
						case 3:
							regularPayRate = LEVEL3_PAY;
							break;
						default:
							regularPayRate = INVALID;
							System.out.println("INVALID Selection");
							setPayRates();
					}
				}while(skillLevel < 1 || skillLevel > 3);
				overtimePayRate = regularPayRate * 1.5;
			}
         
		//calculates regular and overtime hours worked.
		public static void calculateHoursWorked()
			{
				System.out.println("How many hours did you work last week?");
				hoursWorked = enter.nextInt();
				if (hoursWorked < 41)
					{
						regularHours = 40;
					}
				else
					{
						overtimeHours = hoursWorked - 40;
						regularHours = hoursWorked - overtimeHours;
					}
			}
		//calculate gross pay
		public static void calculatePay()
			{
				regularPay = regularHours * regularPayRate;
				overtimePay = overtimeHours * overtimePayRate;
				grossPay = regularPay + overtimePay;
			}
		//select insurance and calculate total insurance payment
		public static void setInsuranceSelections()
			{
				int selectMedical = JOptionPane.showConfirmDialog(null, "Do you want medical insurance?","Continue?",JOptionPane.YES_NO_OPTION);
             
             if (selectMedical == JOptionPane.YES_OPTION){
                  medical = MEDICAL_PAY;
                 }
                 
			   int selectDental = JOptionPane.showConfirmDialog(null, "Do you want dental insurance?","Continue?",JOptionPane.YES_NO_OPTION);
				   
               if (selectDental == JOptionPane.YES_OPTION){
                  dental = DENTAL_PAY;
                 }
                 
            int selectDisability = JOptionPane.showConfirmDialog(null, "Do you want long term disability insurance?","Continue?",JOptionPane.YES_NO_OPTION);
               
               if (selectDisability == JOptionPane.YES_OPTION){
                  disability = DISABILITY_PAY;
                 }
             
             if (insuranceSelections == 4)
					{
						getSkillLevel();
					}
				if (skillLevel == 3)
					{
						retirement = RETIREMENT_RATE;
						retirementPremium = grossPay * retirement;
					}
				else
					{
						retirementPremium = 0;
					}
				insurancePremiums = medical + dental + disability + retirementPremium;
			

         }
		//calculate net pay
		public static void calculateNetPay()
			{
				netPay = grossPay - insurancePremiums;
			}
		public static int getSkillLevel()
			{
				return skillLevel;
			}
		public static void displayDetail()
			{
				System.out.println("Hourly Pay Rate: " + String.format( "%.2f", regularPayRate ));
				System.out.println("Overtime Pay Rate: " + String.format( "%.2f", overtimePayRate ));
				System.out.println("Regular Hours Worked: " + String.format( "%.2f", regularHours ));
				System.out.println("Overtime Hours Worked: " + String.format( "%.2f", overtimeHours ));
				System.out.println("Regular Pay: " + String.format( "%.2f", regularPay ));
				System.out.println("Overtime Pay: " + String.format( "%.2f", overtimePay ));
				System.out.println("Gross Pay: " + String.format( "%.2f", grossPay ));
				System.out.println("Medical Premium: " + String.format( "%.2f", medical ));
				System.out.println("Dental Premium: " + String.format( "%.2f", dental ));
				System.out.println("Disability Premium: " + String.format( "%.2f", disability ));
				System.out.println("Retirement Rate Percentage: " + String.format( "%.2f", retirement ));
				System.out.println("Retirement Premium: " + String.format( "%.2f", retirementPremium ));
				System.out.println("Total Insurance Payments " + String.format( "%.2f", insurancePremiums ));
				System.out.println("Net Pay: " + String.format( "%.2f", netPay ));
            JOptionPane.showMessageDialog(null, "Your gross pay is $"  + String.format( "%.2f", medical ));
			}
	}
