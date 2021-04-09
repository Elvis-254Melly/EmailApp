package com.codeWithMelly;

import java.util.Scanner;

private class Email {
    private String firstName;
    private String lastName;
     private    String password;
      private  String department;
       private int mailboxCapacity = 500;
         private String email;
         private int defaultPasswordLength =10;
         private String alternateEmail;
         private String companySuffix = "Kcompany.com";

        //constructor to receive the firstName an the lastName

        public Email(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;

            //calling for a method asking for the department - return the department
            this.department = setDepartment();


            //call a method that returns a random password
            this.password = randomPassword(defaultPasswordLength);
            System.out.println("Your password is:" + this.password);
        }

        //Ask for the department

    private String setDepartment() {
        System.out.println("New worker:" + firstName + ". department Codes :\n1 for sales \n2 for development \n3 for accounting \n0 for none\n enter department codes");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "Dev";
        } else if (depChoice == 3) {
            return "Acct";
        } else {return "";}
    }

        //Generate a random password

    private String randomPassword(int length) {
            String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$";
            char[] password = new char [length];
            for (int i = 0;i<length;i++) {
                int rand = (int) (Math.random()* passwordSet.length());
                password[i] = passwordSet.charAt(rand);
            }

           //combine elements to generate email
           email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "."  + companySuffix;

            return new String (password);

    }


        //set the mailbox capacity


    public void setMailboxCapacity(int capacity) {
            this.mailboxCapacity = capacity;
    }


        //set the alternate email

    public void setAlternateEmail(String altEmail) {
            this.alternateEmail = altEmail;
    }


        //change the password
    public void changePassword(String password) {
            this.password = password;
    }
    public int getMailboxCapacity() {return mailboxCapacity;}
    public String getAlternateEmail() {return alternateEmail;}
    public String getPassword(){return password;}
    public String showInfo() {
            return "DISPLAY NAME :" + firstName + "" + lastName +
                    "\nCOMPANY " + companySuffix +
                    "\nMAILBOX CAPACITY :" + mailboxCapacity + "mb";

    }

    }
