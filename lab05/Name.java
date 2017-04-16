package p1;

/**
 * Name.
 * 
 * @author Doosha
 * @version 12/02/2017
 */
public class Name {
    private String firstName;
    private String middleName;
    private String lastName;
    
    /**
     * Constructs an object of type Name.
     * @param first
     *            the first name
     * @param middle
     *            the middle name
     * @param last
     *            the last name
     */
    public Name (String first, String middle, String last) {
        firstName = first;
        middleName = middle;
        lastName = last;
    }
    
    /**
     * Returns first name of person.
     * @return firstName as a String
     */
    public String getFirst(){
        return firstName;
    }
    
    /**
     * 
     * @param newFirstName
     */
    public void setFirst(String newFirstName) {
        if (newFirstName != null && newFirstName.trim().length() > 0){
            this.firstName = newFirstName;
        }
    }
    
    /**
     * Returns middle name of person.
     * @return middleName as a String
     */
    public String getMiddle(){
        return middleName;
    }
    
    /**
     * 
     * @param newMiddleName
     */
    public void setMiddle(String newMiddleName) {
        if (newMiddleName != null && newMiddleName.trim().length() > 0){
            this.middleName = newMiddleName;
        }
    }
    
    /**
     * Returns last name of person.
     * @return lastName as a String
     */
    public String getLast(){
        return lastName;
    }
    
    /**
     * 
     * @param newLastName
     */
    public void setLast(String newLastName) {
        if (newLastName != null && newLastName.trim().length() > 0){
            this.lastName = newLastName;
        }
    }
    
    /**
     * Returns the full name of person.
     * @return fullName as a String
     */
    public String firstMiddleLast() {
        return (firstName + " " + middleName + " " + lastName);
    }
    
    /**
     * Returns full name of person in reverse order.
     * @return reverseName as a String
     */
    public String lastFirstMiddle() {
        return (lastName + " " + firstName + " " + middleName);

    }
    
    /**
     * Compares the two names entered by user.
     * @param otherName
     * @return boolean
     */
    public boolean equals(Name otherName){
        return this.firstName.equalsIgnoreCase(otherName.firstName)
                && this.middleName.equalsIgnoreCase(otherName.middleName)
                && this.lastName.equalsIgnoreCase(otherName.lastName);
    }
    
    /**
     * Pulls initials from each name and converts to upper case.
     * @return initials as a String
     */
    public String initials(){
        String a;
        String b;
        String c;
        a = firstName.substring(0, 1);
        b = middleName.substring(0, 1);
        c = lastName.substring(0, 1);
        
        return a.toUpperCase() + "." 
             + b.toUpperCase() + "."
             + c.toUpperCase() + ".";
    }
    
    /**
     * Returns the length of the person's name, excluding spaces.
     * @return length as an int
     */
    public int length(){
        return firstName.length() + middleName.length()
               + lastName.length();
    }
    
    /**
     * @return description as a String
     */
    public String toString(){
        String fullName = (firstName + " " + middleName + " " + lastName);
        return ("Name = " + fullName);
    }
}
