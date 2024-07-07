
/**
 * Write a description of class StaffHire here.
 *
 * @author (Arjun Katwal)
 * ID(ID (19031588))
 */
public class StaffHire
{//instance variables
    private int vacancyNumber;
    private String designation;
    private String jobType;
    public StaffHire(int vacancyNumber, String designation, String jobType)
    {
        this.vacancyNumber = vacancyNumber;
        this.designation = designation;
        this.jobType = jobType;
    }
    //getter methd for returning the value
    public int getVacancyNumber()
    {
        return vacancyNumber;
    }

    public String getDesignation()
    {
        return designation;
    }

    public String getJobType()
    {
        return jobType;
    }
    //setter method for setting new value
    public void setVacancyNumber(int vacancyNumber)
    {
        this.vacancyNumber = vacancyNumber;
    }

    public void setDesignation(String designation)
    {
        this.designation = designation;
    }

    public void setJobType(String jobType)
    {
        this.jobType =  jobType;
    }
    //print the statement with given values
    public void display()
    {
        System.out.println("Vacancy Number: "+ vacancyNumber);
        System.out.println("Designation: "+ designation);
        System.out.println("JobType: "+ jobType);

    
}
}
