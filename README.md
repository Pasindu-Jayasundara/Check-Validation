# Validation
Developed for verifying Email Address, Password, Name, Mobile numbers

#### Features
1) Validate Email Address
2) Validate Mobile Number
3) Validate Name
4) Validate Password

#### Methods
1) >.isValidEmail(email);
2) >.isValidMobile(mobile);
3) >.isValidName(name);
4) >.isValidPassword(password);

#### How to Use
1) Download the .jar file and add it to your project
2) Import Library:
   
   ```java
   
   import com.Check;
   
   ```

3) Use Methods: </br></br>
    i) .isValidEmail(email) </br>
    > This method can be used to determine whether email address is in the correct format or not
    
   ```java
   
   boolean validEmail = Check.isValidEmail(emailAddress);
   
   ```
    ii) .isValidMobile(mobile); </br>
    > This method can be used to determine whether mobile number is in the correct format or not
    
   ```java
   
   boolean validMobile = Check.isValidMobile(mobileNumber);
   
   ```
    iii) .isValidName(name); </br>
    > This method can be used to determine whether name is in the correct format or not
    
   ```java
   
   boolean validName = Check.isValidName(name);
   
   ```
    iv) .isValidPassword(password); </br>
    > This method can be used to determine whether password is in the correct format or not. </br>Req: Alphanumeric, Lowercase,Uppercase, Special Characters, 8 characters
    
   ```java
   
   boolean validPassword = Check.isValidPassword(password);
   
   ```
  #### Outputs:
  1) true -> Correct format
  2) false -> Wrong format

#### Example Code:

```java

import com.Check;

public class Test {

    public static void main(String[] args) {
        
        boolean validEmail = Check.isValidEmail("");
        boolean validMobile = Check.isValidMobile("");
        boolean validName = Check.isValidName("");
        boolean validPassword = Check.isValidPassword("");

    }
    
}


```
 
