
/**
 * Write a description of class FullTimeStaff here.
 *
 * @author (Arjun Katwal)
 * ID (19031588)
 */
public class FullTimeStaffHire extends StaffHire
{//instance variables
    private int salary;
    private int workingHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;
    public FullTimeStaffHire(int vacancyNumber, String designation, String jobType, int salary, int workingHour)
    {
        super(vacancyNumber, designation, jobType);
        this.salary = salary;
        this.workingHour = workingHour;
        staffName = "";
        joiningDate = "";
        qualification = "";
        appointedBy = "";
        boolean joined = false;
    }
    //getter method for returning the values
    public int getSalary()
    {
        return salary;
    }

    public int getWorkingHour()
    {
        return workingHour;
    }

    public String getStaffName()
    {
        return staffName;
    }

    public String getJoiningDate()
    {
        return joiningDate;
    }

    public String getQualification()
    {
        return qualification;
    }

    public String getAppointedBy()
    {
        return appointedBy;
    }

    public boolean getJoined()
    {
        return joined;
    }

    public void setSalary(int newsalary)
    {
        if (getJoined() == false){
            this.salary = newsalary;
        }
        else
        {
            System.out.println("The Staff is already appointed, so the salary cannot be changed.");
        }
    }

    public void setworkingHour(int newworkingHour)
    {
        this.workingHour = newworkingHour;
    }
    //this method takes four different parameters
    public void HireFullTimeStaff(String staffName, String joiningDate, String qualification, String appointedBy)
    {
        if (getJoined() == true)
        {
            System.out.println("Staff Name: "+getStaffName()+ "\nJoining Date: "+getJoiningDate());
        }
        else
        {
            this.staffName = staffName;
            this.joiningDate = joiningDate;
            this.qualification = qualification;
            this.appointedBy = appointedBy;
            this.joined = true;
        }
    }

    public void display()
    {
        super.display();//it is a method which display the display class from class parent
        if (getJoined() == true)
        {
            System.out.println("Name of the Staff:"+getStaffName()+"\nSalary of the staff: "+getSalary()+"\nWorking hour of the staff: "+getWorkingHour()+"\nQualification of the staff: "+getQualification()+"\nAppointedBy: "+getAppointedBy());
        }
    } 
}

