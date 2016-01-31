package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 4
 *  returns their name and a
 *  modified string 
 *  
 *  @author Bob
 *  @version 1.1
 */
public class Person4 {
  /** Holds the persons real name */
  private String name;
    /**
     * The constructor, takes in the persons
     * name
     * @param pname the person's real name
     */
  public Person4(String pname) {
    name = pname;
  }
    /**
     * This method should return a string
     * where each character is 1 greater 
     * than its previous value.  So
     * given "abc123" it should return
     * "bcd234".
     *
     * @param input the string to be modified
     * @return the modified string
     */
    private String calc(String input) {
      //Person 4 put your implementation here
      char[] charArray = input.toCharArray();
      for (int i = 0; i < charArray.length; i++) {
        if (charArray[i] == '9') {
          charArray[i] = '0';
        } else if (charArray[i] == 'z') {
          charArray[i] = 'a';
        } else if (charArray[i] == 'Z') {
          charArray[i] = 'A';
        } else {
          charArray[i] = (char)(((int)charArray[i] + 1));
        }
      }
      return (new String(charArray));
    }
    
    /**
     * Return a string rep of this object
     * that varies with an input string
     *
     * @param input the varying string
     * @return the string representing the 
     *         object
     */
    public String toString(String input) {
      return name + calc(input);
    }

}

