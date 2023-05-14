package emailApp;

import java.util.Scanner;

public class Email {
private String firstName;
private String lastName;
private String password;
private String department;
private String email;
private int mailboxCapacity=500;
private int defaultPasswordLength=8;
private String alternatemail;
private String companySuffix="musturcompany.com";
//constructor to receive the first and lastname
public Email(String firstName,String lastName) {
	this.firstName=firstName;
	this.lastName=lastName;
	//System.out.println("email created:"+this.firstName+" "+this.lastName);
	//call the method asking for the department and return the department
	this.department=setDepartment();
	//System.out.println("Department:"+this.department);
	//call a method that return ransom password
	this.password=generatePassword(defaultPasswordLength);
	System.out.println("your password is:"+this.password);
	//combine elements to generate email
	email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
	//System.out.println("your email is:"+email);
}
//ask for the department
private String setDepartment() {
	System.out.println("Enter the department\n1 for sales\n2 for devolpment\n3 for Accounting\n0 for none\n enter the department code");
	Scanner sc=new Scanner(System.in);
	int depchoice=sc.nextInt();
	if(depchoice==1) {
		return "sales";
	}
	else if(depchoice==2){
		return "dept";
	}
	else if(depchoice==3){
		return "account";}

	else {
		return "";
	}
}

//generate the random password
private String generatePassword(int length) {
	String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXY0123456789@#$%";
	char[] password=new char[length];
	for(int i=0;i<length;i++) {
		int rand=(int)(Math.random()*passwordSet.length());
		password[i]=passwordSet.charAt(rand);
	}
	return new String(password);
}

//set the mailboxcapacity
public void setmailBoxCapacity(int capacity) {
	this.mailboxCapacity=capacity;
}


//set the alternate mail
public void setAlternateEmail(String altmail) {
	this.alternatemail=altmail;
}

//change the pass word
public void changePassword(String password) {
	this.password=password;
}
public int getMailBoxCapacity() {
	return mailboxCapacity;
}
public String getAlternateemail() {
	return alternatemail;
}
public String getPassword() {
	return password;
	
}
public String showinfo() {
	return "DISPLAY NAME:"+firstName+"."+lastName+
			"\nDisplay email:"+email+
			"\nMailBoxCapacity:"+mailboxCapacity+"ab";
			}
}
