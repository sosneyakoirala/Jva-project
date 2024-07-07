 
/**
 * Write a description of class PartTimeStaff here.
 *
 * @author (Arjun Katwal)
 * ID(ID (19031588))
 */
public class PartTimeStaffHire extends StaffHire
{//instance variables
    private int workingHour;
    private int wagesPerHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean joined;
    private boolean terminated;
    public PartTimeStaffHire (int vacancyNumber, String designation, String jobType, int workingHour, int wagesPerHour, String shifts)
    {
        super(vacancyNumber, designation, jobType);
        this.workingHour = workingHour;
        this.wagesPerHour = wagesPerHour;
        this.shifts = shifts;
        staffName = "";// assigned empty Strings
        joiningDate = "";
        qualification = "";
        appointedBy = "";
        joined = false;
        terminated = false;
    }
    //getter method for returning the values
    public int getworkingHour()
    {
        return workingHour;
    }

    public int getwagesPerHour()
    {
        return wagesPerHour;
    }

    public String getstaffName()
    {
        return staffName;
    }

    public String getjoiningDate()
    {
        return joiningDate;
    }

    public String getqualification()
    {
        return qualification;
    }

    public String getappointedBy()
    {
        return appointedBy;
    }

    public String getshifts()
    {
        return shifts;
    }

    public boolean getjoined()
    {
        return joined;
    }

    public boolean getterminated()
    {
        return terminated;
    }

    public void setshifts(String newshifts)
    {
        this.shifts = newshifts;
        if(getjoined() == true)
        {
            System.out.println("The staff is already appointed.");
        }
    }
    //a method that accepts four various parameters public void PartTimeStaff(String staffName, String joiningDate, String qualification, String appointedBy)
    public void HirePartTimeStaff(String staffName, String joiningDate, String qualification, String appointedBy)
    {
        if (getjoined() == true)
        {
            System.out.println("The Staff is already appointed: "+getstaffName()+ "\nThe Joining Date: "+getjoiningDate());
        }else
        {
            this.staffName = staffName;
            this.joiningDate = joiningDate;
            this.qualification = qualification;
            this.appointedBy = appointedBy;
            this.joined = true;
            this.terminated = false;
        }
    }

    public void stafftermination()
    {
        if (getterminated() == true)
        {
            System.out.println("The staff is already terminated.");
        }
        else
        {
            this.staffName = "";
            this.joiningDate = "";
            this.qualification = "";
            this.appointedBy = "";
            this.joined = false;
            this.terminated = true;
        }
    }

    public void display()
    {
        super.display();
        if (getjoined() == true)
        {
            System.out.println("The Staff Name: "+getstaffName()+ "\nThe Wages Per Hour: "+getwagesPerHour()+ "\nThe Working Hour: "+getworkingHour()+ "\nThe Joining Date: "+getjoiningDate()+ "\nThe Qualification: "+getqualification()+ "\nShifts: "+getshifts()+ "\nAppointed By: "+getappointedBy()+ "\nIncome Per Day: "+(wagesPerHour*workingHour));
        }
    }

}
